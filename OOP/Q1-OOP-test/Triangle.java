public class Triangle extends Shape
{
    private double base;
    private double height;
    private double side1, side2, side3;

    public Triangle(String name, double base, double height, double side1, double side2, double side3)
    {
        super(name);
        this.base   = Math.abs(base);
        this.height = Math.abs(height);
        this.side1  = Math.abs(side1);
        this.side2  = Math.abs(side2);
        this.side3  = Math.abs(side3);
    }

    public double getSide1()
    {
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = Math.abs(side1);
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = Math.abs(side2);
    }

    public double getSide3()
    {
        return side3;
    }

    public void setSide3(double side3)
    {
        this.side3 = Math.abs(side3);
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = Math.abs(base);
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = Math.abs(height);
    }

    public double getArea()
    {
        return (this.base * this.height) * 0.5;
    }

    public double getPerimeter()
    {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString()
    {
        String output = super.toString(); // this.getName()
        output = output + "\tBase: " + this.base;
        output = output + "\tHeight: " + this.height;
        output = output + "\tSide 1: " + this.side1;
        output = output + "\tSide 2: " + this.side2;
        output = output + "\tSide 3: " + this.side3;
        output = output + String.format("\tArea: %,.3f", this.getArea() );
        output = output + String.format("\tPerimeter: %,.3f", this.getPerimeter());
        return output;
    }

    public boolean equals(Triangle two)
    {
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }

    public double compareTo(Triangle two)
    {
        return this.getArea() - two.getArea();
    }

}
