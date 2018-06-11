package day6_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J203 {
	public static void main(String[] args) {
		String oldPath="D://test//pw.txt";
		String newPath="D://test//pw1.txt";
		copyFile(oldPath,newPath);
	}
	
	public static void copyFile(String old, String newPath){  
        BufferedInputStream bis = null;  
        BufferedOutputStream bos = null;  
        try {  
            File file1 = new File(old);  
            File file2 = new File(newPath);  
            
            FileInputStream fis = new FileInputStream(file1);  
            FileOutputStream fos = new FileOutputStream(file2);  
              
            bis = new BufferedInputStream(fis);  
            bos = new BufferedOutputStream(fos);  
              
            byte[] b = new byte[1024];  
            int len;  
            while((len = bis.read(b)) != -1){  
                bos.write(b, 0, len);  
            }  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally{  
            if(bis != null){  
                try {  
                    bis.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
            if(bos != null){  
                try {  
                    bos.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        } 
    }
}
