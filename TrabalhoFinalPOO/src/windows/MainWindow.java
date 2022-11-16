package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;
import java.awt.Color;
import javax.swing.border.LineBorder;

import objetos.*;
import sistemas.*;

public class MainWindow {

	private JFrame frame;
	private SimplePlayer player = new SimplePlayer();
	private FileHandling fileHandler = new FileHandling();
	private Playlist allSongs = new Playlist();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWindow window = new MainWindow();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 *
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 60, 60));
		frame.setBounds(100, 100, 720, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultListModel<String> model = new DefaultListModel();
		JList listPlay = new JList(model);
		listPlay.setBorder(new LineBorder(new Color(0, 0, 0)));
		listPlay.setBackground(new Color(66, 66, 66));
		listPlay.setBounds(57, 54, 261, 364);
		frame.getContentPane().add(listPlay);
		try {
			int i = 0;
			for(File f : fileHandler.getFiles()) {
				Musica mus = new Musica();
				mus.fileToMusica(f);
				this.allSongs.addMusica(mus);
				model.add(i, mus.toString());
				i++;
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		
		
		JLabel lblMusica = new JLabel("Músicas");
		lblMusica.setForeground(new Color(0, 128, 0));
		lblMusica.setBackground(new Color(0, 0, 0));
		lblMusica.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 21));
		lblMusica.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusica.setBounds(102, 10, 163, 29);
		frame.getContentPane().add(lblMusica);
		
		JLabel lblAtual = new JLabel("Tocando: ");
		lblAtual.setForeground(new Color(0, 128, 0));
		lblAtual.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 20));
		lblAtual.setBounds(385, 15, 246, 29);
		frame.getContentPane().add(lblAtual);
		
		JButton playBttn = new JButton("Play");
		playBttn.setBounds(448, 121, 116, 36);
		frame.getContentPane().add(playBttn);
		playBttn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					player.play(fileHandler.getFiles()[listPlay.getSelectedIndex()].getName());
				}catch(Exception e) {
					System.err.println("Erro ao tentar tocar música");
				}
			}
		});
		
		JButton pauseBttn = new JButton("Pause");
		pauseBttn.setBounds(448, 167, 116, 36);
		frame.getContentPane().add(pauseBttn);
		pauseBttn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					player.pause();
				}catch(Exception e) {
					System.err.println("Erro ao tentar pausar música");
				}
			}
		});
		
		JButton nextBttn = new JButton("Próxima");
		nextBttn.setBounds(385, 225, 107, 36);
		frame.getContentPane().add(nextBttn);
		nextBttn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					player.next(null, null);
				}catch(Exception e) {
					System.err.println("Erro ao tentar tocar a próxima música");
				}
			}
		});
		
		JButton prevBttn = new JButton("Anterior");
		prevBttn.setBounds(524, 225, 107, 36);
		frame.getContentPane().add(prevBttn);
		prevBttn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					player.previous(null, null);
				}catch(Exception e) {
					System.err.println("Erro ao tentar tocar música anterior");
				}
			}
		});
		
		JButton bttnAddMusica = new JButton("Add Música");
		bttnAddMusica.setBounds(385, 326, 107, 36);
		frame.getContentPane().add(bttnAddMusica);
		bttnAddMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMusicaPanel panelAddMusica = new AddMusicaPanel();
				panelAddMusica.setVisible(true);
			}
		});
		
		JButton bttnAddPlaylist = new JButton("Add Playlist");
		bttnAddPlaylist.setBounds(524, 326, 107, 36);
		frame.getContentPane().add(bttnAddPlaylist);
		bttnAddPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPlaylistPanel panelAddPlaylist = new AddPlaylistPanel();
				panelAddPlaylist.setVisible(true);
			}
		});
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
