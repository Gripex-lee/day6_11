package day6_11;

import java.io.File;

public class J195 {
	public static void main(String[] args) {
		File f=new File("D://test//MYDIR");
		f.delete();
	}
}
/*	public static void main(String[] args) {
		delFolder("D://test//y");
	}
	
	public static void delFolder(String folderPath) {
        try {
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            myFilePath.delete(); //删除空文件夹
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    */
