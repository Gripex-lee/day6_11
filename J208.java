package day6_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J208  {  
	public static void main(String args[])  {  
		try {
			FileInputStream fis = new FileInputStream("D://test//pw.txt");  
			FileOutputStream fos = new FileOutputStream("D://test//pwcopy.txt");  
			BufferedInputStream bis = new BufferedInputStream(fis);//缓冲输入流  
			BufferedOutputStream bos = new BufferedOutputStream(fos);//缓冲输出流  
			int ch = -1;  
			while((ch = bis.read())!=-1){  
				bos.write(ch);  
			}
			bis.close();  
			bos.close();  
			System.out.println("复制完成");  
		}  
		catch (Exception e) {  
			System.out.println(e.getMessage());  
		}  
	}  
} 
