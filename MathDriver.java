import java.util.Scanner;
import java.util.Random;

public class MathDriver
{
    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        Addition addition = new Addition(0, 1);
        String operation;
        System.out.println(addition);
        System.out.println("Welcome to Math Game. Enter 0 to quit, + for addition, - subtraction, * OR x for multiplication, / division");
        if (kb.nextInt() == 0)
        {
            System.out.println("Good Bye!");

        }
        else if (kb.nextLine().equals("+"))
        {
            operation = "addition";
            extraOperation(operation, kb);
        }



    }

    public static void extraOperation(String operation, Scanner kb)
    {
        System.out.println("You chose " + operation + ", would you like to add an extra operation?" +
                "\n0 for no, + for addition, - for subtraction, * OR x for multiplication, / for division");

        if (kb.nextInt() == 0)
        {
            System.out.println("Good Bye!");
        }
        else if(kb.nextLine().equals("+"))
        {
            Addition.addOperator("addition");
        }
        else if(kb.nextLine().equals("-"))
        {
            Addition.addOperator("addition");
        }
        else if(kb.nextLine().equals("*") || kb.nextLine().equals("x"))
        {
            Addition.addOperator("multiplication");
        }
        else if(kb.nextLine().equals("/"))
        {
            Addition.addOperator("division");
        }

    }

}