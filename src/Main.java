import java.util.Scanner;
    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String userInput;
            char continueChoice;

            do {

                System.out.println("Please write your text in the following line");
                userInput = scanner.nextLine();

                String reversedString = "";
                for (int i = userInput.length() - 1; i >= 0; i--) {
                    reversedString += userInput.charAt(i);
                }

                System.out.println("Reversed string: " + reversedString);

                System.out.println("Do you want to continue Yes or No? ");
                continueChoice = scanner.next().charAt(0);
                scanner.nextLine();

            } while (continueChoice == 'Y' || continueChoice == 'y');

            System.out.println("Bye! :D");
            scanner.close();
        }
    }