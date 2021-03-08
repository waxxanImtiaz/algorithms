package lambda;

import interfaces.Adder;

public class LambdaExpression  {
    public static void main(String[] args) {

//        List<lambda.Person> personList = lambda.Factory.getPersonList();
//        personList.forEach((person)->{if (person.getId()%2 == 0) System.out.println(person.getName());});
//
//
//        Thread thread =getName new Thread(lambda.LambdaExpression::run);
//        thread.start();

//        lambda.LambdaExpression exp = new lambda.LambdaExpression();
////        int res = exp.anotherAdd(1,3);
////
////        System.out.println(res);
//
//        BiFunction<Integer, Integer, Integer> adder = Adder::againAdd;
//        int result = adder.apply(10, 20);
//        System.out.println(result);

//        BiFunction<Integer, Integer, Integer>adder1 = lambda.LambdaExpression::add;
////        BiFunction<Integer, Float, Integer>adder2 = lambda.LambdaExpression::add;
////        BiFunction<Float, Float, Float>adder3 = lambda.LambdaExpression::add;
//        int result1 = adder1.apply(10, 20);
////        float result2 = adder2.apply(10, 20.0f);
////        float result3 = adder3.apply(10.0f, 20.0f);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);



//        lambda.Sayable sayable = (new lambda.LambdaExpression())::say;
//        sayable.say();
//
//
//        Thread t = new Thread(sayable::say);
//        t.start();

        Sayable sayableInt = LambdaExpression::new;
        sayableInt.say();
        sayableInt.say();
        sayableInt.say();
        sayableInt.say();
        sayableInt.say();
        sayableInt.say();
    }


    public LambdaExpression(){
        System.out.println("This is constructor");
    }
    public static int add(int a, int b){
        return a+b;
    }
//    public static float add(int a, float b){
//        return a+b;
//    }
//    public static float add(float a, float b){
//        return a+b;
//    }

    public static void run(){
        System.out.println("run method in "+LambdaExpression.class.getName());
    }


    public void say(){
        System.out.println("This is say method inside "+LambdaExpression.class.getSimpleName());
    }

//    class AdderImplementer implements Adder{
//
//        @Override
//        public int add(int a, int b) {
//            return 0;
//        }
//    }

}
@FunctionalInterface
interface Sayable{
    void say();
}
