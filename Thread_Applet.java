package Applets;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Thread_Applet extends Applet implements Runnable
{
    String msg=" This is a Program by Yash and Pravesh... ";
    Thread t=null;
    int state;
    boolean stopFlag;
    @Override
    public void init()
    {
        setBackground(Color.yellow);
        setForeground(Color.red);
    }
    @Override
    public void start()
    {
        t=new Thread(this);
        stopFlag=false;
        t.start();
    }
    
    @Override
    public void run()
    {
        char ch;
        for(;;)
        {
            try
            {
                repaint();
                Thread.sleep(250);
                ch=msg.charAt(0);
                msg=msg.substring(1,msg.length());
                msg=msg+ch;
                if(stopFlag)
                    break;
            }catch(InterruptedException e){}
        }
    }
    @Override
    public void stop()
    {
        stopFlag=true;
        t=null;
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString(msg, 50, 30);
        showStatus("This is Yash and Pravesh!");
    }                    
}