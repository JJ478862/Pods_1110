//package Lab4;
//
//import java.util.Scanner;
//
//public class P2 {
//    /**
//     * Now you have access to the UML diagram instead.
//     */
//
//
//    public static void main(String[] args) {
//        //Read boat's size, name (single word), and model (single word)
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        String name = scanner.next();
//        String model = scanner.next();
//
//        //Create a new boat object
//        Sailboat sailboat = new Sailboat(size,name,model);
//        //Print boat object. Pass the object variable to the println method.
//        System.out.println(sailboat);
//        //We'll discuss the details of this operation later
//
//        //Read captain info: age, name, years, registry
//        int age = scanner.nextInt();
//        String name2 = scanner.next();
//        int yearsOfExperience = scanner.nextInt();
//        int registryNumber = scanner.nextInt();
//        //Create a new captain
//        Captain captain = new Captain(age,name2,yearsOfExperience,registryNumber);
//        //Print the captain using the println method
//        System.out.println(captain);
//        //Assign the captain to the boat
//        sailboat.assignCaptain(captain);
//        //Print the boat
//        System.out.println(sailboat);
//    }
//}
//
//
