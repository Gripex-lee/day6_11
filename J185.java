package day6_11;

import java.io.*;
import java.util.*;

public class J185 {
	/*将G:\ebook下的所有.mobi文件放入目录G:\ebook\mobi\下。
	 * 1.对指定的目录进行递归
	 * 2.获取递归过程中的所有mobi文件的路劲
	 * 3.将这些路径存储到集合中
	 * 4.将集合中的数据写入到另一个文件中
	 */
	public static void main(String[] args) {
		File dirFile = new File("G:\\ebook\\");
		List<File>list =new ArrayList<File>();
		fileToList(dirFile,list);
		System.out.println(list.size());
		writeToFile(list, new File(dirFile,"G:\\ebook\\mobi\\").toString());
	}
	
	public static void writeToFile(List<File>list,String mobiList) {
		BufferedWriter bufw=null;
		try {
			bufw=new BufferedWriter(new FileWriter(mobiList));
			for(File f:list) {
				String pathString = f.getAbsolutePath();
				bufw.write(pathString);
				bufw.newLine();
				bufw.flush();
			}
		}catch(Exception e) {
			
		}finally {
			if(bufw!=null)
				try {
					bufw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void fileToList(File dir,List<File> list) {
		File []fies=dir.listFiles();
		for(File f:fies) {
			if(f.isDirectory())
				fileToList(f,list);
			else {
				if(f.getName().endsWith(".mobi"));
				list.add(f);
			}
		}
	}
}
