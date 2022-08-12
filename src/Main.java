import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myAge; // 1
        final int NUM = 5; // 2
        System.out.println(NUM);


        String word = "Hello!!!"; // 3
        System.out.println(word);


        myAge = NUM + word; // 4
        System.out.println(myAge);


        System.out.println(myAge + " " + NUM + " " + word); // 5


        if (NUM < 0) { // 6
            System.out.println("You saved a negative number");
        } else if (NUM > 0){
                System.out.println("You saved a positive number");
            } else {
                System.out.println("You saved null");
            }

        System.out.println("Введите ваше имя ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Привет, " + s);
    }
}
