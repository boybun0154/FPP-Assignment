package Assignment1;

public class Prog5a {
    void main()
    {

        int inputNumber = Integer.parseInt(IO.readln("Enter the number of sequence: \n"));
        double sum = 0;
        double divider = 1;
        for(int i=0;i<inputNumber;i++)
        {
            double posNegFactor = 1;
            if(i%2!=0)
            {
                posNegFactor = -1;
            }
            sum += (posNegFactor * 1) /divider;
            divider += 2;

        }
        System.out.printf("The sum is %.3f",sum);
    }
}
