package BinaryIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		File file=new File("D://temp.txt");
		FileOutputStream writer=new FileOutputStream(file);
		for(int i=0;i<11;i++){
			writer.write(i);	
		}
		writer.close();
		FileInputStream reader=new FileInputStream(file);
		int value;
		while ((value=reader.read())!=-1) {
			System.out.print(" "+value);
		}
	}
	
}
