public class Algoritmz {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("Wake up");
        System.out.println("Get up");
        System.out.println("Make the bed");
        System.out.println("Get dressed");
        System.out.println("Drink a glass of water");
        System.out.println("Brush teeth");

        //Branched algorithm
        int points = 28;
        if (points < 30)
            System.out.println("Your mark is 3");
        else if (points < 50)
            System.out.println("Your mark is 4");
        else
            System.out.println("Your mark is 5");

            //Cyclic algorithm
            for (int i = 0; i < 2; i++) {
                System.out.print("Fall forward, ");
                System.out.print("Push up, ");
                System.out.println("Stand up");
            }

        }
    }

