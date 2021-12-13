import java.util.Random;

public class Multiplication implements ExtraMethods
{
    Random random = new Random();
    private int num1;
    private int num2;
    private int num3;
    private int answer;
    private int temp;
    private String extraOperation;

    public Multiplication(int num1, int num2, int num3, int answer)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.answer = answer;
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
    public int getTemp() { return temp; }

    public void startGame()
    {
        num1 = random.nextInt(10) - 1;
        num2 = random.nextInt(10) - 1;
        switch (extraOperation)
        {
            case "+" ->  {
                answer = num1 * num2 + num3;
            }
            case "-" -> {
                answer = (num1 * num2) - num3;
            }
            case "*" -> {
                answer = num1 * num2 * num3;
            }
            case "/" -> {
                temp = num2 * num3;
                answer = num1 * temp / num3;
            }
            case "0" -> {
                extraOperation = "0";
                answer = num1 - num2; // Case where no operator is picked. It will default to normal operation.
            }
        }
    }

    @Override
    public void addOperator(String answer)
    {

        num3 = random.nextInt(10) - 1;

        switch (answer)
        {
            case "+" ->  {
                extraOperation = "+";
                this.answer = num1 * num2 + num3;
            }
            case "-" -> {
                extraOperation = "-";
                this.answer = (num1 * num2) - num3;
            }
            case "*" -> {
                extraOperation = "*";
                this.answer = num1 * num2 * num3;
            }
            case "/" -> {
                extraOperation = "/";
                temp = num2 * num3;
                this.answer = num1 * temp / num3;
            }
            case "0" -> {
                extraOperation = "0";
                this.answer = num1 * num2; // Case where no operator is picked. It will default to normal operation.
            }
        }
    }

    public String toString()
    {
        return  "Number 1: " + num1 +
                "\nNumber 2: " + num2 +
                "\nNumber 3: " + num3 +
                "\nAnswer: " + answer +
                "\nTemp: " + temp;
    }

}