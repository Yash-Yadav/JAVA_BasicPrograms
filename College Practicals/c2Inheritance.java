import java.util.*;
import java.lang.*;

class Parent
{
  public Parent()
  {
    System.out.println("0 Parameter Constructor Inide Parent");
  }
  public Parent(int a, int b)
  {
    System.out.println("Constructor with 2 Integer type Parameters Inide Parent");
     System.out.println(a+b);
  }
  public Parent(float P, float T, float R)
  {
    System.out.println("Constructor with 3 Float type Parameters Inide Parent");
    System.out.print("Simple Interest of:\nP=100,T=1,R=10\n= ");
     System.out.println(P*T*R/100);
  }
}

class Child1 extends Parent
{
  public Child1()
  {
    super(100,10);
    System.out.println("Inide Child1");
  }
}

class Child2 extends Parent
{
  public Child2()
  {
    super(100,1,10);
    System.out.println("Inide Child2");

  }
}

class c2Inheritance
{
  public static void main(String args[])
  {
    Child1 child1dobj = new Child1();
    System.out.println();
    Child2 child2dobj = new Child2();
  }
}
