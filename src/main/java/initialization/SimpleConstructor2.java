package initialization;

import static net.mindview.util.Print.printnb;

class Rock2 {
    Rock2(int i) {
        printnb("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}
