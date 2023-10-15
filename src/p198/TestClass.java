package p198;

public class TestClass {
    public static void main(String[] args) {
        ((TestClass)null).method();
    }
    private static void method(){
        System.out.println("static method");
    }


}
