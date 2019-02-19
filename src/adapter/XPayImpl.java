package adapter;

public class XPayImpl implements XPay {

    private String creditCardNo;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNo(String _creditCardNo) {
        this.creditCardNo=_creditCardNo;
    }

    @Override
    public void setAmount(Double _amount) {
        this.amount=_amount;

    }
}
