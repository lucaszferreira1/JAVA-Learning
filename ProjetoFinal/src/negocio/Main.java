package negocio;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
	public static void main(String args[]) throws URISyntaxException {
		for (File f : getFiles("mp3")) {
			System.out.println(f.getName());
		}
	}
	
	public static File[] getFiles(String pack) throws URISyntaxException{
		URL packURL = ClassLoader.getSystemResource(pack + "/");
		URI uri = new URI(packURL.toString());
		File folder = new File(uri.getPath());
		return folder.listFiles();
	}
}
