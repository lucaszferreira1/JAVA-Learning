package sistemas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AudioParser {
	public Metadata getMetadata(String filePath) {
		try {
			InputStream input = new FileInputStream(new File(filePath));
		    ContentHandler handler = new DefaultHandler();
		    Metadata metadata = new Metadata();
		    Parser parser = new Mp3Parser();
		    ParseContext parseCtx = new ParseContext();
		    parser.parse(input, handler, metadata, parseCtx);
		    input.close();
		    return metadata;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (TikaException e) {
			e.printStackTrace();
		}
		return null;
	}
}
