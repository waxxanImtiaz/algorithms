package serialization;

import java.io.*;

public class DogDemo {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        d1.setData("this dog1");
        d1.setLegs(2);

        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

        objectOutputStream.writeObject(d1);


        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog d2 = (Dog)ois.readObject();

        System.out.println(d2.getLegs());
        System.out.println(d2.getData());
        System.out.println(d2.pupy);

    }
}

