public class Sum implements Expression{
    Money augend;
    Money addend;

    Sum(Money augend, Money addend){
        this.addend = addend;
        this.augend = augend;
    }
}
