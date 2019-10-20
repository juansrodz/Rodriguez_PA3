import java.util.*;

public class Math {
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        boolean done = false;

        int choice = 0;

        System.out.println("Math evaluation quiz!");
        while(!done) {

            System.out.println("Choose from the following options");
            System.out.println("Level of difficulty: 1) Single digit numbers or 2) Double digit numbers 3) Three digit numbers 4) Four digit numbers");

            difficulty();
            System.out.println("Back to the main menu.");
            System.out.println("Would you like to start the session? 1) yes or 2) no");
            choice = in.nextInt();

            if (choice == 1) continue;
            else done = true;

        }
        System.out.println("Thank you for using our Math evaluation quiz!");
    }

    public static void difficulty(){
        Scanner in = new Scanner(System.in);
        OneDigit singles = new OneDigit();
        TwoDigit doubles = new TwoDigit();
        ThreeDigit triples = new ThreeDigit();
        FourDigit quads = new FourDigit();

        int choice = 0;
        int difficultyLevel = 0;

        difficultyLevel = in.nextInt();

        if (difficultyLevel == 1) singles.OneDigit();
        else if (difficultyLevel == 2) doubles.TwoDigit();
        else if (difficultyLevel == 3) triples.ThreeDigit();
        else if (difficultyLevel == 4) quads.FourDigit();
    }
}
