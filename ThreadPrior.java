class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A started");
        for(int i=1; i<=5; i++)
        {
            System.out.println("\t From Thread A i= " + i);            
        }
        System.out.println("Exit From A");
    }
}
    class B extends Thread
    {
        public void run()
        {
            System.out.println("Thread B started");
            for(int j=1; j<=5; j++)
            {
                System.out.println("\t From Thread B j= " + j);                
            }
            System.out.println("Exit From B");
        }        
    }
    public class ThreadPrior
    {
        public static void main(String args[])
        {
            A threadA = new A();
            B threadB = new B();
            threadA.setPriority(Thread.MIN_PRIORITY);
            threadA.setPriority(threadA.getPriority()+3);
            System.out.println("Start Thread A");
            threadA.start();
            System.out.println("Start Thread B");
            threadB.start();
            System.out.println("End of the Main Thread");
        }
    }
