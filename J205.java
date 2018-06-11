package day6_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J205{
	public static void main(String[] args) {
		FileUtils b=new FileUtils();
		b.toCopy("D://test//pw.txt","D://test//my.txt");
	}
}

class FileUtils { 
	public String oldPath;
	public String newPath;
    public boolean toCopy(String oldPath,String newPath){  
        this.oldPath=oldPath;
        this.newPath=newPath;
    	boolean flag = false;
    	//输入源文件  
        File oldfile = new File(oldPath) ;  
        FileInputStream fr=null;  
        //复制目标文件  
        File newFile = new File(newPath);  
        FileOutputStream bw=null;  
        try {  
            fr = new FileInputStream(oldfile);  
            bw = new FileOutputStream(newFile);  
              
            //buffer  
            byte[] b = new byte[512];  
            while(fr.read(b)!=-1){  
                bw.write(b);  
            }  
            bw.flush();  
            flag=true;  
        } catch (FileNotFoundException e) {   
            e.printStackTrace();  
        }catch (IOException e) {   
            e.printStackTrace();  
        }finally{  
            if(fr != null)  
                try {  
                    fr.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            if(bw != null){  
                try {  
                    bw.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return flag;  
    }     
}
