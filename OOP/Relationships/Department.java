// this is an example of association and aggregation
public class Department
{
    Teacher[] members;		// Teacher is independent from Department (association>aggregation)
    Teacher hod;			// Teacher is independent from Department (association>aggregation)
    String name;
    String school;
    String meetingDay;
    Time meetingTime;		// Time is independent from Department (association>aggregation)

}
/* since the teachers can exist w/o a department, it's association and NOT dependency
    but if the department cannot exist w/o teachers, then the department depends on teachers
 */