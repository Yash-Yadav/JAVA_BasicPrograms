interface Demo
{
  final String TMP = "Adding 2 Integers";
  int sum(int a, int b);
}

class dInterface implements Demo
{
  public int sum(int a, int b)
  {
    return (a+b);
  }
  public static void main(String args[])
  {
    System.out.println(TMP);
    dInterface obj = new dInterface();
    System.out.println(obj.sum(10,20));
  }
}
