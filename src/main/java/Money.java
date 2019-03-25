abstract class Money {
    protected String currency;

    abstract Money times(int multiplier);

    protected int amount;

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object o){
        Money money = (Money)o;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    String currency(){
        return currency;
    }

}
