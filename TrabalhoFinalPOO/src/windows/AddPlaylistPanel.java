package windows;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPlaylistPanel extends JFrame {
	
	private JPanel contentPane;

	public AddPlaylistPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 60, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBackground(new Color(66, 66, 66));
		list.setBounds(26, 45, 254, 380);
		contentPane.add(list);
		
		JLabel lblMusicas = new JLabel("Músicas");
		lblMusicas.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 21));
		lblMusicas.setForeground(new Color(0, 128, 0));
		lblMusicas.setBounds(92, 10, 139, 25);
		contentPane.add(lblMusicas);
		
		JTextField textField = new JTextField();
		textField.setBounds(434, 100, 166, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(0, 128, 0));
		lblNome.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 21));
		lblNome.setBounds(434, 65, 96, 25);
		contentPane.add(lblNome);
		
		JButton bttnEscolherMusica = new JButton("Escolher Música");
		bttnEscolherMusica.setBounds(392, 180, 278, 36);
		contentPane.add(bttnEscolherMusica);
		bttnEscolherMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseMusicPanel panelEscolhaMusica = new ChooseMusicPanel();
				panelEscolhaMusica.setVisible(true);
			}
		});
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(392, 277, 278, 36);
		contentPane.add(btnRemover);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(392, 371, 107, 36);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
			}
		});
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.setBounds(563, 371, 107, 36);
		contentPane.add(btnCriar);
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		setContentPane(contentPane);
	}
}