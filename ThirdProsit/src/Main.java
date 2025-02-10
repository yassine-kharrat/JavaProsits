public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("belvedere","Tunis");
        Zoo myZoo2 = new Zoo("belvedere2","Tunis");

        //LION
        Animal lion = new Animal("katous","mazigh",21,true);
        myZoo.addAnimal(lion);
        System.out.println("Recherche de Lion: " + myZoo.searchAnimal(lion));

        //LION2
        Animal lion2 = new Animal("katous","mazigh",21,true);
        myZoo.addAnimal(lion2);
        System.out.println("Recherche du Lion dupliqué: " + myZoo.searchAnimal(lion2));


        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein");
        } else {
            System.out.println("Le zoo n'est pas plein");
        }

        myZoo.comparerZoo(myZoo, myZoo2).displayZoo();

        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.print(myZoo.toString());

    }
}