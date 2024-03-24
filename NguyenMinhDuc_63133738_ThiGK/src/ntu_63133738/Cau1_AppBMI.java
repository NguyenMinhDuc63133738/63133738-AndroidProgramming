package ntu_63133738;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Cau1_AppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 213, 234));
		panel_1.setBounds(0, 152, 586, 294);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(0, 446, 116, 107);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(128, 255, 128));
		panel_2_1.setBounds(113, 446, 116, 107);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(255, 255, 128));
		panel_2_2.setBounds(229, 446, 116, 107);
		contentPane.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(255, 128, 0));
		panel_2_3.setBounds(346, 446, 124, 107);
		contentPane.add(panel_2_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(new Color(255, 0, 0));
		panel_2_4.setBounds(470, 446, 116, 107);
		contentPane.add(panel_2_4);
		
		
	}
}
