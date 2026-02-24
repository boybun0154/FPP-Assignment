package Assignment1;

/**
 * Prog6
 * This program prints the second-largest number in an array.
 */
public class Prog6 {
    void main()
    {
        int arraySize = Integer.parseInt(IO.readln("Enter the size of the array: \n"));
        int[] input = new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            input[i]= Integer.parseInt(IO.readln());
        }
        int secondLargestNumber = 0;
        int largestNumber = 0;

        for(int i=0;i< input.length;i++)
        {
            if(input[i] > largestNumber)
            {
                largestNumber = input[i];
            }
            if(input[i] > secondLargestNumber && input[i] < largestNumber)
            {
                secondLargestNumber = input[i];
            }
        }
        System.out.println("The second largest number is "+ secondLargestNumber);
    }
}
