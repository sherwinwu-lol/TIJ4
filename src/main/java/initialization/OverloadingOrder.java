package initialization;

public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println(String.format("String s:%s,i:%d", s, i));
    }

    static void f(int i, String s) {
        System.out.println(String.format("Int s:%s,i:%d", s, i));
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
