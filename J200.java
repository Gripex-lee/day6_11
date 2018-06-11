package day6_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 使用字节流进行读取数据
 */
public class J200 {
	public static void main(String[] args) throws IOException {
		zhuijia_write();
		demo_read();
		fugai_write();
		demo_read();
	}
	public static void demo_read() throws IOException {
		FileInputStream fis=new FileInputStream("fos.dat");
		byte [] b=new byte [1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			System.out.println(new String(b));
		}
	//一次只读取一个字符
	// int len=0;
	// while((len=fis.read())!=-1)
	// {
	// System.out.println((char)len);
	// }
}
	public static void fugai_write() throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.dat",false);
		fos.write("helloworld".getBytes());
		fos.close();
	}
	public static void zhuijia_write() throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.dat",true);
		fos.write("helloworld".getBytes());
		fos.close();
	}
}
