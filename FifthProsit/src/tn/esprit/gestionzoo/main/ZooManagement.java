package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Animal;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("belvedere","Tunis");
//        Zoo myZoo2 = new Zoo("belvedere2","Tunis");

//        //LION
//        Animal lion = new Animal("katous","mazigh",21,true);
//        myZoo.addAnimal(lion);
//        System.out.println("Recherche de Lion: " + myZoo.searchAnimal(lion));
//
//        //LION2
//        Animal lion2 = new Animal("katous","mazigh",21,true);
//        myZoo.addAnimal(lion2);
//        System.out.println("Recherche du Lion dupliqué: " + myZoo.searchAnimal(lion2));
//
//
//        if (myZoo.isZooFull()) {
//            System.out.println("Le zoo est plein");
//        } else {
//            System.out.println("Le zoo n'est pas plein");
//        }
//
//        myZoo.comparerZoo(myZoo, myZoo2).displayZoo();
//
        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.print(myZoo.toString());

        //DOLPHIN
        Aquatic dolphin = new Dolphin("Aquatic", "Ahmed", 5, true, "elB7ar", 100);
        Aquatic penguin = new Penguin("Aquatic", "Mazigh", 3, false, "sel7aB7ar", 100);
        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(penguin);
        System.out.print(myZoo.toString());
        System.out.println();
        dolphin.swim();
        penguin.swim();
        Aquatic aquatic = new Aquatic("Aquatic", "yassine", 2, false, "b7ar");
        myZoo.addAnimal(aquatic);
        aquatic.swim();


    }
}

