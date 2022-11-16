package sistemas;

import java.net.MalformedURLException;
import java.net.URL;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import objetos.Musica;
import objetos.Playlist;

public class SimplePlayer {
	private BasicPlayer player = new BasicPlayer();
	
	public void play(String filePath) {
		String path = System.getProperty("user.dir") + "/src/musics/" + filePath;
		try {
			player.open(new URL("file:///" +  path));
			player.play();
		}catch(BasicPlayerException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void pause() {
		try {
			player.pause();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		try {
			player.stop();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public void next(Playlist playList, Musica mus) {
		int nextIndex = playList.getMusicas().indexOf(mus) + 1;
		stop();
		if (playList.getMusicas().get(nextIndex) != null)
			play(playList.getMusicas().get(playList.getMusicas().indexOf(mus) + 1).getFilePath());
		else
			play(playList.getMusicas().get(0).getFilePath());
	}
	
	public void previous(Playlist playList, Musica mus) {
		stop();
		play(playList.getMusicas().get(playList.getMusicas().indexOf(mus) - 1).getFilePath());
	}
}
