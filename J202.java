package day6_11;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class J202 {
	public static void main(String[] args) {
		File file=new File("D://test//pw.txt");
		//IO流声明
		InputStream in=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		try {
			in=new BufferedInputStream(new FileInputStream(file));
			ir=new InputStreamReader(in,"utf-8");
			br=new BufferedReader(ir);
			String line="";
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
