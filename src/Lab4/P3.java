//package Lab4;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class P3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //Create a array List of Captains
//        ArrayList<Captain> arrayList = new ArrayList<Captain>();
//        //Read 5 captains and add each to the ArrayList
//        for (int i = 0; i < 5; i++) {
//            Captain captain = new Captain(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.nextInt());
//            arrayList.add(captain);
//        }
//        int min = arrayList.get(0).getAge();
//        int min2 = 0;
//        //Remove the two youngest captains (you CANNOT alter a list if you use a foreach loop)
//        //There are multiple ways to solve this problem
//        for (Captain captain : arrayList) {
//            if (captain.getAge()<min) {
//                min2 = min;
//                min = captain.getAge();
//            }
//        }
//
//
//
//        //Print the details of the two removed captains (passing the object to the println method)
//        System.out.println("Removed the following captains: ");
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(arrayList.get(i).getAge() == min) {
//                System.out.println(arrayList.get(i));
//                arrayList.remove(arrayList.get(i));
//                i--;
//            }
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(arrayList.get(i).getAge() == min2) {
//                System.out.println(arrayList.get(i));
//                arrayList.remove(arrayList.get(i));
//                i--;
//            }
//        }
//
//        //Print all the captains that are left in the original list.
//        //Each captain separated by a new line.
//        System.out.println("\n\nCaptains left: ");
//        for (Captain captain : arrayList) {
//            System.out.println(captain);
//        }
//    }
//}
