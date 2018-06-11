package day6_11;

// 文件夹以及文件的复制

import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class J182 {
    public static void main(String[] args) throws Exception {
        CopyFiles("D:\\test","E:\\test");
        System.out.println("复制完成");
    }

    private static void CopyFiles(String sourcePath, String destPath) throws Exception {
        //源路径
        File file = new File(sourcePath);
//        String name = file.getName();
//        System.out.println(name);
        //检查源路径是否正确
        if(!file.exists()){
            System.out.println("请检查您的源路径是否合法！");
        }
        
        //目标路径
        File file2 = new File(destPath);
        //如果目标文件夹不存在则创建
        if(!file2.exists()){
            file2.mkdir();//当前目录创建
        }
        File[] listFiles = file.listFiles();
        for(File f :listFiles){
            System.out.println(f.getName());
            //如果是文件夹需要在目标文件夹下创建文件夹
            if(f.isDirectory()){
                //关键步骤：递归
                //System.out.println(f+"--------->"+destPath+"\\"+f.getName());
                CopyFiles(sourcePath+"\\"+f.getName(),destPath+"\\"+f.getName());
            }
            //如果不是文件夹直接复制    
            if(f.isFile()){
                //关键步骤：递归
                //System.out.println(f+"--------->"+destPath+"\\"+f.getName());
                TestCopyDocuments.copyDocuments(sourcePath+"\\"+f.getName(),destPath+"\\"+f.getName());
            }
        }
    }
}

class TestCopyDocuments {
    public static void copyDocuments(String SourcePath, String DestPath) throws Exception {
        //读入文件到程序
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SourcePath));
        //写入数据到文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DestPath));
        byte[] b = new byte[1024];
        int len = 0;
        while((len = bis.read(b)) != -1){
            bos.write(b, 0, len);
        }
        bis.close();
        bos.close();
    }
}
