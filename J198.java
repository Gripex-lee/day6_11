package day6_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class J198 {
	
	public static void main(String[] args) throws IOException {  
    	String path="D://test//osw.txt";
    	String encoding="GBK";
        System.out.println(J198.read(path, encoding));  
    }
	
	public static String read(String path, String encoding) throws IOException {  
        String content = "";  
        File file = new File(path);  
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));  
        String line = null;  
        while ((line = reader.readLine()) != null) {  
            content += line + "\n";  
        }  
        reader.close();  
        return content;  
    }  
}
