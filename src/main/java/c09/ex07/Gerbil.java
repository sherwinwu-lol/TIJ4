package c09.ex07;

class Gerbil implements Rodent {
    @Override
    public void play() {
        System.out.println("Gerbil.play()");
    }

    @Override
    public String what() {
        return "Gerbil";
    }
}
