package c09.ex07;

public class Ex {

    public static void main(String[] args) {
        Rodent[] a = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        playAll(a);
    }

    static void playAll(Rodent[] a) {
        for (Rodent r : a) {
            r.play();
        }
    }

}
