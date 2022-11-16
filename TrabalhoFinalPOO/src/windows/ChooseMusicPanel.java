package windows;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

public class ChooseMusicPanel extends JFrame {
	
	private JPanel contentPane;
	
	public ChooseMusicPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 60, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JList list = new JList();
		list.setBackground(new Color(66, 66, 66));
		list.setBounds(41, 63, 263, 358);
		contentPane.add(list);
		
		JLabel lblMusica = new JLabel("Músicas");
		lblMusica.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusica.setForeground(new Color(0, 128, 0));
		lblMusica.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 21));
		lblMusica.setBackground(Color.BLACK);
		lblMusica.setBounds(70, 24, 163, 29);
		contentPane.add(lblMusica);
		
		JButton btnEscolher = new JButton("Escolher");
		btnEscolher.setBounds(390, 172, 107, 36);
		contentPane.add(btnEscolher);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(548, 172, 107, 36);
		contentPane.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
			}
		});
		
		JLabel lblEscolhaAMsica = new JLabel("Escolha a Música");
		lblEscolhaAMsica.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaAMsica.setForeground(new Color(0, 128, 0));
		lblEscolhaAMsica.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 21));
		lblEscolhaAMsica.setBackground(Color.BLACK);
		lblEscolhaAMsica.setBounds(409, 104, 212, 29);
		contentPane.add(lblEscolhaAMsica);
	}
}
