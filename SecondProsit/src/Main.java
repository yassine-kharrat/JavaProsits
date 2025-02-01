public class Main {
    public static void main(String[] args) {
//        String a = "Hello";
//        String b = "World!";
//        System.out.println(a+ " " + b);

        Animal lion = new Animal("katous","mazigh",21,true);
        Zoo myZoo = new Zoo("belvedere","Tunis",25);
        myZoo.appendAnimal(lion);
        //myZoo.displayZoo();
       //System.out.println(myZoo);
       System.out.print(myZoo.toString());

    }
}