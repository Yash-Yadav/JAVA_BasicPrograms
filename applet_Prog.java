package Applets;
import java.applet.*;
import java.awt.*;

public class applet_Prog extends Applet {
    @Override
    public void paint (Graphics g) {
      g.drawString ("Hello World", 25, 50);
      g.drawArc(35, 100, 50, 50, 0, 360);
    }
}