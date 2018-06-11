package day6_11;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 计算Fibonacii数列的前20项
 */
public class J199 {
       //数列的长度
       int i = 0;
       int[] f = null;
       public J199(int i) {
              this.i = i;
       }
       /**
        * 得到数列的函数
        * @return int[]
        */
       public int[] getFibonacii() {
              if (i <2) {
                     return new int[] {1,1};
              } else {
                     f = new int[i];
                     //给数列赋初值
                     f[0] = 1;
                     f[1] = 1;
                     for (int k=2; k<i;k++) {
                            f[k]=f[k-1]+f[k-2];
                     }
                     return f;
              }
       }
       /**
        * 保存入文件
        * @param name
        */
       public void saveToFile(String name) {
              try {
                     File file = new File(name);
                     FileOutputStream fo = new FileOutputStream(file);
                     //换行
                     int l = '\n';
                     for (int i=0; i<20;i++) {
                            //每5个一行
                            if (i!=0 && i%5==0) {
                                   fo.write(l);
                            }
                            fo.write(f[i]);
                     }
              } catch (Exception e) {
                     e.printStackTrace();
              }
       }
       //test and display
       public static void main(String[] args) {
              int[] fb20 = null;
              J199 fb = new J199(20);
              fb20 = fb.getFibonacii();
              //打印
              for (int i=0; i<20;i++) {
                     System.out.println(fb20[i]);
              }
              fb.saveToFile("D://test//a.txt");
       }
}
