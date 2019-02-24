package decorator;

public class Kamehameha  extends Power{
    Sayan sayan;

    public Kamehameha(Sayan sayan) {
    this.sayan=sayan;
    }

    @Override
    public double cost() {
        return sayan.cost() - 5;
    }

    @Override
    String description() {
        return "Kamehameha";
    }
}
