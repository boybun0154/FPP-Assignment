package Assignment1;

public class Prog5b {
    void main()
    {
        int inputNumber = Integer.parseInt(IO.readln("Enter the number of sequence: \n"));
        double sum = 0;
        double divider = 2;
        for(int i=0;i<inputNumber;i++)
        {
            double posNegFactor = 1;
            if(i % 2 != 0)
            {
                posNegFactor = -1;
            }
            sum += (posNegFactor * (i+1)) /divider;
            divider *= 2;

        }
        System.out.printf("The sum is %.3f",sum);
    }
}
