package day6_11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J196 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String filename=br.nextLine();
		String content =br.nextLine();
		br.close();
		writerContent(filename,content);
		System.out.println("Successful write!");
	}
	public static void writerContent(String fileName,String s){
		        File file2 = new File("D://test//"+fileName);
		        if(!file2.exists()){
		         try{
		          file2.createNewFile();
		         }catch(IOException e){
		          e.printStackTrace();
		         }
		        }
		        FileWriter fileWriter;
		        try{
		            fileWriter = new FileWriter(file2);
		            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		            bufferedWriter.write(s.toString());
		            bufferedWriter.close();
		        }catch(IOException e){
		         e.printStackTrace();
		        }
		 }
}
