import com.sun.org.apache.xpath.internal.operations.Or;
import design.patters.Order;

public class OrderTest {

    public static void main(String[] args) {

        Order.Builder builder = new Order.Builder();

        Order order = builder.burger("Zinger").drink("Pepsi").sauce("Raita").build();

        System.out.println(order.getBurger());
        System.out.println(order.getDrink());
        System.out.println(order.getSauce());
    }
}
