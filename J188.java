package day6_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class J188 {
	public static void main(String[] args) throws Exception {  
        File file = new File("D://test//person.txt");  
        //序列化持久化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));  
        Count person = new Count("Peter", 30000.50);  
        out.writeObject(person);  
        out.close();  
        //反序列化，并得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));  
        Object newPerson = in.readObject(); // 没有强制转换到Person类型  
        in.close();  
        System.out.println(newPerson);  
    }
}

class Count implements Serializable {  
    private String name;  
    private double money;   
    public Count(){
        System.out.println("无参构造");
    }
    public Count(String name, double money) {  
        this.name = name;  
        this.money = money;  
    }  
    //getter setter方法省略...
    @Override 
    public String toString() {  
        return name + " " + money;  
    }  
} 