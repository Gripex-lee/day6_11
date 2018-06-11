package day6_11;

import java.io.File;

public class J191 {
   public static void main(String[] args) {
      File f = null;
      try{
         // create new file
         f = new File("D://test//hello.txt");//在默认路径创建一个file类
         f.createNewFile();//返回true或者false判断该文件是否已经创建好    
      }catch(Exception e){
         e.printStackTrace();
      }
   }
}
