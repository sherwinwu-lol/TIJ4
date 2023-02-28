package c09.ex07;

class Hamster implements Rodent {
    @Override
    public void play() {
        System.out.println("Hamster.play()");
    }

    @Override
    public String what() {
        return "Hamster";
    }
}
