import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private static JTextField txtInput;
	private String currentText, lastText;
	private double answer, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\can\\AndroidStudioProjects\\KaymakamlkSnavHapBilgiler\\app\\src\\main\\res\\mipmap-xhdpi\\icon1.png"));
		setTitle("Hesap Makinas\u0131");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 25, 376, 70);
		contentPane.add(screen);
		screen.setLayout(null);
		
		txtInput = new JTextField();
		txtInput.setBackground(SystemColor.controlHighlight);
		txtInput.setBorder(null);
		txtInput.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInput.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		txtInput.setEditable(false);
		txtInput.setBounds(10, 21, 356, 39);
		screen.add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lblCalculate = new JLabel("");
		lblCalculate.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
		lblCalculate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalculate.setBounds(10, 0, 356, 23);
		screen.add(lblCalculate);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(20, 106, 352, 335);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber7.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber7);
		
		JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber8.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber8);
		
		JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber9.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber9);
		
		JButton btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				number = Double.parseDouble(txtInput.getText());
				operation = 4;
				lblCalculate.setText(number+e.getActionCommand());
				txtInput.setText("");
			}
		});
		btnBol.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnBol);
		
		JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber4.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber4);
		
		JButton btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber5.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber5);
		
		JButton btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber6.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber6);
		
		JButton btnCarp = new JButton("*");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 3;
				lblCalculate.setText(number+e.getActionCommand());
				txtInput.setText("");
			}
		});
		btnCarp.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnCarp);
		
		JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());

			}
		});
		btnNumber1.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber1);
		
		JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber2.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber2);
		
		JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		btnNumber3.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber3);
		
		JButton btnTopla = new JButton("+");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 1;
				lblCalculate.setText(number+e.getActionCommand());
				txtInput.setText("");
			}
		});
		btnTopla.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnTopla);
		
		JButton btnNumber0 = new JButton("0");
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputAdd(e.getActionCommand());
			}
		});
		
		JPanel panel = new JPanel();
		mainPanel.add(panel);
		panel.setLayout(new GridLayout(2, 1, 0, 5));
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteNumber();
			}
		});
		btnC.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 18));
		panel.add(btnC);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInput.setText("");
				lblCalculate.setText("");
				answer=0;
				number=0;
				operation=0;
			}
		});
		btnCE.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 18));
		panel.add(btnCE);
		btnNumber0.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnNumber0);
		
		JButton btnSonuc = new JButton("=");
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate();
				lblCalculate.setText("");
			}
		});
		btnSonuc.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnSonuc);
		
		JButton btnCikar = new JButton("-");
		btnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 2;
				lblCalculate.setText(number+e.getActionCommand());
				txtInput.setText("");
			}
		});
		btnCikar.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 20));
		mainPanel.add(btnCikar);
	}
	
	public static void inputAdd(String input) {
		txtInput.setText(txtInput.getText()+input);
	}
	public void deleteNumber() {
		currentText = txtInput.getText();
		if(!(txtInput.getText().isEmpty())) {
			lastText = currentText.substring(0, currentText.length()-1);
			txtInput.setText(lastText);
		}
		if(txtInput.getText().isEmpty()){
			txtInput.setText("");
		}
		
	}
	
	public void Calculate() {
		switch(operation) {
		case 1 :
			answer = number + Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		case 2 :
			answer = number - Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		case 3 :
			answer = number * Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		case 4 :
			answer = number / Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		default :
			break;
		}
	}
}
