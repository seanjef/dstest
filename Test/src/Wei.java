import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class Wei {

	public static void main(String[] args) throws IOException {
		OutputStream outputStream;
		Writer writer;
		StringBuilder builder = new StringBuilder(); 
		String data;
		/*
		for(int j =1 ; j<=6645 ; j++){
			for(int i =j ; i<=6645 ; i++){
				if(i>j){
					System.out.println(j+","+i);
					 builder.append(j+","+i+"\n"); 
				}
			}
		}
		*/
		
		
		try {
			data = builder.toString();
			outputStream = new FileOutputStream("d:\\output.txt");
			writer       = new OutputStreamWriter(outputStream);
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
