import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        String recipesText = "";
        ArrayList<Recipe> recipeList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println();
        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {
            String character = "";
            while (scanFile.hasNextLine()) {
                character = "=";
                recipesText += scanFile.nextLine() + character;
            }

            String[] recipeEach = recipesText.split("==");
            System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n");

            for(int i=0;i<recipeEach.length;i++){
                String[] recipeEachBroken = recipeEach[i].split("=");
                //adding new recipe to list of recipes
                recipeList.add(new Recipe (recipeEachBroken[0],Integer.valueOf(recipeEachBroken[1])));
                for (int j=2;j<recipeEachBroken.length;j++){
                    // adding ingredients to recently added recipe
                    recipeList.get(i).addIngredient(recipeEachBroken[j]);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")){
                break;
            }
    
            switch (command){
                case "list":
                    printRecipes(recipeList);
                    continue;
                case "find name":
                    System.out.print("Searched word: ");
                    searchName(recipeList, scanner.nextLine());
                    continue;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    searchTime(recipeList, Integer.valueOf(scanner.nextLine()));
                    continue;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    searchIngredient(recipeList, scanner.nextLine());
                    continue;
            }
            continue;
        }
        

    }

    public static void printRecipes(ArrayList<Recipe> recipeList) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
    }

    public static void searchName(ArrayList<Recipe> recipeList, String name) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public static void searchTime(ArrayList<Recipe> recipeList, int time) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public static void searchIngredient(ArrayList<Recipe> recipeList, String ingredient) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

}
