package day6_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *文件的显示和复制
 */
public class J187 {
       //复制的文件
       File fileCopy;
       //读取的文件名
       String filename="";
       //用来存放数据的StringBuffer;
       StringBuffer sb=new StringBuffer("");
       /**
        * @param fileCopy 拷贝的文件
        * @param filename 源文件
        */
       public J187(String fileCopy,String filename){
              this.filename=filename;
              this.fileCopy=new File(fileCopy);
       }
       /**
        * 读出内容并显示
        */
       public void display(){
              try {
                     FileReader fr=new FileReader(filename);
                     BufferedReader br=new BufferedReader(fr);
                     //读数据
                     String str;
                     while((str=br.readLine())!=null){
                            sb.append(str);
                            sb.append('\n');
                     }
              } catch (Exception e) {
                     e.printStackTrace();
              }
              //显示
              System.out.println(sb.toString());
       }   
       public void copy(){
              try {
                     FileWriter fw=new FileWriter(fileCopy);
                     BufferedWriter bw=new BufferedWriter(fw);
                     //写数据流
                     bw.write(sb.toString(),0,sb.toString().length());
                     bw.flush();
              } catch (Exception e) {
                     e.printStackTrace();
              }
       }
       //test
       public static void  main(String[] args){
              J187 fda=new J187("D:\\test\\a.txt","D:\\test\\b.txt");
              fda.display();
              fda.copy();
       }
}

