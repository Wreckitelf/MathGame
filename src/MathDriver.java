import java.util.Scanner;

public class MathDriver
{
    private static String input;
    private static Addition addition;
    private static Subtraction subtraction;
    private static Multiplication times;
    private static Division division;
    private static Scanner kb;
    private static String operation;
    public static void main(String[] args)
    {

         kb = new Scanner(System.in);

         addition = new Addition(1, 1, 1, 1);
         subtraction = new Subtraction(1, 1);
         times = new Multiplication(1, 1);
         division = new Division(1, 1);
        System.out.println("Welcome to Math Game. Enter 0 to quit, + for addition, - subtraction, * OR x for multiplication, / division: ");
        input = kb.next();
        if(input.equals("+"))
        {
            operation = "addition";
            extraOperation();
        }
        else if (input.equals("-"))
        {
            operation = "subtraction";
            extraOperation();
        }
        else if (input.equals("*") || input.equals("x"))
        {
            operation = "multiplication";
            extraOperation();
        }
        else if (input.equals("/"))
        {
            operation = "division";
            extraOperation();
        }
        else if (input.equals("0"))
        {
            System.out.println("Good Bye!");
        }



    }

    public static void extraOperation()
    {
        System.out.println("You chose " + operation + ", would you like to add an extra operation?" +
                            "\n0 for no, + for addition, - for subtraction, * OR x for multiplication, / for division: ");
         input = kb.next();

        if(input.equals("+"))
        {
            aodooo( "+");
            playGame();
        }
        else if(input.equals("-"))
        {
            aodooo( "-");
            playGame();
        }
        else if(input.equals("*") || input.equals("x"))
        {
            aodooo("*");
            playGame();
        }
        else if(input.equals("/"))
        {
            aodooo("/");
            playGame();
        }
        else if (input.equals("0"))
        {
            aodooo("-");
            playGame();
        }
        else
        {

            System.out.println("Invalid answer, please restart program"); // I plan on fixing this, however, if I don't have time this will work just fine.
        }

    }

    public static void aodooo(String extraOperation)// function name: add operation depending on original operation
    {
        switch (operation) {
            case "addition" -> {
                addition.startGame();
                addition.addOperator(extraOperation);
            }
            case "subtraction" -> {
                subtraction.startGame();
                subtraction.addOperator(extraOperation);
            }
            case "multiplication" -> {
                times.startGame();
                times.addOperator(extraOperation);
            }
            case "division" -> {
                division.startGame();
                division.addOperator(extraOperation);
            }
        }
    }

    public static void playGame()
    {
       System.out.println(addition.getAnswer());//answer in addition class is correct, but doesnt transfer to math drivfer, somomehow i need to be able to get addition answer to driver answer, however I can take another approach once I find one

    }

}