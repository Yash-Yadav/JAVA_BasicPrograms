import java.util.*;
import java.lang.*;

class Parent
{
  public Parent()
  {
    System.out.println("Inside Parent");
  }
  public int sum(int a, int b)
  {
    return (a+b);
  }
}

class Child1 extends Parent
{
  public Child1()
  {
    System.out.println("Inside Child1");
  }
}

class Child2 extends Parent
{
  public Child2()
  {
    System.out.println("Inside Child2");
  }
}

class c1Inheritance
{
  public static void main(String args[])
  {
    Child1 child1dobj = new Child1();
    Child2 child2dobj = new Child2();
    System.out.println(child2dobj.sum(2,8));
    System.out.println(child1dobj.sum(2,8));
  }
}
