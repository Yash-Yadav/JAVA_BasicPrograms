class aMethodOvrld
{  
    public static double area(double diameter)
    {
        return(3.14*diameter);
    }

     public static double area(double width,double height)
    {
        return(width*height);
    }

    public static void main(String args[])
    {
        System.out.println("Calculating area of Rectangle of dimension 25.5x35.5 m");
        double area= area(25.5, 35.5);
        System.out.println("Area of rectangle is " + area + " sq m");

        System.out.println("Calculating area of Circle of diameter 2.5 m");
        area = area(2.5);
        System.out.println("Area of circle is " + area + " sq m");
    }
}
