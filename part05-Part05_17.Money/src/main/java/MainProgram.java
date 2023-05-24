
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money firstMoneyObject = new Money(10, 0);
        Money secondMoneyObject = new Money(7, 40);
        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
        firstMinusSecond.euros();
        // expected:<8> but was:<0>
    }
}
