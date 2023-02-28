package c09;

abstract class Animal {
   public Animal() {
      print();
      System.out.println("构造完成");
   }
   abstract void print();
}
class Rabbit extends Animal {
   void print() {
      System.out.println("Rabbit");
   }
}

public class Ex03 {
   public static void main(String[] args) {
      Animal animal = new Rabbit();
      animal.print();
   }
}
/**
 * 先调用父类构造器(调用了一次print()), 再调用print()
 */
