package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {
    private int legs;
    private  transient  String data;
    public final String pupy = "this is puppy";
    public int getLegs() {
        return legs;
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
//        os.defaultWriteObject();
        String s = "123Imtiaz";
        os.writeObject(s);
    }

    private void readObject(ObjectInputStream ois) throws Exception{
//        ois.defaultReadObject();
        data = (String)ois.readObject();
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
