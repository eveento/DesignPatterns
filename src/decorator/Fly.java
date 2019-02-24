package decorator;

public class Fly extends Power {


    Sayan sayan;

    public Fly(Sayan sayan) {
        this.sayan=sayan;
    }

    @Override
    public double cost() {
        return sayan.cost() - 2.5;
    }

    @Override
    String description() {
        return "Fly";
    }
}
