package ntu_63133738;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cau1_AppTinhBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChieuCao;
	private JTextField txtCanNang;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau1_AppTinhBMI frame = new Cau1_AppTinhBMI();
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
	public Cau1_AppTinhBMI() {
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

        
        txtChieuCao = new JTextField();
        txtChieuCao.setBounds(207, 29, 353, 30);
        panel_1.add(txtChieuCao);
        txtChieuCao.setColumns(10);
        
        txtCanNang = new JTextField();
        txtCanNang.setColumns(10);
        txtCanNang.setBounds(207, 85, 353, 30);
        panel_1.add(txtCanNang);
        
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        txtKetQua.setColumns(10);
        txtKetQua.setBounds(207, 136, 353, 30);
        panel_1.add(txtKetQua);

        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.setBounds(193, 238, 85, 21);
        panel_1.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1.setBounds(296, 238, 85, 21);
        panel_1.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_2.setBounds(419, 238, 85, 21);
        panel_1.add(btnNewButton_2);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(128, 255, 255));
        panel_2.setBounds(0, 446, 116, 107);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2.setBounds(10, 24, 78, 37);
        panel_2.add(lblNewLabel_2);

        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(new Color(128, 255, 128));
        panel_2_1.setBounds(113, 446, 116, 107);
        contentPane.add(panel_2_1);
        panel_2_1.setLayout(null);
        
        JLabel lblNewLabel_2_1 = new JLabel("New label");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_1.setBounds(10, 24, 78, 37);
        panel_2_1.add(lblNewLabel_2_1);
        

        
        JPanel panel_2_2 = new JPanel();
        panel_2_2.setBackground(new Color(255, 255, 128));
        panel_2_2.setBounds(229, 446, 116, 107);
        contentPane.add(panel_2_2);
        panel_2_2.setLayout(null);
        
        JLabel lblNewLabel_2_2 = new JLabel("New label");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_2.setBounds(10, 22, 78, 37);
        panel_2_2.add(lblNewLabel_2_2);

        
        JPanel panel_2_3 = new JPanel();
        panel_2_3.setBackground(new Color(255, 128, 0));
        panel_2_3.setBounds(346, 446, 124, 107);
        contentPane.add(panel_2_3);
        panel_2_3.setLayout(null);
        
        JLabel lblNewLabel_2_3 = new JLabel("New label");
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_3.setBounds(21, 22, 78, 37);
        panel_2_3.add(lblNewLabel_2_3);

        
        JPanel panel_2_4 = new JPanel();
        panel_2_4.setBackground(new Color(255, 0, 0));
        panel_2_4.setBounds(470, 446, 116, 107);
        contentPane.add(panel_2_4);
        panel_2_4.setLayout(null);
        
        JLabel lblNewLabel_2_4 = new JLabel("New label");
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_4.setBounds(10, 24, 78, 37);
        panel_2_4.add(lblNewLabel_2_4);





	}
}
