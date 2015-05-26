import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class UU {

	public static void main(String[] args) {
		OutputStream outputStream;
		Writer writer;
		try {
			outputStream = new FileOutputStream("d:\\output.txt");
			writer       = new OutputStreamWriter(outputStream);
			writer.write("hello");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
