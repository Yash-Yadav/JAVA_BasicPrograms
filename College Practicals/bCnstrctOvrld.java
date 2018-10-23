class demo
{
    public demo()		
    {
        System.out.println("Constructor with 0 parameter is running");
    }
    public demo(int num)
    {
        System.out.println("Constructor with 1 integer parameter is running");
    }
    public demo(char ch)
    {
        System.out.println("Constructor with 1 character parameter is running");
    }
}
class bCnstrctOvrld
{  
    public static void main(String args[])
    {
        System.out.println("Implement constructor overloading--->" + "\n");
	demo obj1 = new demo(); //with 0 parameter
	demo obj2 = new demo(10); //with 0 parameter
	demo obj3 = new demo('c'); //with 0 parameter
    }
}
