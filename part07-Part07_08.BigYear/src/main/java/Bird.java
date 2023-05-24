public class Bird {
    private String name, latinName;
    private int observations=0;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public void observation(){
        this.observations++;
    }
    public String getName() {
        return name;
    }
    public String getLatinName() {
        return latinName;
    }
    public int getObservations() {
        return observations;
    }
    @Override
    public String toString() {
        return this.name +"(" + this.latinName +"): " + this.observations + " observations";
    }
}
