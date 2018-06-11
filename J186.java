package day6_11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class J186 {
	public static void main(String[] args) {
		J186 h=new J186();
		h.upZip("‪D:\\test\\.zip","E:\\test\\","6-11");
	}
	
	public void upZip(String merchantZipPath, String merchantUnZipPath,String fileDate) {
	    String filePath = merchantZipPath+File.separator+"merchant_good_"+fileDate+".zip";
	    File file = new File(filePath);

	    ZipFile zipFile = null;
	    try {
	        zipFile = new ZipFile(file,Charset.forName("GBK"));//设置编码格式
	        Enumeration<?> e = zipFile.entries();
	        while(e.hasMoreElements()){
	            ZipEntry zipEntry = (ZipEntry) e.nextElement();
	            String name = zipEntry.getName();
	            if(zipEntry.isDirectory()){
	                name = name.substring(0,name.length()-1);
	                File file2 = new File(merchantUnZipPath+File.separator+name);   
	                file2.mkdirs();
	            }else {
	                File file2 = new File(merchantUnZipPath+File.separator+"merchant_good_"+fileDate+File.separator+name);
	                file2.getParentFile().mkdirs();
	                file2.createNewFile();
	                InputStream in = zipFile.getInputStream(zipEntry);
	                FileOutputStream out = new FileOutputStream(file2);
	                int length = 0;
	                byte[] readByte =new byte[1024];
	                try {
	                    while((length=in.read(readByte,0,1024))!=-1){
	                        out.write(readByte, 0, length);  
	                    }                   
	                } catch (Exception e2) {
	                    System.out.println("解压文件失败!"+e2);
	                }
	            }
	        }

	    } catch (IOException e) {
	    	 System.out.println("解压文件不存在!"+e);
	    }
	}
}
