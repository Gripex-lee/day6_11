package day6_11;

import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;
import java.util.Properties;  
public class J184 {  
  
    public static void main(String[] args) throws IOException {  
        //创建properties集合  
        Properties prop=new Properties();  
        //存储  
        prop.setProperty("phone","10086");  
        prop.setProperty("name","root");  
        prop.setProperty("key","value");  
        prop.setProperty("pass","liu");
        //调试list显示在控制台上  
        prop.list(System.out);  
        //调用store存储到文件里  使用ISO-8859-1 字符编码  
        FileOutputStream fos=new FileOutputStream("D:\\test\\b.txt");  
        prop.store(fos,"name+age");  

        //调用load将文件里的数据读取  
        prop=new Properties();  
        FileInputStream fis=new FileInputStream("D:\\test\\b.txt");  
        prop.load(fis);  
        prop.list(System.out);  
    }  
} 
