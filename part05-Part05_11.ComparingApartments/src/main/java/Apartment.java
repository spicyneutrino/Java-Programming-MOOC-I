
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int priceDiff = this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares;
        if (priceDiff > 0) {
            return priceDiff;
        } else {
            return -1 * priceDiff;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int priceDiff = this.pricePerSquare * this.squares - compared.pricePerSquare * this.squares;
        if (priceDiff > 0) {
            return true;
        } else {
            return false;
        }
    }

}
