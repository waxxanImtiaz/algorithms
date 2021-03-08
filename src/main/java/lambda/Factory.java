package lambda;

import lambda.Person;

import java.util.Arrays;
import java.util.List;

public class Factory {

    public static List<Person> getPersonList(){
        return Arrays.asList(new Person(1,"Imtiaz",26),
                new Person(2,"Kamran",27)
                ,new Person(3,"Imtiaz",28)
                ,new Person(4,"Imtiaz",29));
    }
}
