package day6_11;

import java.io.FileInputStream;
import java.io.IOException;


public class J201 {
	public static void main(String[] args) throws IOException {
		demo_read();
	}
	public static void demo_read() throws IOException {
		FileInputStream fis=new FileInputStream("fos.dat");
		byte [] b=new byte [1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			System.out.println(new String(b));
		}
	}
}
