package c02;

/***
 * int和char默认初始化
 *  默认构造器对其初始化了
 */
public class Ex01 {
    int a;
    char c;

    public static void main(String[] args) {
        Ex01 ex = new Ex01();
        System.out.println(ex.a);
        System.out.println(ex.c);
    }
}
