package day6_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class J206 {
	public static void main(String[] args) throws IOException {
		//新建文件
		File f=new File("D://test//a.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//写入内容FileOutStream
		FileOutputStream fos=new FileOutputStream("D://test//a.txt");
		fos.write("helloworld".getBytes());
		fos.close();
		//输入流FileInputStream
		FileInputStream fis=new FileInputStream("D://test//a.txt");
		byte [] b=new byte [1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			System.out.println(new String(b));
		}	
	}
}
