/**
 * SubjectController class; requires the Person, Student, Teacher,
 * and Subject classes + StudentController + TeacherController
 *
 * @author Marcos
 **/
import java.util.*;
import java.io.*;

public class SubjectController
{

    public static ArrayList<Subject> subjects = new ArrayList<Subject>();

    public static boolean isFound(String name)
    {
        boolean found = false;
        for (Subject s : subjects)
        {
            String subjectName = s.getSubjectName();
            if (name.equalsIgnoreCase(subjectName))
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void addSubject() throws IOException
    {
        StudentController.load();
        TeacherController.load();
        String subjectName = IBIO.input("Enter subject name: ");
        // validation: subjectName must be unique and new, as it's the key.
        while (subjectName.length() < 3 || isFound(subjectName))
        {
            subjectName = IBIO.input("Enter VALID subject name: ");
        }
        char subjectLevel = IBIO.inputChar("Enter level (S=SL; H=HL): ");
        subjectLevel = Character.toUpperCase(subjectLevel);
        while (subjectLevel != 'S' && subjectLevel != 'H')
        {
            subjectLevel = IBIO.inputChar("Enter VALID level (S=SL; H=HL): ");
            subjectLevel = Character.toUpperCase(subjectLevel);
        }
        String classroom = IBIO.input("Enter classroom: ");
        while (classroom.length() < 5)
        {
            classroom = IBIO.input("Enter VALID classroom: ");
        }
        int teacherID = IBIO.inputInt("Enter teacher ID: ");
        while (TeacherController.searchByID(teacherID) == -1)
        {
            teacherID = IBIO.inputInt("Teacher ID not found. Re-enter ID: ");
        }
        System.out.println("Add students to the subject/class. ID=0 Ends");
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.clear();
        int studentID = -1;

        ClassList:
        while (studentID != 0) // && checking for full class may also be required!
        {
            studentID = IBIO.inputInt("Enter student ID: ");
            if (studentID != 0)
            {
                while (isInList(studentList, studentID)
                        || StudentController.searchByID(studentID) == -1)
                {
                    studentID = IBIO.inputInt("Invalid or duplicate student ID. Re-enter ID: ");
                    if (studentID == 0)
                    {
                        break ClassList;
                    }
                }
                if (!isInList(studentList, studentID))
                {
                    int studentIndex = StudentController.searchByID(studentID);
                    Student student = StudentController.students.get(studentIndex);
                    studentList.add(student);
                    System.out.println("\tClass size: " + studentList.size());
                }
            }
        }
        int teacherIndex = TeacherController.searchByID(teacherID);
        Teacher teacher = TeacherController.teachers.get(teacherIndex);
        int subjectHours = 3;
        if (subjectLevel == 'H')
        {
            subjectHours = 4;
        }
        int updatedHours = teacher.getHours() + subjectHours;
        teacher.setHours(updatedHours);
        TeacherController.save();
        Subject newSubject = new Subject(subjectName, subjectLevel, classroom, teacher, studentList);
        subjects.add(newSubject);
        System.out.println(newSubject.getSubjectName() + " added.\n");
        //sort();
        save();
    }

    public static boolean isInList(ArrayList<Student> list, int studentID)
    {   // returns true if the student id is present in the list, false otherwise
        // used to avoid duplicates in a class
        boolean found = false;
        for (Student s : list)
        {
            int currentID = s.getId();
            if (studentID == currentID)
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void listSubjects()
    {
        for (Subject s : subjects)
        {
            System.out.println(s + "\n");
        }
    }


    public static void save() throws IOException
    {
        FileOutputStream subjectsFOS = new FileOutputStream("subjects.ser");
        ObjectOutputStream subjectOOS = new ObjectOutputStream(subjectsFOS);
        subjectOOS.writeObject(subjects);
        subjectOOS.close();
        subjectsFOS.close();
        System.out.println("\t\t\t\t\tSubjects file saved."); // optional
    }

    public static void load() throws IOException
    {
        File subjectsFile = new File("subjects.ser");
        if (!subjectsFile.exists())
        {
            subjectsFile.createNewFile();
            System.out.println("Subjects file not found. Creating it.");
            addSubject();
        }
        try {
            FileInputStream subjectFIS = new FileInputStream("subjects.ser");
            ObjectInputStream subjectOIS = new ObjectInputStream(subjectFIS); //read mode
            subjects = (ArrayList<Subject>) subjectOIS.readObject();
            subjectOIS.close();
            subjectFIS.close();
        } catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("\t\t\t\t\tSubjects file loaded."); // optional
    }

    public static int indexOf(String subjectName)
    {   // returns the index in the arraylist of the subjectName
        for (int i = 0; i < subjects.size(); i++)
        {
            String currentSubjectName = subjects.get(i).getSubjectName();
            if (currentSubjectName.equalsIgnoreCase(subjectName))
            {
                return i;
            }
        } // end for
        return -1; // if not found, -1 signals error/not found
    }

    public static boolean confirm()
    {
        char temp = ' ';
        String answer = IBIO.input("Are you sure (Y/N)? ");
        answer = answer.toLowerCase();
        if (answer.length() > 0)
        {
            temp = answer.charAt(0);
        }
        while (answer.length() < 1 || (temp != 'y' && temp != 'n'))
        {
            answer = IBIO.input("Please answer Y or N / y or n: ");
            answer = answer.toLowerCase();
            System.out.println(answer.length());
            if (answer.length() > 0)
            {
                temp = answer.charAt(0);
            }
        }
        return (temp == 'y');
    }

    public static void delete(String subjectName) throws IOException
    {
        for (int i = 0; i < subjects.size(); i++)
        {
            Subject currentSubject = subjects.get(i);
            String currentSubjectName = currentSubject.getSubjectName();
            if (currentSubjectName.equalsIgnoreCase(subjectName))
            {
                System.out.print("About to delete " + currentSubjectName + " -- ");
                if (confirm() == true)
                {
                    char subjectLevel = currentSubject.getSubjectLevel();
                    int teacherID = currentSubject.lecturer.getId();
                    int teacherIndex = TeacherController.searchByID(teacherID);
                    Teacher teacher = TeacherController.teachers.get(teacherIndex);
                    int subjectHours = 3;
                    if (subjectLevel == 'H')
                    {
                        subjectHours = 4;
                    }
                    int updatedHours = teacher.getHours() - subjectHours;
                    teacher.setHours(updatedHours);
                    TeacherController.save();
                    subjects.remove(i);
                    System.out.println(currentSubjectName + " deleted.");
                    save();
                } // end if-confirm
            }   // end if-check for subject name
        } // end for
    }

    public static void listSubjects(String subjectName)
    {   // given a subject name, list all subjects (starting) with that name
        subjectName = subjectName.toLowerCase();
        String currentName;
        for (Subject s : subjects)
        {
            currentName = s.getSubjectName().toLowerCase();
            if (currentName.startsWith(subjectName))
            {
                System.out.println(s);
            }
        }
    }

    public static void edit(String subjectName) throws IOException
    {    // edit existing subject data
        StudentController.load();
        TeacherController.load();
        int editIndex = indexOf(subjectName);
        if (editIndex == -1)
        {
            System.out.println(subjectName + " not found. Nothing to edit.");
            return; // exit method if the subject name does not exist
        }
        /* We will avoid editing subject name as it's the key field 
        String newSubjectName = IBIO.input("Enter new subject name: ");
        // validate: subjectName must be unique and new --> isFound()
        while (newSubjectName.length() < 3 || isFound(newSubjectName))
        {
            newSubjectName = IBIO.input("Enter VALID subject name: ");
        } */
        char newLevel = IBIO.inputChar("Enter new level (S=SL; H=HL): ");
        newLevel = Character.toUpperCase(newLevel);
        while (newLevel != 'S' && newLevel != 'H')
        {
            newLevel = IBIO.inputChar("Enter VALID new level (S=SL; H=HL): ");
        }
        String newClassroom = IBIO.input("Enter classroom: ");
        while (newClassroom.length() < 5)
        {
            newClassroom = IBIO.input("Enter VALID new classroom: ");
        }
        int teacherID = IBIO.inputInt("Enter teacher ID: ");
        while (TeacherController.searchByID(teacherID) == -1)
        {
            teacherID = IBIO.inputInt("Teacher ID not found. Re-enter ID: ");
        }
        System.out.println("Add students to the subject/class. ID=0 Ends");
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.clear();
        int studentID = -1;

        ClassList:
        while (studentID != 0) // && checking for full class may also be required!
        {
            studentID = IBIO.inputInt("Enter student ID: ");
            if (studentID != 0)
            {
                while (isInList(studentList, studentID)
                        || StudentController.searchByID(studentID) == -1)
                {
                    studentID = IBIO.inputInt("Invalid or duplicate student ID. Re-enter ID: ");
                    if (studentID == 0)
                    {
                        break ClassList;
                    }
                }
                if (!isInList(studentList, studentID))
                {
                    int studentIndex = StudentController.searchByID(studentID);
                    Student student = StudentController.students.get(studentIndex);
                    studentList.add(student);
                    System.out.println("\tClass size: " + studentList.size());
                }
            }
        }
        int teacherIndex = TeacherController.searchByID(teacherID);
        Teacher teacher = TeacherController.teachers.get(teacherIndex);
        int oldSubjHours = 3;
        char oldSubjLevel = subjects.get(editIndex).getSubjectLevel();
        if (oldSubjLevel == 'H')
        {
            oldSubjHours = 4;
        }
        int newSubjectHours = 3;
        if (newLevel == 'H')
        {
            newSubjectHours = 4;
        }
        int updatedHours = (teacher.getHours() - oldSubjHours) + newSubjectHours;
        teacher.setHours(updatedHours);
        TeacherController.save();

        Subject editedSubject = new Subject(subjectName, newLevel, newClassroom, teacher, studentList);
        subjects.set(editIndex, editedSubject);
        System.out.println(subjectName + " edited.");
        //sort();
        save();
    }

    public static void main(String[] args) throws IOException
    {
        /*
        // to add here: Subject controller menu
        // code below only for testing and demonstration purposes
        load();
        listSubjects();
        addSubject();
        listSubjects();
        String subjectName = IBIO.input("Enter subject name to search: ");
        if (indexOf(subjectName) != -1)
        {
            edit(subjectName); // edit if exact match found
            listSubjects();
        } else
        {
            listSubjects(subjectName); // try to list subject starting with subjectName
        }
        String subjectNameToDelete = IBIO.input("Enter subject name to delete: ");
        delete(subjectNameToDelete);
        listSubjects();
         */
        boolean continues = true;
        String name;
        do
        {   // display the main menu
            load();
            System.out.println("\n\t== MENU ==");
            System.out.println("[ A ] Add subject/class");
            System.out.println("[ L ] List all subjects"); // add compact list option? 
            System.out.println("[ N ] Search subject (by name)");
            System.out.println("[ E ] Edit subject");
            System.out.println("[ Q ] Quit");
            char decision = IBIO.inputChar("\tEnter one letter for your option: ");
            decision = Character.toLowerCase(decision);
            System.out.println();
            switch (decision)
            {
                case 'a':
                    addSubject();
                    break;

                case 'l':
                    listSubjects();
                    break;

                case 'n':
                    name = IBIO.input("Search for which subject name? ");
                    listSubjects(name);
                    break;

                case 'e':
                    name = IBIO.input("Name of subject to edit? ");
                    edit(name);
                    break;
                case 'q':
                    continues = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            } //end switch
        } while (continues);

    }
}
