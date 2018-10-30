interface Add2Num
{
  final String TMP1 = "Adding 2 Integers";
  int sum(int a, int b);
}

interface Mult2Num
{
  final String TMP2 = "Multiplying 2 Integers";
  int product(int a, int b);
}

class dInterface implements Add2Num, Mult2Num
{
  public int sum(int a, int b)
  {
    return (a+b);
  }
  public int product(int a, int b)
  {
    return (a*b);
  }
  public static void main(String args[])
  {
    System.out.println(TMP1);
    dInterface obj = new dInterface();
    System.out.println(obj.sum(10,20));
	System.out.println(TMP2);
	System.out.println(obj.product(10,20));
  }
}
