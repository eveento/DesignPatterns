package decorator;

public class Decorator{

    public static void main(String[] argc) {
        Sayan sayan = new SSJGoddo();

        sayan = new Fly(sayan);
        sayan = new Kamehameha(sayan);

        System.out.println();
        System.out.println(sayan.cost());
    }
}