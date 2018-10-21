class NewThread implements Runnable
{
  String name;
  Thread t;
  NewThread(String threadname)
  {
    name = threadname;
    t = new Thread(this, name);
    System.out.println("New Thread: " + t);
    t.start();
  }

  public void run()
  {
    try
    {
      for (int i=5; i>0; i--)
      {
        System.out.println(name + ": " + i);
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println(name + "Interrupted");
    }
    System.out.println(name + " exiting.");
  }
}

class f1MltiThrd
{
  public static void main(String args[])
  {
    new NewThread("T1");
    new NewThread("T2");
    new NewThread("T3");
    try
    {
      Thread.sleep(10000);
    }
    catch(Exception e)
    {
      System.out.println("Main Thread exiting...");
    }
    System.out.println("Main thread exiting.");
  }
}
