package TextIO;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入一个URL：");
		String urlString=new Scanner(System.in).next();
		
		try {
			URL url=new URL(urlString);
			int count=0;
			Scanner reader=new Scanner(url.openStream());
			PrintWriter writer=new PrintWriter("D:/readFromWeb.txt");
			while (reader.hasNext()) {
				writer.write(reader.nextLine());
				count+=1;
				
			}
			reader.close();
			writer.close();
			System.out.println("这个web上的文件有"+count+"行");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
