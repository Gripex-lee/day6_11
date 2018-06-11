package day6_11;

import java.io.File;

import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.Calendar;  
import java.util.List;  
  
public class J204 {  
    public void writeEror_to_txt(String path,String content) throws IOException{  
        File F=new File(path);  
        if(!F.exists()){  
            F.createNewFile();  
        }  
        FileWriter fw=null;  
        String writeDate=content;  
        try { 
            fw=new FileWriter(F, true);  //追加
            fw.write(writeDate+"\r\n");  //换行
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally{  
            if(fw!=null){  
                fw.close();  
            }  
        } 
    }  
    //测试方法  
    public static void main(String[] args) throws IOException {  
        String path="D://test//pw.txt";  
        String content = null;  
        try{    
            List<String> list=new ArrayList<>();  
            list.add("1");  
            list.add("2");  
            list.add("3");   
            String j=list.get(3); //越界的错误信息添加到pw.txt中 
        }catch (Exception e){  
           content=e.getClass().getName()+"  error Info  "+e.getMessage(); //错误信息 
//            content=e.getMessage();  
        }  
        J204 le=new J204();  
        le.writeEror_to_txt(path, content);  
    }  
}
