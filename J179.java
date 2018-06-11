package day6_11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J179 {  
    /** 
     * 写入二进制 
     * @param file 
     */  
    public static void writeFile(File file){  
        if(file != null){  
            try {
                FileOutputStream fos = new FileOutputStream(file);  
                DataOutputStream dos = new DataOutputStream(fos);  
                dos.writeUTF("hello");  
                dos.writeUTF("我的名字是");  
                dos.writeUTF("lee");  
                dos.writeBoolean(true);  
                dos.close();  
            } catch (FileNotFoundException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
              
        }  
          
    }  
      
    /** 
     * 读取二进制文件 
     * @param file 
     */  
    public static void readFile(File file){  
        if(file != null){  
            try {  
                FileInputStream fis = new FileInputStream(file);  
                DataInputStream dis = new DataInputStream(fis);  
                System.out.println(dis.readUTF());  
                System.out.println(dis.readUTF());  
                System.out.println(dis.readUTF());  
                System.out.println(dis.readBoolean());  
                /*while(dis.available() != 0){ 
                    System.out.print((char)dis.readByte()); 
                }*/  
                dis.close();  
            } catch (FileNotFoundException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
              
        }  
    }  
      
    public static void main(String[] args) {  
        File file  = new File("fileTest2.txt");  
        writeFile(file);  
        readFile(file);  
    }  
}  
