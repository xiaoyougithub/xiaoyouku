package BinaryIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;

public class Copy {
	public static void main(String[] args) throws IOException {
		if(args.length!=2){
			System.out.println("args.length!=2!");
			System.exit(1);
		}
		File sourceFile=new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("source File does not exist");
			System.exit(2);
		}
		File targetFile=new File(args[1]);
		if(targetFile.exists()){
			System.out.println("target file exist");
			System.exit(3);
		}
//		try(
//				BufferedInputStream reader=new BufferedInputStream(new FileInputStream(sourceFile));
//				BufferedOutputStream writer=new BufferedOutputStream(new FileOutputStream(targetFile));
//				){
//			int r,numberOfCopyBytes=0;
//			while ((r=reader.read())!=-1) {
//				writer.write((byte)r);
//				numberOfCopyBytes++;
//			}
//			System.out.println(numberOfCopyBytes+"bytes copied");
//		}
		try(
				FileInputStream reader=new FileInputStream(sourceFile);
				FileOutputStream writer=new FileOutputStream(targetFile);
				){
			int r,numberOfCopyBytes=0;
			while((r=reader.read())!=-1){
				writer.write(r);
				numberOfCopyBytes++;
			}
			System.out.println(numberOfCopyBytes+"copies");
		}
		
		
	}

}
