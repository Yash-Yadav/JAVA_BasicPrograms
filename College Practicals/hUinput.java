import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class hUinput extends JFrame {
	private JPanel contentPane;
	private TextArea textArea;
	private TextField nameField,enoField,serialnoField,branchField,yearField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hUinput frame = new hUinput ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public hUinput () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Label label = new Label("Name :");
		label.setBounds(5, 5, 62, 22);
		contentPane.add(label);
		Label label_1 = new Label("E. No. :");
		label_1.setBounds(5, 33, 62, 22);
		contentPane.add(label_1);
		Label label_2 = new Label("Serial No. :");
		label_2.setBounds(5, 61, 62, 22);
		contentPane.add(label_2);
		Label label_3 = new Label("Branch :");
		label_3.setBounds(5, 92, 62, 22);
		contentPane.add(label_3);
		Label label_4 = new Label("Year :");
		label_4.setBounds(5, 130, 62, 22);
		contentPane.add(label_4);
		nameField = new TextField();
		nameField.setBounds(73, 5, 351, 22);
		contentPane.add(nameField);
		enoField = new TextField();
		enoField.setBounds(73, 33, 351, 22);
		contentPane.add(enoField);
		serialnoField = new TextField();
		serialnoField.setBounds(73, 61, 351, 22);
		contentPane.add(serialnoField);
		branchField = new TextField();
		branchField.setBounds(73, 92, 351, 22);
		contentPane.add(branchField);
		yearField = new TextField();
		yearField.setBounds(73, 130, 351, 22);
		contentPane.add(yearField);
		Button submitbutton = new Button("Submit");
		submitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				submitActionPreformed(event);
			}
		});
		submitbutton.setBounds(5, 166, 70, 22);
		contentPane.add(submitbutton);
		textArea = new TextArea();
		textArea.setBounds(10, 194, 414, 106);
		contentPane.add(textArea);
	}
	private void submitActionPreformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String name,eno,serialno,branch,year;
		name = "Name :" + nameField.getText();
		eno = "E.No. :" +  enoField.getText();
		serialno = "Serial No. :" +  serialnoField.getText();
		branch = "Branch :" +  branchField.getText();
		year = "Year :" +  yearField.getText();
		
		String finaltext = name + '\n'	+
				eno + '\n'	+
				serialno+ '\n'	+
				branch+ '\n' +
				year+ '\n';
		textArea.setText("");
		textArea.setText(finaltext);
	}
}
