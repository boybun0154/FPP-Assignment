package Assignment1;

/**
 * Prog3
 * This program reads product records stored in a single String, where each record
 * is separated by ":" and each column within a record is separated by ",".
 * It extracts all product IDs (first column) and prints them to the console.
 */
public class Prog3 {
    void  main(String[] args)
    {

        String records = Prog2.main(args);

        //split the string into multiple records.
        String[] multipleItems = records.split(":");

        for(String item : multipleItems)
        {
            //split the row into multiple column values and take the first one.
            System.out.println(item.split(",")[0]);
        }

    }
}
