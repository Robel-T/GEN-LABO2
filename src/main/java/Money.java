abstract class Money {
    abstract Money times(int multiplier);

    protected int amount;

    static Money dollar(int amount){
        return new Dollar(amount);
    }

    public boolean equals(Object o){
        Money money = (Money)o;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
