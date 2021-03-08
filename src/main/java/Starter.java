import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {

    interface Calculator{
        int add(int a, int b);
    }
    interface Sayable{
        void say();
    }

//    Starter(){
//        System.out.println("Hello this is constructor");
//    }

    public  void sayHello(){
        System.out.println("Hello ");
    }
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Mobile",2));
        productList.add(new Product("TV",12));
        productList.add(new Product("PC",23));
        productList.add(new Product("Bag",21));
        productList.add(new Product("Car",122));
        productList.add(new Product("Refrigrator",222));

//        Stream<Product> stream = productList.stream().filter(product -> product.getId()>2);
//
//        productList.forEach(product-> System.out.println(product.getName()));
//
//        Predicate<Product> p = (product -> product.getId()==2);
////        boolean mat = productList.stream().distinct().;
////        System.out.println(mat);
//
//        Object[] list = productList.stream().toArray();
//        //Product[] arr = (Product[])list;
//        System.out.println(((Product)list[0]).getName());
//
//
////        lambda.Sayable sayable = new Starter()::sayHello;
////
////        sayable.say();


//        Set set =  productList.stream().filter(product -> product.getId()>20).map(product -> product.getName()).collect(Collectors.toSet());
//
//        System.out.println(set);

        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);




    }



}

class Product {
    private String name;
    private double id;

    public Product(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
