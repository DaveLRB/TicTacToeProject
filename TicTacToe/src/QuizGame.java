import java.util.*;

public class QuizGame {
    private List<String> questions;
    private Map<String, List<String>> choices;
    private Map<String, String> answers;

    public QuizGame() {
        questions = new ArrayList<>();
        questions.add("How many litters of blood does an adult human being have?");
        questions.add("What is the pH of water?");
        questions.add("What is the biggest organ on the human body?");
        questions.add("In what part of the body does most of the digestion happen?");
        questions.add("Who is the main producer of our ecosystem?");
        questions.add("The motion of an object under free fall is an example of which of the following?");
        questions.add("What is the 4th state of matter?");
        questions.add("Which of the following is used in pencils?");
        questions.add("What is the hardest substance known to man?");
        questions.add("What is the most common gas in Earths atmosphere?");

        choices = new HashMap<>();
        List<String> choices1 = Arrays.asList("6", "5", "4", "7");
        List<String> choices2 = Arrays.asList("6", "5", "7", "9");
        List<String> choices3 = Arrays.asList("Stomach", "Skin", "Liver", "Small Intestine");
        List<String> choices4 = Arrays.asList("Esophagus", "Stomach", "Small Intestine", "Long Intestine");
        List<String> choices5 = Arrays.asList("Humans", "Bacteria", "Fungi", "Plants");
        List<String> choices6 = Arrays.asList("Uniform acceleration", "Uniform velocity", "Arrested momentum", "Zero acceleration");
        List<String> choices7 = Arrays.asList("Liquid", "Plasma", "Solid", "Gas");
        List<String> choices8 = Arrays.asList("Charcoal", "Silicon", "Phosphorous", "Graphite");
        List<String> choices9 = Arrays.asList("Platinum", "Iron", "Diamond", "Copper");
        List<String> choices10 = Arrays.asList("Nitrogen", "Oxygen", "Helium", "Argon");
        choices.put("How many litters of blood does an adult human being have?", choices1);
        choices.put("What is the pH of water?", choices2);
        choices.put("What is the biggest organ on the human body?", choices3);
        choices.put("In what part of the body does most of the digestion happen?", choices4);
        choices.put("Who is the main producer of our ecosystem?", choices5);
        choices.put("The motion of an object under free fall is an example of which of the following?", choices6);
        choices.put("What is the 4th state of matter?", choices7);
        choices.put("Which of the following is used in pencils?", choices8);
        choices.put("What is the hardest substance known to man?", choices9);
        choices.put("What is the most common gas in Earths atmosphere?", choices10);

        answers = new HashMap<>();
        answers.put("How many litters of blood does an adult human being have?", "5");
        answers.put("What is the pH of water?", "7");
        answers.put("What is the biggest organ on the human body?", "Skin");
        answers.put("In what part of the body does most of the digestion happen?", "Small Intestine");
        answers.put("Who is the main producer of our ecosystem?", "Plants");
        answers.put("The motion of an object under free fall is an example of which of the following?", "Uniform Acceleration");
        answers.put("What is the 4th state of matter?", "Plasma");
        answers.put("Which of the following is used in pencils?", "Graphite");
        answers.put("What is the hardest substance known to man?", "Diamond");
        answers.put("What is the most common gas in Earths atmosphere?", "Nitrogen");

    }

    public String getQuestion(int i) {

        if (i >= 0 && i < questions.size()) {
            String question = questions.get(i);
            List<String> choiceList = choices.getOrDefault(question, Collections.emptyList());
            StringBuilder formattedQuestion = new StringBuilder(question + "\n");
            char option = 'A';
            for (String choice : choiceList) {
                formattedQuestion.append(option).append(". ").append(choice).append("\n");
                option++;
            }
            return formattedQuestion.toString().toUpperCase();
        }
        return "No more questions.";
    }

    public boolean checkAnswer(String question, String answer) {
        String correctAnswer = answers.getOrDefault(question, "").toUpperCase();
        return correctAnswer.equalsIgnoreCase(answer);
    }

    public void startQuizGameOnly() {
        Scanner scanner = new Scanner(System.in);
        int questionIndex = 0;
        boolean player1Turn = true;
        boolean answeredCorrectly = false;

        while (questionIndex < questions.size() && !answeredCorrectly) {
            String currentQuestion = questions.get(questionIndex);

            System.out.println((player1Turn ? "Player 1" : "Player 2") + ", it's your turn:");
            System.out.println(getQuestion(questionIndex));
            System.out.println("Enter your answer:");
            String answer = scanner.nextLine().toUpperCase();

            boolean isCorrect = checkAnswer(currentQuestion, answer);

            if (isCorrect) {
                System.out.println((player1Turn ? "Player 1" : "Player 2") + " wins the Quiz!");
                answeredCorrectly = true;
            } else {
                System.out.println("Incorrect answer. Next player's turn.");
                player1Turn = !player1Turn;
            }

            questionIndex++;
        }

        if (!answeredCorrectly) {
            System.out.println("All questions asked. Game over!");
        }

    }
}






