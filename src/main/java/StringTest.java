public class StringTest {
    public static void main(String[] args) {

        String s1 = new String("abc");

        String s2 = "abc";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        test();
    }

    static void test(){
        String s3 = "abc";
        System.out.println(s3.hashCode());
    }
}
