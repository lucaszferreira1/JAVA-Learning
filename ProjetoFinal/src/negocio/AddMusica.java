import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class AddMusica extends JFrame{
	
	private JPanel contentPane;
	
	public AddMusica() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(100, 50, 200, 20);
		contentPane.add(textPane);
		
		JButton bttnArquivo = new JButton("Selecionar Arquivo");
		bttnArquivo.setBounds(125, 81, 150, 23);
		contentPane.add(bttnArquivo);
		bttnArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int status = fileChooser.showOpenDialog(null);
		        if (status == JFileChooser.APPROVE_OPTION) {
		            File file = fileChooser.getSelectedFile();
		            if (file == null) {
		                System.err.print("Escolha um arquivo");
		            }

		            String fileName = fileChooser.getSelectedFile().getAbsolutePath();
		            textPane.setText(fileName);
		        }
			}
		});
		
		
		
		JButton bttnAdicionar = new JButton("Adicionar");
		bttnAdicionar.setBounds(150, 115, 89, 23);
		contentPane.add(bttnAdicionar);
		bttnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton bttnCancelar = new JButton("Cancelar");
		bttnCancelar.setBounds(150, 149, 89, 23);
		contentPane.add(bttnCancelar);
		bttnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
			}
		});
		
		setContentPane(contentPane);
	}
}
