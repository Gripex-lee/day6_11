package day6_11;
 
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.OutputStreamWriter;  
  
public class J197 {  
    public static void write(String path, String content, String encoding) throws IOException {  
        File file = new File(path);
        file.createNewFile();  
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(  
                new FileOutputStream(file), encoding));  
        writer.write(content);  
        writer.close();  
    } 
  
    public static void main(String[] args) throws IOException {  
        String content = "Mr范";  
        String path = "D://test//osw.txt";  
        String encoding = "GBK";  
        J197.write(path, content, encoding);   
    }  
} 
