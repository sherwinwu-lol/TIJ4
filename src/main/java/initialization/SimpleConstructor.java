package initialization;

import static net.mindview.util.Print.printnb;

class Rock {
    Rock() {
        printnb("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
