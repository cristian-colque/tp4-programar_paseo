

package ar.edu.unju.fi.lists;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Dog;


public class DogList {
    private List<Dog> dogs;

    public DogList() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}
