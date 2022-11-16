package sistemas;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
	private String pack = "musics";
	private String paths = "musicas.csv";
	
	public File[] getFiles() throws URISyntaxException{
		URL packURL = ClassLoader.getSystemResource(this.pack + "/");
		URI uri = new URI(packURL.toString());
		File folder = new File(uri.getPath());
		return folder.listFiles();
	}
	
//	public List<String> getPaths() {
//		String fileURL = ClassLoader.getSystemResource(this.pack + "/" + this.paths + "/").toString();
//		EditorTexto editorTexto = new EditorTexto();
//		List<String> lista = new ArrayList<String>();
//		lista = editorTexto.leTexto(fileURL);
//		System.out.println(lista);
//		return lista;
//	}
}
