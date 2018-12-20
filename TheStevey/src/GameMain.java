import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class GameMain {

	private static JFrame frame;
	private static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMain window = new GameMain();
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
	public GameMain() {
		//initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public static void initialize(String[] answers) {
	
		String[] ans = answers;
		
		
		

		frame = new JFrame();
		frame.setBounds(0, 0, 750, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel.setBounds(70, 297, 231, 93);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(70, 125, 231, 93);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
	
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		label_1.setBounds(70, 205, 231, 93);
		frame.getContentPane().add(label_1);
		label_1.setVisible(false);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 31));
		label_2.setBounds(70, 388, 231, 93);
		frame.getContentPane().add(label_2);
		label_2.setVisible(false);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 31));
		label_3.setBounds(389, 388, 231, 93);
		frame.getContentPane().add(label_3);
		label_3.setVisible(false);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 31));
		label_4.setBounds(389, 297, 231, 93);
		frame.getContentPane().add(label_4);
		label_4.setVisible(false);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 31));
		label_5.setBounds(389, 205, 231, 93);
		frame.getContentPane().add(label_5);
		label_5.setVisible(false);
		
		JLabel label_6 = new JLabel("New Label");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 31));
		label_6.setBounds(389, 125, 231, 93);
		frame.getContentPane().add(label_6);
		label_6.setVisible(false);
		
		
		JLabel lblTheHarveyProject = new JLabel("THE HARVEY PROJECT");
		lblTheHarveyProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheHarveyProject.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTheHarveyProject.setBounds(170, 39, 376, 75);
		frame.getContentPane().add(lblTheHarveyProject);
		
	
		
		JButton btnPrintArrays = new JButton("Print ALL DE ARRAYS");
		btnPrintArrays.setBounds(264, 608, 184, 75);
		frame.getContentPane().add(btnPrintArrays);
		
		
		
		textField = new JTextField();
		textField.setBounds(264, 534, 184, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		btnPrintArrays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newAns = textField.getText();
				if(newAns.equals(ans[0])) {
					
					lblNewLabel_1.setVisible(true);
					
				}else if(newAns.equals(ans[1])) {
										
					label_1.setVisible(true);
				
				}else if(newAns.equals(ans[2])) {
					
					lblNewLabel.setVisible(true);
					
				}else if(newAns.equals(ans[3])) {
					
					label_2.setVisible(true);
					
				}else if(newAns.equals(ans[4])) {
					
					label_6.setVisible(true);
					
					
					
				}else if(newAns.equals(ans[5])) {
					
					label_5.setVisible(true);
					
					
					
				}else if(newAns.equals(ans[6])) {
					
					label_4.setVisible(true);
				
					
				}else if(newAns.equals(ans[7])) {
					
					label_3.setVisible(true);
					
				} else {
					
					System.out.println("you done goofed son");
					
				}
				
				textField.resetKeyboardActions();
				
				
			}
			
		});
	
		
		
		
		
		
		
	
	}
}
