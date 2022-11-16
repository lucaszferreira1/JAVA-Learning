import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton bttnAddMusica = new JButton("Add Musica");
		bttnAddMusica.setBounds(116, 129, 89, 23);
		frame.getContentPane().add(bttnAddMusica);
		bttnAddMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMusica panelAddMusica = new AddMusica();
				panelAddMusica.setVisible(true);
			}
		});
		
		JButton bttnAddPlaylist = new JButton("Add Playlist");
		bttnAddPlaylist.setBounds(248, 129, 89, 23);
		frame.getContentPane().add(bttnAddPlaylist);
		bttnAddPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPlaylist panelAddPlaylist = new AddPlaylist();
				panelAddPlaylist.setVisible(true);
			}
		});
	}
}
