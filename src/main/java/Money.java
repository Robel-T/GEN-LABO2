class Money implements Expression{
    protected String currency;

    public Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    protected int amount;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object o){
        Money money = (Money)o;
        return amount == money.amount && currency().equals(money.currency());
    }

    public String currency(){
        return currency;
    }

    public String toString(){
        return amount + " " + currency;
    }

    public Money reduce(Bank bank, String to){
        int rate = bank.rate(currency,to);
        return new Money(amount / rate, to);
    }
}
