package lambda;

import java.time.Period;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMethods {
    static void printMessage(String name){
        System.out.println("Hello "+name);
    }
    static void printValue(int val){
        System.out.println(val);
    }
    public static void main(String[] args) {

        //consumerTest();
//        listTest();


//        consumerTest();
        listTest();
    }

    public static void consumerTest(){
        // Referring method to String type Consumer interface
//        Consumer<String> consumer1 = LambdaMethods::printMessage;
//        consumer1.accept("John");   // Calling Consumer method
//        // Referring method to Integer type Consumer interface
//        Consumer<Integer> consumer2 = LambdaMethods::printValue;
//        consumer2.accept(12);   // Calling Consumer method

        Consumer<List<Person>> listConsumer = LambdaMethods::addList;
        listConsumer.accept(Factory.getPersonList());
    }

    public static void listTest(){
        List<Person> personList = Factory.getPersonList();
//        OptionalDouble sumOfAge = personList.stream().mapToInt((person)->person.getAge()).average();
//        System.out.println(sumOfAge.isPresent());

        getListOfAgeGreaterThan27((person -> person.getAge()>27)).forEach(System.out::println);
    }

    public static Set<Person> getListOfAgeGreaterThan27(Predicate<Person> predicate){
        return Factory.getPersonList().stream().filter(predicate).collect(Collectors.toSet());
    }

    public static void addList(List<Person> list){
        int sum = list.stream().mapToInt((person)->person.getAge()).sum();
        System.out.println(sum);
    }
}
