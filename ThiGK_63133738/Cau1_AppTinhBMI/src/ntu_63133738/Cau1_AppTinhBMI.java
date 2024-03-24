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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        txtKetQua.setBackground(new Color(223, 223, 223));
        txtKetQua.setEditable(false);
        txtKetQua.setColumns(10);
        txtKetQua.setBounds(207, 136, 353, 30);
        panel_1.add(txtKetQua);

        
        JButton btnTinhBMI = new JButton("Tính BMI");
        btnTinhBMI.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		double cc = Double.parseDouble(txtChieuCao.getText());
                double cn = Double.parseDouble(txtCanNang.getText());
                double bmi = cn/(cc * cc);
                
                String kq = String.format("%.2f", bmi);
                txtKetQua.setText(kq);
                
                if(bmi < 18.5)
                {
                    txtKetQua.setOpaque(true);
                    txtKetQua.setBackground(new Color(128, 255, 255));
                }
                else 
                    if(bmi <= 24.9)
                    {
                        txtKetQua.setOpaque(true);
                        txtKetQua.setBackground(new Color(128, 255, 128));
                    }
                    else 
                        if(bmi <= 29.9)
                        {
                            txtKetQua.setOpaque(true);
                            txtKetQua.setBackground(new Color(255, 255, 128));
                        }
                        else 
                            if(bmi <= 34.9)
                            {
                                txtKetQua.setOpaque(true);
                                txtKetQua.setBackground(new Color(255, 128, 0));
                            }
                            else 
                                if(bmi >= 35)
                                {
                                    txtKetQua.setOpaque(true);
                                    txtKetQua.setBackground(new Color(255, 0, 0));
                                }

        	}
        });
        btnTinhBMI.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnTinhBMI.setBounds(227, 204, 130, 43);
        panel_1.add(btnTinhBMI);

        
        JButton btnXoa = new JButton("Xóa");
        btnXoa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                    txtChieuCao.setText("");
                    txtCanNang.setText("");
                    txtKetQua.setText("");
                    txtKetQua.setOpaque(true);
                    txtKetQua.setBackground(new Color(223, 223, 223));

        	}
        });
        btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnXoa.setBounds(380, 204, 85, 43);
        panel_1.add(btnXoa);

        
        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnThoat.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnThoat.setBounds(475, 204, 85, 43);
        panel_1.add(btnThoat);

        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(128, 255, 255));
        panel_2.setBounds(0, 446, 116, 107);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("<18.5 ");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2.setBounds(24, 10, 55, 20);
        panel_2.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Thiếu cân");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_3.setBounds(20, 41, 86, 32);
        panel_2.add(lblNewLabel_3);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(new Color(128, 255, 128));
        panel_2_1.setBounds(113, 446, 116, 107);
        contentPane.add(panel_2_1);
        panel_2_1.setLayout(null);
        
        JLabel lblNewLabel_2_1 = new JLabel("18.5 - 24.9");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_1.setBounds(20, 10, 86, 20);
        panel_2_1.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_3_1 = new JLabel("Cân đối");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_3_1.setBounds(30, 40, 62, 32);
        panel_2_1.add(lblNewLabel_3_1);
        
        JPanel panel_2_2 = new JPanel();
        panel_2_2.setBackground(new Color(255, 255, 128));
        panel_2_2.setBounds(229, 446, 116, 107);
        contentPane.add(panel_2_2);
        panel_2_2.setLayout(null);
        
        JLabel lblNewLabel_2_2 = new JLabel("25 - 29.9");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_2.setBounds(20, 10, 75, 25);
        panel_2_2.add(lblNewLabel_2_2);
        
        JLabel lblNewLabel_3_2 = new JLabel("Thừa cân");
        lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_3_2.setBounds(20, 45, 77, 32);
        panel_2_2.add(lblNewLabel_3_2);
        
        JPanel panel_2_3 = new JPanel();
        panel_2_3.setBackground(new Color(255, 128, 0));
        panel_2_3.setBounds(346, 446, 124, 107);
        contentPane.add(panel_2_3);
        panel_2_3.setLayout(null);
        
        JLabel lblNewLabel_2_3 = new JLabel("30 - 34.9");
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_3.setBounds(20, 10, 69, 26);
        panel_2_3.add(lblNewLabel_2_3);
        
        JLabel lblNewLabel_3_3 = new JLabel("Béo phì");
        lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_3_3.setBounds(20, 42, 69, 32);
        panel_2_3.add(lblNewLabel_3_3);
        
        JPanel panel_2_4 = new JPanel();
        panel_2_4.setBackground(new Color(255, 0, 0));
        panel_2_4.setBounds(470, 446, 116, 107);
        contentPane.add(panel_2_4);
        panel_2_4.setLayout(null);
        
        JLabel lblNewLabel_2_4 = new JLabel("35<");
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_4.setBounds(32, 10, 45, 27);
        panel_2_4.add(lblNewLabel_2_4);
        
        JLabel lblNewLabel_3_4 = new JLabel("<html>Béo phì<br>nguy hiểm</html>");
        lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_3_4.setBounds(20, 37, 86, 40);
        panel_2_4.add(lblNewLabel_3_4);
        
        
    }
}

