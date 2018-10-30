import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class AppletProgram extends Applet {
	String ch;
	protected int lastX = 0, lastY = 0;
	Button forG, bagG;
	int f = 0, b = 0, s = 0;
	AudioClip audio;
	Color color1[] = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
			Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
			Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
	Color ColorB, ColorF;
	Choice choice, choice1, choice2;
	Label lblSelectSymbol,label,label_1;
	
	public void init() {
		setBackground(Color.CYAN);
		setForeground(Color.blue);
		addMouseListener(new PositionRecorder());
		addMouseMotionListener(new LineDrawer());
		setSize(600, 600);
		setLayout(null);
		audio = getAudioClip(getCodeBase(), "applet/sound/bomb.wav");
		ch = "!";

		lblSelectSymbol = new Label("Select Symbol");
		lblSelectSymbol.setBounds(18, 29, 84, 14);
		add(lblSelectSymbol);

		choice = new Choice();
		choice.setBounds(125, 23, 94, 20);
		add(choice);

		label = new Label("Background Color");
		label.setBounds(18, 49, 101, 22);
		add(label);

		choice1 = new Choice();
		choice1.setBounds(125, 49, 94, 20);
		add(choice1);

		label_1 = new Label("Foreground Color");
		label_1.setBounds(18, 78, 101, 22);
		add(label_1);

		choice2 = new Choice();
		choice2.setBounds(125, 80, 94, 20);
		add(choice2);

		Button button = new Button("ReDraw");
		button.setBounds(18, 122, 101, 22);
		add(button);

		choice.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {
				// TODO Auto-generated method stub
				//ch = c[Integer.parseInt(event.getItem().toString())];
				try {
				ch = event.getItem().toString();
				}catch(NumberFormatException e) {
					System.out.println(e.getMessage());
				}
			}
		});

		choice1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {
				// TODO Auto-generated method stub
				ColorB = color1[choice1.getSelectedIndex()];
				
			}
		});
		
		choice2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {
				// TODO Auto-generated method stub
				ColorF = color1[choice2.getSelectedIndex()];
			
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				repaint();
				lblSelectSymbol.setBackground(ColorB);
				label.setBackground(ColorB);
				label_1.setBackground(ColorB);
				lblSelectSymbol.setForeground(ColorF);
				label.setForeground(ColorF);
				label_1.setForeground(ColorF);
				setBackground(ColorB);
				setForeground(ColorF);
			}
		});

		Button button_1 = new Button("Play Audio Clip");
		button_1.setBounds(127, 122, 94, 22);
		add(button_1);

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				audio.play();
			}
		});
		
		choice.add("!");
		choice.add("@");
		choice.add("#");
		choice.add("$");
		choice.add("%");
		choice.add("^");
		choice.add("&");
		choice.add("&");
		choice.add("*");
		choice.add("(");
		choice.add(")");

		choice1.add("Black");
		choice1.add("Blue");
		choice1.add("Cyan");
		choice1.add("Dark Gray");
		choice1.add("Gray");
		choice1.add("Green");
		choice1.add("Light Gray");
		choice1.add("Magenta");
		choice1.add("Orange");
		choice1.add("Pink");
		choice1.add("Red");
		choice1.add("White");
		choice1.add("Yellow");

		choice2.add("Black");
		choice2.add("Blue");
		choice2.add("Cyan");
		choice2.add("Dark Gray");
		choice2.add("Gray");
		choice2.add("Green");
		choice2.add("Light Gray");
		choice2.add("Magenta");
		choice2.add("Orange");
		choice2.add("Pink");
		choice2.add("Red");
		choice2.add("White");
		choice2.add("Yellow");
	}

	protected void record(int x, int y) {
		lastX = x;
		lastY = y;
	}

	public void paint(Graphics g){

		for (int i = 0; i <= 50; i = i + 5) {
			g.drawString(ch, 200 + i, 200 + i);
			g.drawString(ch, 200 - i, 200 + i);
		}
		for (int i = 0; i <= 50; i = i + 5) {
			g.drawString(ch, 250 - i, 250 + i);
		}
		for (int i = 0; i <= 50; i = i + 5) {
			g.drawString(ch, 150 + i, 250 + i);
		}

	}

	// Record position that mouse entered window or
	// where user pressed mouse button.

	private class PositionRecorder extends MouseAdapter {
		public void mouseEntered(MouseEvent event) {
			requestFocus(); // Plan ahead for typing
			record(event.getX(), event.getY());
		}

		public void mousePressed(MouseEvent event) {
			record(event.getX(), event.getY());
		}
	}

	// As user drags mouse, connect subsequent positions
	// with short line segments.

	private class LineDrawer extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent event) {
			int x = event.getX();
			int y = event.getY();
			Graphics g = getGraphics();
			g.drawLine(lastX, lastY, x, y);
			record(x, y);
		}
	}
}
