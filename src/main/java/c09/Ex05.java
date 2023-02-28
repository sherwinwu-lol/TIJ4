package c09;
interface Rocker {
    void f1();
    void f2();
    void f3();
}
class Test implements Rocker {
    public void f1() {
        System.out.println("f1");
    }
    public void f2() {
        System.out.println("f2");
    }
    public void f3() {
        System.out.println("f3");
    }
}
public class Ex05 {
    public static void main(String[] args) {
        Test test = new Test();
        test.f1();
        test.f2();
        test.f3();
    }
}
