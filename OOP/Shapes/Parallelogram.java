public class Parallelogram extends Shape
{
    private double base;
    private double height;
    private double length;
    private double width;

    public Parallelogram(String name, double base, double height, double length, double width)
    {
        super(name);
        this.base = base;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getArea()
    {
        return (this.base * this.height);
    }

    public double getPerimeter()
    {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString()
    {
        String output = super.toString();
        output = output + "\tBase: " + this.base;
        output = output + "\tHeight: " + this.height;
        output = output + "\tLength: " + this.length;
        output = output + "\tWidth: " + this.width;
        output = output + String.format("\tArea: %,.3f", this.getArea() );
        output = output + String.format("\tPerimeter: %,.3f", this.getPerimeter());
        return output;
    }

    public boolean equals(Circle two)
    {
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }

    public double compareTo(Circle two)
    {
        return this.getArea() - two.getArea();
    }

}
