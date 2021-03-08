package work;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Calculator {
    default int methodA(int a, int b) {
        return a - b;
    }
}

public class CalculatorInvocation implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        throws Throwable {
//            LOGGER.info("Invoked method: {}", method.getName());
        System.out.println("Invoked");
            return new Object();

    }
}   

class MainClass extends CalculatorInvocation {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new CalculatorInvocation();
        Calculator c = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),new Class[]{Calculator.class},invocationHandler);
        System.out.println(c.methodA(1, 3));
    }
}