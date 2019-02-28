package TextIO;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Scanner;

public class 网络爬虫 {
	public static void main(String[] args) throws IOException {
		System.out.println("输入一个起始链接：");
		String startURL=new Scanner(System.in).next();
		ArrayList<String> asserted=Crawler(startURL);
		int i=0;
		for(String url:asserted){
			i++;
			System.out.print("网络爬虫第"+i+"条:");
			System.out.println(url);
		}
		
	}
	
	public static ArrayList<String> Crawler(String startURL) throws IOException{
		ArrayList<String> asserting=new ArrayList<>();
		ArrayList<String> asserted=new ArrayList<>();
		asserting.add(startURL);
		while (!asserting.isEmpty()&&asserted.size()<30) {
			String url=asserting.remove(0);
			if(!asserted.contains(url)){
				asserted.add(url);
				for(String string:getURL(url)){
					if (!asserted.contains(string)) {
						asserting.add(string);
					}
				}
				
			}
		}
		return asserted;
	}
	public static ArrayList<String> getURL(String url) throws IOException{
		ArrayList<String> list=new ArrayList<>();
		java.net.URL url2=new java.net.URL(url);
		Scanner reader=new Scanner(url2.openStream());
		while(reader.hasNext()){
			String string=reader.nextLine();
			int current=0;
			current=string.indexOf("http:",current);
			while (current>0) {
				int endIndex=string.indexOf("\"",current);
				if(endIndex>0){
					list.add(string.substring(current,endIndex));
					current=string.indexOf("http:",endIndex);
				}
				else {
					current=-1;
				}
				
			}
		}
		
		return list;
	}

}
