
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        // create a new Money object that has the correct worth
        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;

        } else if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            }
        }

        return false;
    }

    public Money minus(Money decreaser) {

        if (decreaser.euros < 0 || decreaser.cents < 0) {
            return new Money(0, 0);
        }
        
        int hereEuro= this.euros;
        int hereCents = this.cents;
            
        
        if (this.cents ==0 & decreaser.cents()!=0){
            hereEuro= this.euros-1;
            hereCents =100;
        }
        
        
        int newEuros = hereEuro - decreaser.euros();
        int newCents = hereCents - decreaser.cents();

        if (newEuros < 0 || newCents < 0) {
            return new Money(0, 0);
        } else {
            return new Money(newEuros, newCents);
        }

    }
}
