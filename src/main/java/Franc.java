public class Franc extends Money{

    private String currency;

    Franc(int amount, String currency){

        this.amount  = amount;
        this.currency = currency;
    }

    Money times(int multiplier){

        return Money.franc(amount * multiplier);
    }

    String currency(){
        return currency;
    }

}
