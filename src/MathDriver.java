import java.util.ArrayList;
import java.util.Scanner;
//imma be real nothings hard to understand, so imma just explain the function of the method and everything I see fit.
public class MathDriver
{
    //instance variables
    private static String input;
    private static int inputInt;
    private static Addition addition;
    private static Subtraction subtraction;
    private static Multiplication times;
    private static Division division;
    private static Scanner kb;
    private static String operation;
    private static String extraOperationHolder;
    private static ArrayList<String> count;
    private static int score;
    //main method. sets all instance variables, and starts the prompts. The user picks the operation they want, and will either proceed to extraOperation() or quit
    public static void main(String[] args)
    {

         kb = new Scanner(System.in);
         addition = new Addition(1, 1, 1, 1);
         subtraction = new Subtraction(1, 1, 1, 1);
         times = new Multiplication(1, 1, 1, 1);
         division = new Division(1, 1, 1, 1);
         count = new ArrayList<String>();
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

    //This is the second prompt the user sees after inputting their original operation. The while acts as validation. Just like the last method, you choose the extra operation you want to play with, otherwise 0 for none.
    public static void extraOperation()
    {// WHILE LOOP
        System.out.println("You chose " + operation + ", would you like to add an extra operation?" +
                            "\n0 for no, + for addition, - for subtraction, * OR x for multiplication, / for division: ");


    while(!input.equals("-") || !input.equals("+") || !input.equals("*") || !input.equals("x") || !input.equals("/"))
    {
        input = kb.next();
        extraOperationHolder = input;
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
            aodooo("0");
            playGame();
        }
        else
        {
            System.out.println("Invalid answer, please try again: ");
        }

    }

    }
//one of two methods called in extraOperation. Basically depending on the original operation, this start generating the random numbers required for the game. in the addition method.
    public static void aodooo(String extraOperation)// function name: add operation depending on original operation
    {
        switch (operation)
        {
            case "addition" -> {
                addition.addOperator(extraOperation);
                addition.startGame();
            }
            case "subtraction" -> {
                subtraction.addOperator(extraOperation);
                subtraction.startGame();
            }
            case "multiplication" -> {
                times.addOperator(extraOperation);
                times.startGame();
            }
            case "division" -> {
                division.addOperator(extraOperation);
                division.startGame();
            }
        }
    }

    //This is the second method called in extraOperation. basically has a while which checks for quitting, set to value -999. while it isnt -999, switch checks for the original value of operation, and depending on that, will call the respective operation + play()
    //this then resets at the end.
    public static void playGame()
    {
        System.out.println("Ok, we are going to start. If you want to quit, type -999, if you want to see your score, type 999.");
        while(inputInt != -999)
        {
            switch (operation)
            {
                case "addition" -> {
                    additionPlay();
                }
                case "subtraction" -> {
                    subtractionPlay();
                }
                case "multiplication" -> {
                    multiplicationPlay();
                }
                case "division" -> {
                    divisionPlay();
                }

            }
            if(inputInt == -999)
            {
                System.exit(0);
            }
            System.out.print("Next question: ");
            addition.startGame();
            subtraction.startGame();
            times.startGame();
            division.startGame();



        }
    }

    //1/4 of the playing methods. This one focuses on addition. I handle division different, so there is a different test case that checks for that. Also if answer = 999, it will output your score, along with your current number of both right/wrong.
    public static void additionPlay()
    {
        if (!extraOperationHolder.equals("0"))
        {
            if(extraOperationHolder.equals("/"))
                System.out.println("What is " + addition.getNum1() + " + " +  addition.getTemp() + " " + extraOperationHolder + " " + addition.getNum3());
            else
                System.out.println("What is " + addition.getNum1() + " + " + addition.getNum2() + " " + extraOperationHolder + " " + addition.getNum3());
        }
        else
        {
            System.out.println("What is " + addition.getNum1() + " + " + addition.getNum2());
        }
        inputInt = kb.nextInt();
        if (inputInt != addition.getAnswer() && inputInt != 999)
        {
            count.add("incorrect");
            System.out.println("That is incorrect, it was: " + addition.getAnswer());

        }
        else if(inputInt == 999)
        {
            checkScore();
        }
        else
        {
            count.add("correct");
            System.out.println("That is correct");
        }
    }

    // 2/4 does the same thing except outputs subtraction
    public static void subtractionPlay()
    {
        if (!extraOperationHolder.equals("0"))
        {
            if(extraOperationHolder.equals("/"))
                System.out.println("What is " + subtraction.getNum1() + " - " +  subtraction.getTemp() + " " + extraOperationHolder + " " + subtraction.getNum3());
            else
                System.out.println("What is " + subtraction.getNum1() + " - " + subtraction.getNum2() + " " + extraOperationHolder + " " + subtraction.getNum3());
        }
        else
        {
            System.out.println("What is " + subtraction.getNum1() + " - " + subtraction.getNum2());
        }
        inputInt = kb.nextInt();
        if (inputInt != subtraction.getAnswer() && inputInt != 999)
        {
            count.add("incorrect");
            System.out.println("That is incorrect, the answer was: " + subtraction.getAnswer());

        }
        else if(inputInt == 999)
        {
            checkScore();
        }
        else
        {
            count.add("correct");
            System.out.println("That is correct");
        }
    }

    // 3/4 does the same thing except outputs subtraction
    public static void multiplicationPlay()
    {
        if (!extraOperationHolder.equals("0"))
        {
            if(extraOperationHolder.equals("/"))
                System.out.println("What is " + times.getNum1() + " * " +  times.getTemp() + " " + extraOperationHolder + " " + times.getNum3());
            else
                System.out.println("What is " + times.getNum1() + " * " + times.getNum2() + " " + extraOperationHolder + " " + times.getNum3());
        }
        else
        {
            System.out.println("What is " + times.getNum1() + " * " + times.getNum2());
        }
        inputInt = kb.nextInt();
        if (inputInt != times.getAnswer() && inputInt != 999)
        {
            count.add("incorrect");
            System.out.println("That is incorrect, the answer was: " + times.getAnswer());

        }
        else if(inputInt == 999)
        {
            checkScore();
        }
        else
        {
            count.add("correct");
            System.out.println("That is correct");
        }
    }

    // 4/4 except outputs division
    public static void divisionPlay()
    {
        if (!extraOperationHolder.equals("0"))
        {
            if(extraOperationHolder.equals("/"))
                System.out.println("What is " + division.getTemp() + " / " +  division.getNum2() + " " + extraOperationHolder + " " + division.getNum3());
            else
                System.out.println("What is " + division.getTemp() + " / " + division.getNum2() + " " + extraOperationHolder + " " + division.getNum3());
        }
        else
        {
            System.out.println("What is " + division.getTemp() + " / " + division.getNum2());
        }
        inputInt = kb.nextInt();
        if (inputInt != division.getAnswer() && inputInt != 999)
        {
            count.add("incorrect");
            System.out.println("That is incorrect, the answer was:  " + division.getAnswer());

        }
        else if(inputInt == 999)
        {
            checkScore();
        }
        else
        {
            count.add("correct");
            System.out.println("That is correct");
        }
    }

    //This is called every time user input is 999. This checks for score. This could have been as simple as adding a score++ but I needed a for each loop, so thats what I did instead.
    public static void checkScore()
    {
        score = 0;
        for (String s : count)
        {
            if (s.equals("correct"))
                score++;
        }
            System.out.println("Your Score is: " + score + " List of answers: " + count);
    }
}