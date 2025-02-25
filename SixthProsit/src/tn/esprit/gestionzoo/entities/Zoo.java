package tn.esprit.gestionzoo.entities;

import java.util.Arrays;
public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    final int nbrCages = 25;
    private int cpt = 0;

    public Zoo(String name, String city) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + this.name);
        System.out.println("Ville: " + this.city);
        System.out.println("Nombre de cages: 25");
    }

    public boolean addAnimal(Animal animal) {
        if (this.cpt < 25) {
            if (this.searchAnimal(animal) != -1) {
                System.out.println("Cet animal existe déjà dans le zoo.");
                return false;
            }

            for (int i = 0; i < this.animals.length; ++i) {
                if (this.animals[i] == null) {
                    this.animals[i] = animal;
                    ++this.cpt;
                    System.out.println(animal.getName() + " a été ajouté au zoo.");
                    return true;
                }
            }
        } else {
            System.out.println("Le zoo est déjà plein. Impossible d'ajouter plus d'animaux.");
        }

        return false;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println(aquatic.getName() + " has been added to the aquatic animals.");
                return;
            }
        }
        System.out.println("The aquatic animals array is full.");
    }
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                maxDepth = Math.max(maxDepth, penguin.getSwimmingDepth());
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; ++i) {
            if (this.animals[i] != null && this.animals[i].getName() == animal.getName()) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; ++i) {
            if (this.animals[i] != null && this.animals[i].getName() == animal.getName())  {
                this.animals[i] = null;
                --this.cpt;
                System.out.println(animal.getName() + " a été supprimé du zoo.");
                return true;
            }
        }

        System.out.println("L'animal " + animal.getName() + " n'a pas été trouvé dans le zoo.");
        return false;
    }

    public boolean isZooFull() {
        return this.cpt == 25;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.cpt > z2.cpt) {
            return z1;
        } else {
            return z1.cpt < z2.cpt ? z2 : null;
        }
    }

    @Override
    public String toString() {
        String var10000 = Arrays.toString(this.animals);
        return "tn.esprit.gestionzoo.entities.Zoo{animals=" + var10000 + ", name='" + this.name + "', city='" + this.city + "', nbrCages=25}";
    }
}
