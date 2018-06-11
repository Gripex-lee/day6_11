package day6_11;

import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;
import java.util.Properties;  

public class J183 {  
    public static void main(String[] args) throws IOException {  
        //创建properties集合  
        Properties prop=new Properties();  
        prop.setProperty("name","root");  
        prop.setProperty("pass","123456");  
        prop.setProperty("key","value");  
        //调试list显示在控制台上  
        prop.list(System.out);  
    }  
} 
