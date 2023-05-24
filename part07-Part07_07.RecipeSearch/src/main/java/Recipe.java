import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(String recipeName, int cookingTime){
        this.name = recipeName;
        this.time = cookingTime;
    }
    public Recipe(String recipeName){
        this.name = recipeName;
    }

    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    public void setTime(int cookingTime){
        this.time= cookingTime;
    }
    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.getTime();
    }
}
