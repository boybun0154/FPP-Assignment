package Assignment1;

/**
 * This program accepts an array of Strings and creates a new array in which all
 * duplicate Strings from the original array are removed.
 */
public class Prog4 {
    void main()
    {
        int numberOfItems = Integer.parseInt(IO.readln("Enter the number of items in your array. \n"));

        String[] input = new String[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            input[i] = IO.readln("Enter string " + (i + 1) + ": ");
        }

        String[] revisedInput = new String[input.length];
        int index = 0;
        for(int i=0;i<input.length;i++)
        {
            boolean duplicate = false;
            for(int j = 0;j<index;j++)
            {
                if (input[i].equals(revisedInput[j])) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate)
            {
                revisedInput[index] = input[i];
                index++;
            }
        }

        for (String item : revisedInput) {
            if(item != null)
            {
                System.out.println(item);
            }
        }
    }
}
