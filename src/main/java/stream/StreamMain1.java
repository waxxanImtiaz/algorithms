package stream;

import com.sun.istack.internal.Nullable;
import lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char x = 0;
        double y = 0;
        String z = "";
        System.out.println("Enter number");
//        x = sc.match();
        y = sc.nextDouble();
        sc.reset();

        z = sc.nextLine();

//        System.out.println();
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 12, 32, 122);
//
////        list.stream().filter( integer -> integer % 2 == 0).collect(Collectors.toList())
////                .stream().forEach(System.out::println);
//
//
//        List<Person> personList = Arrays.asList(new Person(1, "Imtiaz", 32),
//                new Person(2, "Kamran", 44), new Person(3, "Munwar", 43));
//
//
//        List<String> arr = personList.stream().filter(person -> person.getAge() > 32).map(person -> person.getName()).collect(Collectors.toList());
////                .stream().forEach(System.out::println);
//
//        String[] people = {"Kamran","Zeeshan","Imtiaz","Zubair"};
//        Integer[] array = {1,2,3,4,5};
//
//        Stream<Integer> stringStream = Arrays.stream(array);
//
//        stringStream.forEach(integer ->  Optional.of(integer).ifPresent(i -> list.stream().filter(integer1 -> integer1 > 15).findFirst().get()));
    }
}
