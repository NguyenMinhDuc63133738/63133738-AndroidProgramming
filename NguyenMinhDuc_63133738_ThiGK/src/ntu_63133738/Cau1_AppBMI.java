package ntu_63133738;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cau1_AppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau1_AppBMI frame = new Cau1_AppBMI();
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
	public Cau1_AppBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		panel.setBounds(0, 0, 586, 152);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính BMI của bạn tại đây");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(149, 34, 288, 60);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 213, 234));
		panel_1.setBounds(0, 152, 586, 294);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chiều cao(m):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 26, 112, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cân nặng(kg)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 85, 112, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Chỉ số BMI");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 133, 112, 30);
		panel_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(207, 29, 353, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 85, 353, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(207, 136, 353, 30);
		panel_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Tính BMI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(227, 204, 130, 43);
		panel_1.add(btnNewButton);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnXa.setBounds(380, 204, 85, 43);
		panel_1.add(btnXa);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnThot.setBounds(475, 204, 85, 43);
		panel_1.add(btnThot);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(0, 446, 116, 107);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(33, 31, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(128, 255, 128));
		panel_2_1.setBounds(113, 446, 116, 107);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(32, 33, 45, 13);
		panel_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(255, 255, 128));
		panel_2_2.setBounds(229, 446, 116, 107);
		contentPane.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setBounds(38, 34, 45, 13);
		panel_2_2.add(lblNewLabel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(255, 128, 0));
		panel_2_3.setBounds(346, 446, 124, 107);
		contentPane.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setBounds(47, 35, 45, 13);
		panel_2_3.add(lblNewLabel_2_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(new Color(255, 0, 0));
		panel_2_4.setBounds(470, 446, 116, 107);
		contentPane.add(panel_2_4);
		panel_2_4.setLayout(null);
		
		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setBounds(41, 33, 45, 13);
		panel_2_4.add(lblNewLabel_2_4);
		
		
	}
}
