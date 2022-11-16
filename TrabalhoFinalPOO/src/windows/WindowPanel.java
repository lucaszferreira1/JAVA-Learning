package windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import objetos.Musica;
import objetos.Playlist;
import sistemas.FileHandling;
import sistemas.SimplePlayer;

public class WindowPanel extends JFrame {

	private JPanel contentPane;
	private SimplePlayer player = new SimplePlayer();
	private FileHandling fileHandler = new FileHandling();
	private Playlist allSongs = new Playlist();
	
	public WindowPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		DefaultListModel<String> model = new DefaultListModel();
		JList listPlay = new JList(model);
		listPlay.setBorder(new LineBorder(new Color(0, 0, 0)));
		listPlay.setBackground(new Color(66, 66, 66));
		listPlay.setBounds(57, 54, 261, 364);
		contentPane.add(listPlay);
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
		contentPane.add(lblMusica);
		
		JLabel lblAtual = new JLabel("Tocando: ");
		lblAtual.setForeground(new Color(0, 128, 0));
		lblAtual.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 20));
		lblAtual.setBounds(385, 15, 246, 29);
		contentPane.add(lblAtual);
		
		JButton playBttn = new JButton("Play");
		playBttn.setBounds(448, 121, 116, 36);
		contentPane.add(playBttn);
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
		contentPane.add(pauseBttn);
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
		contentPane.add(nextBttn);
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
		contentPane.add(prevBttn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 5, 5);
		contentPane.add(tabbedPane);
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
	}

}
