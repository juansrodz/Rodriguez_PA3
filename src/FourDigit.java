import java.util.*;
import java.security.SecureRandom;
import java.lang.Math;

public class FourDigit {
    private float[] answers = new float[10];
    private float answered = 0;
    private String[] correct = {"Very good!","Excellent!","Nice work!","Keep up the good work!"};
    private int correctAnswersCrt = 0;
    private String[] wrong = {"No. Please try again.","Wrong. Try once more.","Don't give up!","No. Keep trying."};
    private int wrongAnswersCrt = 0;
    private float totalPercentage = 0;
    public int rand1;
    public int rand2;
    public int randAnswer;

    SecureRandom rand = new SecureRandom();
    Scanner in = new Scanner(System.in);

    public FourDigit(){

    }

    public void FourDigit(){
        boolean done = false;
        System.out.println("Entering double digit problems");
        int choice = 0;

        while (!done) {
            System.out.println("Choose what style of arithmetic");
            System.out.println("1)Addition 2) Multiplication 3) Subtraction 4) Division 5) Random");
            totalPercentage = 0;
            correctAnswersCrt = 0;
            wrongAnswersCrt = 0;
            choice = in.nextInt();
            switch (choice){

                case 1:
                    System.out.println("Addition problems!");
                    for (int i = 0; i < 10; i++) {
                        addition();
                    }
                    System.out.println("Total correct: " + correctAnswersCrt + " total wrong: " + wrongAnswersCrt);
                    totalPercentage = ((float) correctAnswersCrt / 10) * 100;
                    System.out.printf("%s\n", (totalPercentage >= 75.00? "Congratulations, you are ready to go to the next level!":"Please ask your teacher for extra help."));

                    break;
                case 2:
                    System.out.println("Multiplication problems!");
                    for (int i = 0; i < 10; i++) {
                        multiplication();
                    }
                    System.out.println("Total correct: " + correctAnswersCrt + " total wrong: " + wrongAnswersCrt);
                    totalPercentage = ((float) correctAnswersCrt / 10) * 100;
                    System.out.printf("%s\n", (totalPercentage >= 75.00? "Congratulations, you are ready to go to the next level!":"Please ask your teacher for extra help."));

                    break;
                case 3:
                    System.out.println("Subtraction problems!");
                    for (int i = 0; i < 10; i++) {
                        subtraction();
                    }
                    System.out.println("Total correct: " + correctAnswersCrt + " total wrong: " + wrongAnswersCrt);
                    totalPercentage = ((float) correctAnswersCrt / 10) * 100;
                    System.out.printf("%s\n", (totalPercentage >= 75.00? "Congratulations, you are ready to go to the next level!":"Please ask your teacher for extra help."));

                    break;
                case 4:
                    System.out.println("Division problems!");
                    System.out.println("Round answer to the near hundredths place.");
                    for (int i = 0; i < 10; i++) {
                        division();
                    }
                    System.out.println("Total correct: " + correctAnswersCrt + " total wrong: " + wrongAnswersCrt);
                    totalPercentage = ((float) correctAnswersCrt / 10) * 100;
                    System.out.printf("%s\n", (totalPercentage >= 75.00? "Congratulations, you are ready to go to the next level!":"Please ask your teacher for extra help."));

                    break;
                case 5:
                    System.out.println("Random arithmetic problems!");
                    System.out.println("Round answer to the near hundredths place.");
                    for (int i = 0; i < 10; i++){
                        randAnswer = rand.nextInt(4);
                        if (randAnswer == 0) addition();
                        else if (randAnswer == 1) multiplication();
                        else if (randAnswer == 2) subtraction();
                        else if (randAnswer == 3) division();
                    }
                    System.out.println("Total correct: " + correctAnswersCrt + " total wrong: " + wrongAnswersCrt);
                    totalPercentage = ((float) correctAnswersCrt / 10) * 100;
                    System.out.printf("%s\n", (totalPercentage >= 75.00? "Congratulations, you are ready to go to the next level!":"Please ask your teacher for extra help."));

                    break;
                default: done = true; break;
            }
            System.out.println("Would you like to continue the session? 1) yes or 2) no");
            choice = in.nextInt();

            if (choice == 1) continue;
            else done = true;
        }
        done = false;

    }

    public int addition(){
        rand1 = rand.nextInt(10000);
        rand2 = rand.nextInt(10000);
        System.out.println("How much is " + rand1 + " + " + rand2 + " ?");
        answered = in.nextInt();
        boolean answer = false;

        randAnswer = rand.nextInt(4);
        if ((rand1 + rand2) != answered) {
            System.out.println(wrong[randAnswer]);
            wrongAnswersCrt++;
        } else {
            System.out.println(correct[randAnswer] + "\n");
            correctAnswersCrt++;
            answer = true;
        }
        System.out.println("In function "+ correctAnswersCrt);
        return !answer? correctAnswersCrt : wrongAnswersCrt;
    }

    public int multiplication(){
        rand1 = rand.nextInt(10000);
        rand2 = rand.nextInt(10000);
        System.out.println("How much is " + rand1 + " * " + rand2 + " ?");
        answered = in.nextInt();
        boolean answer = false;

        randAnswer = rand.nextInt(4);
        if ((rand1 * rand2) != answered) {
            System.out.println(wrong[randAnswer]);
            wrongAnswersCrt++;
        } else {
            System.out.println(correct[randAnswer] + "\n");
            correctAnswersCrt++;
            answer = true;
        }
        System.out.println("In function "+ correctAnswersCrt);
        return !answer? correctAnswersCrt : wrongAnswersCrt;
    }

    public int subtraction(){
        rand1 = rand.nextInt(10000);
        rand2 = rand.nextInt(10000);
        System.out.println("How much is " + rand1 + " - " + rand2 + " ?");
        answered = in.nextInt();
        boolean answer = false;

        randAnswer = rand.nextInt(4);
        if ((rand1 - rand2) != answered) {
            System.out.println(wrong[randAnswer]);
            wrongAnswersCrt++;
        } else {
            System.out.println(correct[randAnswer] + "\n");
            correctAnswersCrt++;
            answer = true;
        }
        System.out.println("In function "+ correctAnswersCrt);
        return !answer? correctAnswersCrt : wrongAnswersCrt;
    }
    public int division(){
        rand1 = rand.nextInt(10000);
        rand2 = rand.nextInt(10000);
        if(rand2 == 0) rand2++;
        System.out.println("How much is " + rand1 + " / " + rand2 + " ?");
        double answeredDiv = in.nextDouble();
        boolean answer = false;

        randAnswer = rand.nextInt(4);
        if (Math.abs((double)(rand1 / (rand2 + 1)) - answeredDiv) < 0.000001) {
            System.out.println(wrong[randAnswer] + "\n");
            wrongAnswersCrt++;
        } else {
            System.out.println(correct[randAnswer] + "\n");
            correctAnswersCrt++;
            answer = true;
        }
        return !answer? correctAnswersCrt : wrongAnswersCrt;
    }
}
