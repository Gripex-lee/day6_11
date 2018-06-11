package day6_11;

import java.io.File;

public class J194 {
	public static void main(String[] args) {
		File f=new File("D://test//a");
		f.mkdirs();
		File g=new File("D://test//a//b");
		g.mkdirs();
		File h=new File("D://test//a//b//C");
		h.mkdirs();
		File M=new File("D://test//X//b//C");
		M.mkdirs();
	}
}
