import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleas enter your name: ");
        String name = sc.next();
        System.out.println("pleas enter number: ");
        int number = sc.nextInt();
        //  quiz questions


        String[] questions = {
                "Question 1: What is the 5+2?\n(a) 8\n(b) 7\n(c) 6\n",
                "Question 2: What is the 100*3?\n(a)  300\n(b)  600\n(c) 900 \n",
                "Question 3: What is the correct answers of  6/2(2+1)?\n(a) 1\n(b) 6\n(c) 3\n",
                "Question 4: What is the capital city of Oman ?\n(a) Amman\n(b) Muscat\n(c) Kuwait\n",
                "Question 5: What is 5*5+2?\n(a)12\n(b) 35\n(c)  13\n"

        };

        // answers
        int score = 0;
        String[] answers = {"b", "a", "a", "b", "a"};

        // Start quiz

        System.out.println("Welcome to the Quiz \n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer (a, b, or c): ");
            String userAnswer = sc.next();

            // Check if the user's answer is correct
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!\n");
                score++;

            } else {
                System.out.println("Incorrect! The correct answer is " + answers[i] + ".\n");
            }
            System.out.println("your score is " + score + "of ");
        }
    }
}