package c05;
class Rock2 {
    String s = "a";
    String s2;

    public Rock2() {
        System.out.println(s);
        System.out.println(s2);
        System.out.println("s2赋值后");
        s2 = "b";
        System.out.println(s);
        System.out.println(s2);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Rock2 r = new Rock2();
    }
}
