package c09.ex07;

class Mouse implements Rodent {
    @Override
    public void play() {
        System.out.println("Mouse.play()");
    }

    @Override
    public String what() {
        return "Mouse";
    }
}
