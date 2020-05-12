import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.xml.soap.Text;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BodyWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BodyWindow window = new BodyWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BodyWindow() {
		initialize();
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		frame.setBounds(0, 0, 750, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setBounds(241, 543, 208, 84);
		frame.getContentPane().add(btnStartGame);
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMain newWindow = new GameMain();
				
				 String ans1 = textField.getText(),
					ans2 = textField_1.getText(),
					ans3 = textField_2.getText(),
					ans4 = textField_3.getText(),
					ans5 = textField_4.getText(),
					ans6 = textField_5.getText(),
					ans7 = textField_6.getText(),
				        ans8 = textField_7.getText();
					 
				String[] answers = {ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8};
				
				String[] empty = {" "};
				
				GameMain.main(empty);
				GameMain.initialize(answers);
			
				
				
			}
		});
		
		
		// TEXT FIELDS ---------------------------------------
		
		textField = new JTextField();
		textField.setBounds(110, 123, 183, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 225, 183, 52);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 332, 183, 56);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 430, 183, 56);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(406, 123, 188, 56);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(406, 225, 188, 56);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(406, 332, 188, 56);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
	    textField_7 = new JTextField();
		textField_7.setBounds(406, 432, 188, 52);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
	
		

		

		
		
			
		// LABELS TO IGNORE---------------------------------------------------------------------
		JLabel lblAnswer = DefaultComponentFactory.getInstance().createLabel("#1 Answer");
		lblAnswer.setBounds(172, 98, 92, 14);
		frame.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = DefaultComponentFactory.getInstance().createLabel("#2 Answer");
		lblAnswer_1.setBounds(172, 200, 92, 14);
		frame.getContentPane().add(lblAnswer_1);
		
		JLabel lblAnswer_2 = DefaultComponentFactory.getInstance().createLabel("#3 Answer");
		lblAnswer_2.setBounds(172, 307, 92, 14);
		frame.getContentPane().add(lblAnswer_2);
		
		JLabel lblAnswer_3 = DefaultComponentFactory.getInstance().createLabel("#4 Answer");
		lblAnswer_3.setBounds(172, 405, 92, 14);
		frame.getContentPane().add(lblAnswer_3);
		
		JLabel lblAnswer_4 = DefaultComponentFactory.getInstance().createLabel("#5 Answer");
		lblAnswer_4.setBounds(472, 98, 92, 14);
		frame.getContentPane().add(lblAnswer_4);
		
		JLabel lblAnswer_5 = DefaultComponentFactory.getInstance().createLabel("#6 Answer");
		lblAnswer_5.setBounds(472, 200, 92, 14);
		frame.getContentPane().add(lblAnswer_5);
		
		JLabel lblAnswer_6 = DefaultComponentFactory.getInstance().createLabel("#7 Answer");
		lblAnswer_6.setBounds(472, 307, 92, 14);
		frame.getContentPane().add(lblAnswer_6);
		
		JLabel lblAnswer_7 = DefaultComponentFactory.getInstance().createLabel("#8 Answer");
		lblAnswer_7.setBounds(472, 407, 92, 14);
		frame.getContentPane().add(lblAnswer_7);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("THE HARVEY PROJECT");
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewJgoodiesTitle.setBounds(172, 11, 400, 84);
		frame.getContentPane().add(lblNewJgoodiesTitle);
	
		
			
		
	}
	

		

}
