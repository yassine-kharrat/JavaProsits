import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    String name;
    String city;
    final int nbrCages=25;
    int cpt=0;

    public Zoo(String name, String city) {
        animals = new Animal[this.nbrCages];
        this.name = name;
        this.city = city;

    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }
//    public void appendAnimal(Animal animal) {
//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i] == null) {
//                animals[i] = animal;
//                break;
//            }
//        }
//    }
public boolean addAnimal(Animal animal) {
    if (cpt < nbrCages) {
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                cpt++;
                System.out.println(animal.name + " a été ajouté au zoo.");
                return true;
            }
        }
    } else {
        System.out.println("Le zoo est déjà plein. Impossible d'ajouter plus d'animaux.");
    }
    return false;
}

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                animals[i] = null;
                cpt--;
                System.out.println(animal.name + " a été supprimé du zoo.");
                return true;
            }
        }
        System.out.println("L'animal " + animal.name + " n'a pas été trouvé dans le zoo.");
        return false;
    }

    public boolean isZooFull() {
        return cpt == nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.cpt > z2.cpt) {
            return z1;
        } else if (z1.cpt < z2.cpt) {
            return z2;
        } else {
            return null;
        }
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
