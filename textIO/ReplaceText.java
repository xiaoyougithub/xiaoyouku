package TextIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
	public static void main(String[] args) throws FileNotFoundException {
		if(args.length!=4){
			System.out.println("args out of question!");
			System.exit(1);
		}
		
		File sourceFile=new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("sourceFile not exists");
			System.exit(2);
		}
		
		File targetFile=new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("targetFile exists");
			System.exit(3);
		}
		
		try(
				Scanner reader=new Scanner(sourceFile);
				PrintWriter writer=new PrintWriter(targetFile);
				){
			while (reader.hasNext()) {
				String s1=reader.nextLine();
				String s2=s1.replaceAll(args[2], args[3]);
				writer.write(s2);
				System.out.println(s2);
				
			}
			
		}
		
	}
}
