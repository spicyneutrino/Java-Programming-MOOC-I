
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */

public class JokeManager {

    private ArrayList<String> manager;

    public JokeManager() {
        this.manager= new ArrayList<>();
    }

    public String drawJoke() {
        System.out.println("Drawing a joke.");
        if (manager.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(manager.size());
            return manager.get(index);
        }

    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke : manager) {
            System.out.println(joke);
        }
    }

    public void addJoke(String joke) {
        this.manager.add(joke);
    }
}
