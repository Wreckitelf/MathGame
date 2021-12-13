import java.util.Random;


public class Division implements ExtraMethods
{

    Random random = new Random();
    private int num1;
    private int num2;
    private int num3 = 0;
    private int answer;
    private int temp;
    private int temp2;
    private String extraOperation;

    public Division(int num1, int num2, int num3, int answer)
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
    public int getTemp2() { return temp2; }

    public void startGame()
    {
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        temp = num1 * num2;
        answer = temp / num2;
        switch (extraOperation)
        {
            case "+" -> {
                temp = num1 * num2;
                this.answer = temp / num2 + num3;
            }
            case "-" -> {
                temp = num1 * num2;
                this.answer = temp / num2 - num3;
            }
            case "*" -> {
                temp = num1 * num2;
                this.answer = (temp / num2) * num3;
            }
            case "/" -> {
                temp = num1 * num2 * num3;
                temp2 = temp/num2;
                this.answer = temp2 / num3;
            }

            case "0" -> {
                temp = num1 * num2;
                this.answer = temp / num2;
            }
        }
    }
//same thing as what I explained in addition, except here, I modify the way division works so that it gives me whole numbers (Credit to Aithy for idea)
    @Override
    public void addOperator(String answer)
    {
        temp = 0;
        num3 = random.nextInt(10) + 1;

        switch (answer)
        {
            case "+" -> {
                extraOperation = "+";
                temp = num1 * num2;
                this.answer = temp / num2 + num3;
            }
            case "-" -> {
                extraOperation = "-";
                temp = num1 * num2;
                this.answer = temp / num2 - num3;
            }
            case "*" -> {
                extraOperation = "*";
                temp = num1 * num2;
                this.answer = (temp / num2) * num3;
            }
            case "/" -> {
                extraOperation = "/";
                temp = num1 * num2 * num3;
                temp2 = temp/num2;
                this.answer = temp2 / num3;
            }

            case "0" -> {
                temp = num1 * num2;
                this.answer = temp / num2;
            }
        }
    }

    public String toString()
    {
        return "Number 1: " + num1 +
                "\nNumber 2: " + num2 +
                "\nNumber 3: " + num3 +
                "\nAnswer: " + answer +
                "\nTemp: " + temp +
                "\nTemp2: " + temp2;
    }

}