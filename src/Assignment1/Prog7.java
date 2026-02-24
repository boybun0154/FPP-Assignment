package Assignment1;

/**
 * Prog7
 * This program allows operators to generate bills for multiple customers.
 */
public class Prog7 {
    void main()
    {
        String reDo;
        do
        {
            String userType= IO.readln("Enter the user type(R/C/I):\n");
            int unitsConsumed = Integer.parseInt(IO.readln("Enter the units consumed:\n"));
            double bill = switch(userType.toUpperCase())
            {
              case "R" -> unitsConsumed * 0.12;
              case "C" -> unitsConsumed * 0.20;
              case "I" -> unitsConsumed * 0.35;
                default -> 0.00;
            };

            System.out.println("=== Electricity Bill ===");
            System.out.println("User Type: "+ userType.toUpperCase());
            System.out.println("Units: "+ unitsConsumed);
            System.out.printf("Bill Amount: $%.2f",bill);
            System.out.println();
            reDo= IO.readln("Do you want to calculate another bill? (y/n):");
        } while(reDo.equals("y"));

    }
}
