package adapter;

public class Application {

    public static void main(String[] args){

        XPay xPay = new XPayImpl();
        xPay.setCreditCardNo("Platnosc od dostawcy X");
        xPay.setAmount(1.0);

        YPay yPay = new Adapter(xPay);

        System.out.println("Dostawca Y: " + yPay.getCreditCardNo());
        System.out.println("Cena Y: " + yPay.getAmount());
    }
}
