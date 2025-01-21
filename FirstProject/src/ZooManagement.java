import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
//        Instruction 1
//        int nbrCages = 20;
//        String zooNames = "My zoo";
//        System.out.print(zooNames + " Comporte " + nbrCages);

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the name of the zoo: ");
        String zooNames = myScanner.nextLine();

        System.out.print("Enter number of cages in the zoo: ");
        int nbrCages = myScanner.nextInt();


        System.out.print(zooNames + " Comporte " + nbrCages);

        myScanner.close();
    }
}
