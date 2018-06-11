package day6_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class J207 {
	public static void main(String[] args) throws Exception {  
        File file = new File("D://test//emp.obj");  
        //序列化持久化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));  
        Emp person = new Emp("张三", 15,"男",4000);  
        out.writeObject(person);  
        out.close();  
        //反序列化，并得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));  
        Object newPerson = in.readObject(); // 没有强制转换到Person类型  
        in.close();  
        System.out.println(newPerson);  
    }
}

class Emp implements Serializable {  
    private String name;  
    private int age; 
    private String gender;
    private int salary;
    public Emp(){
        System.out.println("无参构造");
    }
    public Emp(String name, int age,String gender, int salary) {  
        this.name = name;  
        this.age = age;
        this.gender=gender;
        this.salary=salary;
    }  
    //getter setter方法省略...
    @Override 
    public String toString() {  
        return name + " " + age+" "+gender+" "+salary;  
    }  
} 
