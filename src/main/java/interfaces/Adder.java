package interfaces;

import java.io.Serializable;

@FunctionalInterface
public interface Adder<T extends Serializable> {
    void add(T t,T t2);
//    int add(int a,int b);
    default int anotherAdd(int a,int b){
        return a+b;
    }

    default int div(int a,int b){
        return a/b;
    }

    default int mul(int a,int b){
        return a*b;
    }
    static int againAdd(int a,int b){
        return a+b;
    }
//    int hashCode();
    String toString();
    boolean equals(Object obj);

//    default int hashCode(){
//        return 9;
//    }
}
