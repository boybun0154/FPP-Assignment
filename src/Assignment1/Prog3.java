package Assignment1;

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
