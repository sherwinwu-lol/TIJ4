package c09;

abstract class Music {
 abstract void play2();
}

class Piano extends Music {
    void play() {
        System.out.println("Piano.play()");
    }
    void play2() {
        System.out.println("Piano.play2()");
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Music music = new Piano();
        Piano piano = (Piano) music;
        piano.play();
        music.play2();
    }
}
/**
 * 抽象类把抽象性给明确声明出来了
 */
