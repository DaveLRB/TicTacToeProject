import java.util.*;

public class QuizGame {
    public List<String> questions;
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
        questions.add("What is the chemical symbol for salt?");
        questions.add("What is the medical term for not being able to smell?");
        questions.add("What kind of animal is a platypus?");
        questions.add("How many smells can a human nose detect?");
        questions.add("Which parts of the body never stop growing?");
        questions.add("Which color is not considered a primary color?");
        questions.add("Louis Pasteur developed which vaccine?");
        questions.add("Which type of blood is referred to has universal donor?");
        questions.add("What is the total number of elements in the periodic table? ");
        questions.add("Which is the element Au name?");

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
        List<String> choices11 = Arrays.asList("H20", "NaCl", "O3", "HCl");
        List<String> choices12 = Arrays.asList("Hypoglycemia", "Anosmia", "Anaphia", "Contusion");
        List<String> choices13 = Arrays.asList("Mammal", "Necrophage", "Amphibian", "Insect");
        List<String> choices14 = Arrays.asList("10", "10000", "250", "1000000000");
        List<String> choices15 = Arrays.asList("Nose and Ears", "Feet and Hands", "Tongue and Hair", "Fingers and Nails");
        List<String> choices16 = Arrays.asList("Blue", "Yellow", "Green", "Red");
        List<String> choices17 = Arrays.asList("Smallpox","Polio","Rabies","Anthrax");
        List<String> choices18 = Arrays.asList("AB+", "O-", "A-", "B+");
        List<String> choices19 = Arrays.asList("160", "105", "118", "90");
        List<String> choices20 = Arrays.asList("Copper","Bronze", "Platinum", "Gold");


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
        choices.put("What is the chemical symbol for salt?", choices11);
        choices.put("What is the medical term for not being able to smell?", choices12);
        choices.put("What kind of animal is a platypus?", choices13);
        choices.put("How many smells can a human nose detect?", choices14);
        choices.put("Which parts of the body never stop growing?", choices15);
        choices.put("Which color is not considered a primary color?", choices16);
        choices.put("Louis Pasteur developed which vaccine?", choices17);
        choices.put("Which type of blood is referred to has universal donor?", choices18);
        choices.put("What is the total number of elements in the periodic table? ", choices19);
        choices.put("Which is the element Au name?", choices20);


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
        answers.put("What is the chemical symbol for salt?", "NaCl");
        answers.put("What is the medical term for not being able to smell?", "Anosmia");
        answers.put("What kind of animal is a platypus?", "Mammal");
        answers.put("How many smells can a human nose detect?", "1000000000");
        answers.put("Which parts of the body never stop growing?", "Nose and Ears");
        answers.put("Which color is not considered a primary color?", "Yellow");
        answers.put("Louis Pasteur developed which vaccine?", "Rabies");
        answers.put("Which type of blood is referred to has universal donor?", "O-");
        answers.put("What is the total number of elements in the periodic table? ", "118");
        answers.put("Which is the element Au name?", "Gold");


        Collections.shuffle(questions);


    }

    public String getQuestion(int i) {
        if (i >= 0 && i < questions.size()) {
            String question = questions.get(i);
            List<String> choiceList = choices.getOrDefault(question, Collections.emptyList());
            String formattedQuestion = Colors.WHITE_BOLD_BRIGHT + question + "\n\n" + Colors.RESET;
            StringBuilder options = new StringBuilder();
            char option = 'A';
            for (String choice : choiceList) {
                options.append(option).append(". ").append(choice).append("\n");
                option++;
            }
            formattedQuestion += Colors.BLUE_BOLD_BRIGHT + options.toString() + Colors.RESET;

            return formattedQuestion;
        }
        return Colors.CYAN + "\uD835\uDC41\uD835\uDC5C \uD835\uDC5A\uD835\uDC5C\uD835\uDC5F\uD835\uDC52 \uD835\uDC5E\uD835\uDC62\uD835\uDC52\uD835\uDC60\uD835\uDC61\uD835\uDC56\uD835\uDC5C\uD835\uDC5B\uD835\uDC60." + Colors.RESET;
    }

    public boolean checkAnswer(String question, String answer) {
        String correctAnswer = answers.get(question);
        Scanner input = new Scanner(System.in);
        if (correctAnswer != null) {
            int selectedIndex;
            try {
                selectedIndex = answer.charAt(0) - 'A';
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(Colors.RED_BOLD_BRIGHT + "Invalid answer. Please select a single character: A, B, C, or D." + Colors.RESET);
                answer = input.nextLine().toUpperCase();
                selectedIndex = answer.charAt(0) - 'A';
            }

            List<String> choiceList = choices.getOrDefault(question, Collections.emptyList());

            while (!(selectedIndex >= 0 && selectedIndex < choiceList.size())) {
                System.out.println(Colors.RED_BOLD_BRIGHT + "Invalid answer. Please select A, B, C, or D." + Colors.RESET);
                answer = input.nextLine().toUpperCase();
                try {
                    selectedIndex = answer.charAt(0) - 'A';
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println(Colors.RED_BOLD_BRIGHT + "Invalid answer. Please select a single character: A, B, C, or D." + Colors.RESET);
                    answer = input.nextLine().toUpperCase();
                    selectedIndex = answer.charAt(0) - 'A';
                }
            }

            String selectedAnswer = choiceList.get(selectedIndex);
            return selectedAnswer.equalsIgnoreCase(correctAnswer);
        }
        return false;
    }

    public void startQuizGame() {
        System.out.println(Colors.CYAN_BOLD_BRIGHT + "\n" +
                "█▀█ █░█ █ ▀█\n" + Colors.BLUE_BOLD +
                "▀▀█ █▄█ █ █▄\n" + Colors.RESET);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int questionIndex = 0;
        int player1Score = 0;
        int player2Score = 0;

        while (questionIndex < questions.size()) {
            String currentQuestion = questions.get(questionIndex);

            System.out.println((questionIndex % 2 == 0 ? Colors.BLUE_BOLD + "Pʟᴀʏᴇʀ 1" : Colors.CYAN_BOLD + "Pʟᴀʏᴇʀ 2") + " ᴛᴜʀɴ:\n" + Colors.RESET);
            System.out.println(getQuestion(questionIndex));
            System.out.println(Colors.WHITE_BRIGHT + "\uD835\uDC38\uD835\uDC5B\uD835\uDC61\uD835\uDC52\uD835\uDC5F \uD835\uDC66\uD835\uDC5C\uD835\uDC62\uD835\uDC5F \uD835\uDC4E\uD835\uDC5B\uD835\uDC60\uD835\uDC64\uD835\uDC52\uD835\uDC5F:" + Colors.RESET);
            String answer = scanner.nextLine().toUpperCase();

            boolean isCorrect = checkAnswer(currentQuestion, answer);

            if (isCorrect) {
                if (questionIndex % 2 == 0) {
                    player1Score++;
                } else {
                    player2Score++;
                }
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "ℂ\uD835\uDD60\uD835\uDD63\uD835\uDD63\uD835\uDD56\uD835\uDD54\uD835\uDD65 \uD835\uDD52\uD835\uDD5F\uD835\uDD64\uD835\uDD68\uD835\uDD56\uD835\uDD63❕\n" + Colors.RESET);
            } else {
                System.out.println(Colors.RED_BOLD_BRIGHT + "\uD835\uDD40\uD835\uDD5F\uD835\uDD54\uD835\uDD60\uD835\uDD63\uD835\uDD63\uD835\uDD56\uD835\uDD54\uD835\uDD65 \uD835\uDD52\uD835\uDD5F\uD835\uDD64\uD835\uDD68\uD835\uDD56\uD835\uDD63❕\n" + Colors.RESET);
            }

            questionIndex++;
        }

        if (player1Score > player2Score) {
            System.out.println(Colors.GREEN_BOLD_BRIGHT + "\uD835\uDE7F\uD835\uDE95\uD835\uDE8A\uD835\uDEA2\uD835\uDE8E\uD835\uDE9B \uD835\uDFF7 \uD835\uDEA0\uD835\uDE92\uD835\uDE97\uD835\uDE9C \uD835\uDE9D\uD835\uDE91\uD835\uDE8E \uD835\uDE80\uD835\uDE9E\uD835\uDE92\uD835\uDEA3 \uD835\uDEA0\uD835\uDE92\uD835\uDE9D\uD835\uDE91 " + player1Score + Colors.RESET + Colors.GREEN_BOLD_BRIGHT + " \uD835\uDC1C\uD835\uDC28\uD835\uDC2B\uD835\uDC2B\uD835\uDC1E\uD835\uDC1C\uD835\uDC2D \uD835\uDC1A\uD835\uDC27\uD835\uDC2C\uD835\uDC30\uD835\uDC1E\uD835\uDC2B\uD835\uDC2C❗\n\n" + Colors.RESET);
        } else if (player2Score > player1Score) {
            System.out.println(Colors.GREEN_BOLD_BRIGHT + "\uD835\uDC0F\uD835\uDC25\uD835\uDC1A\uD835\uDC32\uD835\uDC1E\uD835\uDC2B \uD835\uDFD0 \uD835\uDC30\uD835\uDC22\uD835\uDC27\uD835\uDC2C \uD835\uDC2D\uD835\uDC21\uD835\uDC1E \uD835\uDC10\uD835\uDC2E\uD835\uDC22\uD835\uDC33 \uD835\uDC30\uD835\uDC22\uD835\uDC2D\uD835\uDC21 " + player2Score + Colors.RESET + Colors.GREEN_BOLD_BRIGHT + " \uD835\uDC1C\uD835\uDC28\uD835\uDC2B\uD835\uDC2B\uD835\uDC1E\uD835\uDC1C\uD835\uDC2D \uD835\uDC1A\uD835\uDC27\uD835\uDC2C\uD835\uDC30\uD835\uDC1E\uD835\uDC2B\uD835\uDC2C❗\n\n" + Colors.RESET);
        } else {
            System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\uD835\uDC08\uD835\uDC2D❜\uD835\uDC2C \uD835\uDC1A \uD835\uDC2D\uD835\uDC22\uD835\uDC1E❗ \uD835\uDC01\uD835\uDC28\uD835\uDC2D\uD835\uDC21 \uD835\uDC29\uD835\uDC25\uD835\uDC1A\uD835\uDC32\uD835\uDC1E\uD835\uDC2B\uD835\uDC2C \uD835\uDC2C\uD835\uDC1C\uD835\uDC28\uD835\uDC2B\uD835\uDC1E\uD835\uDC1D " + player1Score + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + " \uD835\uDC1C\uD835\uDC28\uD835\uDC2B\uD835\uDC2B\uD835\uDC1E\uD835\uDC1C\uD835\uDC2D \uD835\uDC1A\uD835\uDC27\uD835\uDC2C\uD835\uDC30\uD835\uDC1E\uD835\uDC2B\uD835\uDC2C❗\n\n" + Colors.RESET);
        }
    }
}






