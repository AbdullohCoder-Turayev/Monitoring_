import java.util.*;

public class Main {
    public static void main(String[] args) {

        //<-- First task -->

        //Announcing variables
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //Getting numbers from the user
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter the " + i + " number: ");
            int userNum = scan.nextInt();
            list.add(userNum);
        }

        //Getting sum
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        //Sending sum to the console
        System.out.println("Sum: " + sum);

        //Sending middle range num to the console
        System.out.println("Middle-Range: " + Math.round(sum / list.size()));

        //<-- End of the first task -->

        //<-- Second task -->

        //Announcing variables
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Integer> sortedIntList = new ArrayList<>();
        Random rand = new Random();
        int randInt;

        //Filling the notSorted intList
        for (int i = 0; i < 10; i++) {
            randInt = rand.nextInt(1000);
            intList.add(randInt);
        }

        //Filling the sortedIntList with the even numbers
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 == 0) {
                sortedIntList.add(intList.get(i));
            }
        }

        //Sending not sorted arrayList to the console
        System.out.println("\nNot sorted: ");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }

        //Sending sorted arrayList to the console
        System.out.println("\nSorted: ");
        for (Integer i : sortedIntList) {
            System.out.print(i + " ");
        }

        //<-- End of the second task -->

        //<-- Third task -->

        //Announcing variables
        HashMap map = new HashMap<>();
        boolean isRunning = true;
        String userName;
        int userMark;

        // Getting names and marks from the user, and putting them to the HashMap (Name = key, Mark = value)
        for (int i = 1; i < 6; i++) {
            System.out.println("\nEnter the name of the " + i + " student");
            userName = scan.next();
            System.out.println("Enter the mark of this user: ");
            userMark = scan.nextInt();
            map.put(userName, userMark);
        }

        //Cycle of the available options
        while (isRunning) {
            //Sending available options to the console
            System.out.println("1. Get student by the name: " +
                    "\n2. Exit! ");

            //Getting option from the user
            int choice = scan.nextInt();

            //Entering the case of the option
            switch (choice) {
                case 1: {
                    //Getting the name of the student from the user
                    System.out.println("Enter the name of the student: ");
                    userName = scan.next();

                    //Checking the containing of the searched user in the HashMap
                    if (map.containsKey(userName)) {
                        //if it exists this kind of name, sending the nark to the console
                        System.out.println(map.get(userName));
                    } else {
                        //if it isn't exist this kind of name, sending error to the console
                        System.err.println("Wrong name please try again! ");
                    }
                }
                break;
                case 2: {
                    //Switching off the cycle
                    isRunning = false;
                }
                break;
                default:
                    //If user has chosen the wrong option, sending error to the console
                    System.err.println("Error, please try again!");
            }

            // <-- End of the third task -->

            // <-- Last task -->

            //Announcing variables
            int randomInt;
            int[] arr = new int[20];
            HashSet<Integer> sortedNumbers = new HashSet<>();

            //Filling massive
            for (int i = 0; i < arr.length; i++) {
                randomInt = rand.nextInt(1000);
                arr[i] = randomInt;
            }

            //Sorting and adding to the HashSet
            for (int i : arr) {
                sortedNumbers.add(i);
            }

            //Sending result to the console
            System.out.println(sortedNumbers);

            //<-- End of the last task -->

            //Thanks for checking! (^~^)
            //See you tomorrow
        }
    }
}