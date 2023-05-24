
public class Statistics {

    private int number;
    private int sum;

    public Statistics() {
        this.number = 0;
    }

    public void addNumber(int num) {
        this.number++;
        this.sum+=num;
    }

    public int getCount() {
        return this.number;
    }
    public int sum() {
        return sum;
    }

    public double average() {
        if (this.getCount() ==0){
            return 0;
        } else{
            return 1.0 * this.sum()/ this.getCount();            
        }
    }
}
