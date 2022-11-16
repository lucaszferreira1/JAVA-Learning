import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;

public class AddPlaylist extends JFrame {

	private JPanel contentPane;

	public AddPlaylist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		JList list = new JList();
		list.setBounds(26, 45, 125, 190);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Músicas");
		lblNewLabel.setBounds(61, 20, 76, 14);
		contentPane.add(lblNewLabel);
	}
}
