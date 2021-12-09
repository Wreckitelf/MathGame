public class Addition implements ExtraMethods
{

    private int num1;
    private int num2;

    public Addition(int num1, int num2)
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
    public void setNum1(int num1)
    {
        this.num1 = num1;
    }
    public void setNum2(int num2)
    {
        this.num2 = num2;
    }


    public static void addOperator(String answer)
    {
        if(answer.equals("addition"))
        {
            
        }
    }

    @Override
    public void addOperator() {

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
