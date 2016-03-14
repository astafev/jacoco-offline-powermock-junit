public class StaticClass {
    public static void hello(String hello) {
        if(!"hello".equals(hello)) {
            throw new IllegalArgumentException("what?");
        }
    }
}
