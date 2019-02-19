package adapter;

public class Adapter implements YPay {

    private String custCardNo;
    private Double amount;

    private XPay xPay;

    public Adapter(XPay xPay) {
        this.xPay = xPay;
        setProperties();
    }

    @Override
    public String getCreditCardNo() {
        return custCardNo;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNo(String _creditCardNo) {
        this.custCardNo=_creditCardNo;
    }

    @Override
    public void setAmount(Double _amount) {
        this.amount=_amount;
    }

    private void setProperties(){
        setCreditCardNo(this.xPay.getCreditCardNo());
        setAmount(this.xPay.getAmount());
    }
}
