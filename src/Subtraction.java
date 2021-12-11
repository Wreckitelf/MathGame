import java.util.Random;

public class Subtraction implements ExtraMethods
{
    Random random = new Random();
    private int num1;
    private int num2;
    private int num3;
    private int answer;

    public Subtraction(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
    public int getNum3()
    {
        return num3;
    }
    public int getAnswer()
    {
        return answer;
    }
    public void setNum1(int num1)
    {
        this.num1 = num1;
    }
    public void setNum2(int num2)
    {
        this.num2 = num2;
    }


    public void startGame()
    {
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
    }

    @Override
    public int doMath(int num1, int num2)
    {
        answer = num1 + num2;
        return answer;
    }

    @Override
    public void addOperator(String answer)
    {
        num3 = random.nextInt(10) + 1;
        switch (answer)
        {
            case "+" -> this.answer = num1 - num2 + num3;
            case "-" -> this.answer = (num1 - num2) - num3;
            case "*" -> this.answer = num1 - (num2 * num3);
            case "/" -> this.answer = num1 - (num2 / num3);
            case "0" -> this.answer = num1 - num2; // Case where no operator is picked. It will default to normal operation.
        }
    }


    public void count()
    {

    }

    public String toString()
    {
        String output = "Number 1: " + num1 +
                "\nNumber 2: " + num2;


        return output;
    }

}