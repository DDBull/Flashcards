package flashcards;
import java.util.*;

class flashCards {
    private String cardName;
    private String cardDefinition;

    flashCards (String cardName, String cardDefinition) {
        this.cardName = cardName;
        this.cardDefinition = cardDefinition;
    }

    boolean answerMatches(String answer) {
        return cardDefinition.equals(answer);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int totalCards = Integer.valueOf(scanner.nextLine());
        String[] cards = new String[totalCards + 1];
        String[] definitions = new String[totalCards + 1];
        String userAnswer;

        for (int i = 1; i <= totalCards; i++) {
            System.out.println("The card #" + i);
            cards[i] = scanner.nextLine();

            System.out.println("The definition of the card #" + i);
            definitions[i] = scanner.nextLine();
        }

        for (int i = 1; i <= totalCards; i++) {
            System.out.println("Print the definition of \"" + cards[i] + "\"");
            userAnswer = scanner.nextLine();

            if (definitions[i].equals(userAnswer)) {
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer. (The correct one is \"" + definitions[i] + "\".)");
            }
        }
    }
}
