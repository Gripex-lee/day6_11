package day6_11;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class J180 {
	public static void list(String name) {
		try {
			File f = new File(name);
			if (!f.exists()) {
				System.out.println("文件不存在哦");
				return;
			}
			if (f.isDirectory()) {
				File[] list = f.listFiles(getFilter(".txt"));//以某方式结尾
				for (int i = 0; i < list.length; i++)
					System.out.println(list[i].toString());
				list = f.listFiles(getNotDirFileFilter());
				for (int i = 0; i < list.length; i++)
					if (list[i].isDirectory())
						list(list[i].toString());
				}
			} catch (Exception e) {
				System.out.println("IO error!/r/n" + e.toString());
			}
		}
public static void main(String[] args) {
	 list("D://windows");
}

public static FilenameFilter getFilter(String extension) {// 指定扩展名过滤
	final String _extension = extension;
	return new FilenameFilter() {
		public boolean accept(File file, String name) {
			boolean ret = name.endsWith(_extension);
			return ret;
  		}
  	};
}
public static FileFilter getNotDirFileFilter() { // 文件还是目录过滤
	  return new FileFilter() {
		  public boolean accept(File file) {
			  return file.isDirectory();//关键判断点
		  }
	  };
 	}
}
