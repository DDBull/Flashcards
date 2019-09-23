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

        String cardName = scanner.nextLine();
        String cardDefinition = scanner.nextLine();
        String answer = scanner.nextLine();

        flashCards card = new flashCards(cardName, cardDefinition);

        if (card.answerMatches(answer)) {
            System.out.println("Your answer is right!");
        } else {
            System.out.println("Your answer is wrong...");
        }
    }
}
