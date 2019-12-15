		import java.awt.EventQueue;
		
		
		import javax.swing.JFrame;
		import java.awt.Label;
		import java.awt.TextField;
		import java.awt.Font;
		import java.awt.Color;
		import java.awt.Button;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;
		import java.time.LocalDate;
		import java.time.Period;
		import java.awt.event.KeyAdapter;
		import java.awt.event.KeyEvent;
		
		
		public class AGE {
		
			private JFrame frame;
		
			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AGE window = new AGE();
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
			public AGE() {
				initialize();
			}
		
			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				frame = new JFrame();
				frame.getContentPane().setBackground(Color.RED);
				frame.getContentPane().setForeground(Color.BLACK);
				frame.setBounds(100, 100, 450, 300);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				Label label = new Label("Enter BirthDate");
				label.setAlignment(Label.CENTER);
				label.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 20));
				label.setBounds(139, 10, 165, 45);
				frame.getContentPane().add(label);
				
				TextField textField = new TextField();
				textField.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(java.awt.event.KeyEvent evt) {
						
						String dateofbirth = textField.getText();
						int length = dateofbirth.length();
						
						char c = evt.getKeyChar();	
						
						
						if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
						{
						if(length<2) {
							textField.setEditable(true);
						}
						else {
							textField.setEditable(false);
						}
						}else {
							if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
								textField.setEditable(true);
							}
							else {
								textField.setEditable(false);
							}
						}
						}
						
					}
				);
				textField.setBounds(157, 62, 30, 22);
				frame.getContentPane().add(textField);
				
				Label label_1 = new Label("/");
				label_1.setFont(new Font("Arial Black", Font.BOLD, 20));
				label_1.setBounds(193, 62, 10, 22);
				frame.getContentPane().add(label_1);
				
				TextField textField_1 = new TextField();
				textField_1.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(java.awt.event.KeyEvent evt) {
						
						String Monthofbirth = textField_1.getText();
						int length = Monthofbirth.length();
						
						char c = evt.getKeyChar();	
						
						
						if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
						{
						if(length<2) {
							textField_1.setEditable(true);
						}
						else {
							textField_1.setEditable(false);
						}
						}else {
							if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
								textField_1.setEditable(true);
							}
							else {
								textField_1.setEditable(false);
							}
						}
						}
						
					}
				);
				textField_1.setBounds(214, 62, 30, 22);
				frame.getContentPane().add(textField_1);
				
				Label label_2 = new Label("/");
				label_2.setFont(new Font("Arial Black", Font.BOLD, 20));
				label_2.setBounds(250, 62, 10, 22);
				frame.getContentPane().add(label_2);
				
				TextField textField_2 = new TextField();
				textField_2.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(java.awt.event.KeyEvent evt) {
						
						String yearofbirth = textField_2.getText();
						int length = yearofbirth.length();
						
						char c = evt.getKeyChar();	
						
						
						if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
						{
						if(length<4) {
							textField_2.setEditable(true);
						}
						else {
							textField_2.setEditable(false);
						}
						}else {
							if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
								textField_2.setEditable(true);
							}
							else {
								textField_2.setEditable(false);
							}
						}
						}
						
					}
				);
				textField_2.setBounds(266, 62, 40, 22);
				frame.getContentPane().add(textField_2);
				
				Label label_3 = new Label("DD");
				label_3.setFont(new Font("Dialog", Font.PLAIN, 14));
				label_3.setBounds(157, 90, 24, 22);
				frame.getContentPane().add(label_3);
				
				Label label_4 = new Label("MM");
				label_4.setFont(new Font("Dialog", Font.PLAIN, 14));
				label_4.setBounds(220, 90, 24, 22);
				frame.getContentPane().add(label_4);
				
				Label label_5 = new Label("YYYY");
				label_5.setFont(new Font("Dialog", Font.PLAIN, 14));
				label_5.setBounds(266, 90, 40, 22);
				frame.getContentPane().add(label_5);
				
				Label label_6 = new Label("AGE:");
				label_6.setFont(new Font("Arial Black", Font.BOLD, 18));
				label_6.setBounds(119, 141, 46, 22);
				frame.getContentPane().add(label_6);
				
				Label label_7 = new Label("");
				label_7.setAlignment(Label.CENTER);
				label_7.setFont(new Font("Dialog", Font.BOLD, 27));
				label_7.setBackground(Color.WHITE);
				label_7.setForeground(Color.DARK_GRAY);
				label_7.setBounds(193, 122, 88, 41);
				frame.getContentPane().add(label_7);
				
				Button button = new Button("Calculate Age");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int Day = Integer.parseInt(textField.getText());
						int month = Integer.parseInt(textField_1.getText());
						int year = Integer.parseInt(textField_2.getText());
						
						
						
						LocalDate birthday = LocalDate.of(year, month, Day);
						
						LocalDate nowDate =LocalDate. now();
						
						int period =Period.between(birthday,nowDate).getYears();
						
						label_7.setText(String.valueOf(period));
						
					}
				});
				button.setBounds(191, 182, 90, 33);
				frame.getContentPane().add(button);
				
				Button button_1 = new Button("Clear");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						label_7.setText("");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						
					}
				});
				button_1.setBounds(354, 229, 70, 22);
				frame.getContentPane().add(button_1);
				
			}
		}
		
