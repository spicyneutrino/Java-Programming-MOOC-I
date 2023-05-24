/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> list = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }

        Person shortest = this.list.get(0);
        for (Person item : this.list) {
            if (shortest.getHeight() > item.getHeight()) {
                shortest = item;
            }
        }
        return shortest;
    }

    public Person take() {
        Person shortest = this.shortest();
        this.list.remove(shortest);
        return shortest;
    }
}

