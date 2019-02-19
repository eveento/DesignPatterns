package adapter;

public interface YPay {
    public String getCreditCardNo();
    public Double getAmount();

    public void setCreditCardNo(String _creditCardNo);
    public void setAmount(Double _amount);
}
