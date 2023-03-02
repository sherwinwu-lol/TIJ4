package c09.ex10;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

abstract class Instrument {
    int VALUE = 5; // static & final
    abstract void adjust();
}
interface Playable {
    void play(Note n);
}

class Wind extends Instrument implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {
        print(this + ".adjust() " );
    }
}

class Percussion extends Instrument implements Playable{
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {
        print(this + ".adjust() " );
    }
}

class Stringed extends Instrument implements Playable{
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    public void adjust() {
        print(this + ".adjust() " );
    }
}

class Brass extends Wind implements Playable{
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Playable i) {
        // 不知道Instrument到底是什么
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for (Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
