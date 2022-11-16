package sistemas;

import java.net.MalformedURLException;
import java.net.URL;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import objetos.Musica;
import objetos.Playlist;

public class SimplePlayer {
	private BasicPlayer player = new BasicPlayer();
	private Musica currentlyPlaying;
	
	public void play(Musica m) {
		String path = m.getFilePath();
		try {
			player.open(new URL("file:///" +  path));
			player.play();
			setCurrentlyPlaying(m);
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
			play(playList.getMusicas().get(nextIndex));
		else
			play(playList.getMusicas().get(0));
	}
	
	public void previous(Playlist playList, Musica mus) {
		stop();
		play(playList.getMusicas().get(playList.getMusicas().indexOf(mus) - 1));
	}

	public Musica getCurrentlyPlaying() {
		return currentlyPlaying;
	}

	public void setCurrentlyPlaying(Musica currentlyPlaying) {
		this.currentlyPlaying = currentlyPlaying;
	}
}
