import java.util.Scanner;

public class ShipCostCalculator
{

    public static void main(String[] args)
    {
        // Pseudocode for Task #1
        // class ShipCostCalculator
        //    main()
        //         declare variables
        //         num itemPrice = 0;
        //         num shippingCost = 0;
        //         num totalPrice = 0;

        //         output "Enter the price of the item: "
        //         input itemPrice

        //         Process
        //         if itemPrice >= 100 then
        //            shippingCost = 0
        //        else
        //            shippingCost = itemPrice * 0.02
        //        end if

        //        totalPrice = itemPrice + shippingCost

        //       OUTPUT "shippingCost: ", shippingCost
        //       OUTPUT "totalPrice: ", totalPrice

        //    return
        // endClass

        // Java Code for Task #1
        {
            Scanner in = new Scanner(System.in);
            double itemPrice = 0.0;
            double shippingCost = 0.0;
            double totalPrice = 0.0;
            String trash = "";

            System.out.print("Enter the price of the item:  $ ");
            if (in.hasNextDouble()) {
                itemPrice = in.nextDouble();
                in.nextLine(); // Clear the buffer
                System.out.println("You said your item price was: $ " + itemPrice);
            } else {
                trash = in.nextLine(); // Clear the buffer
                System.out.println("You said your item price was: $ " + trash);
                System.out.println("Invalid input. Please enter a valid number.");
                System.exit(0);
            }
            // Process
            if (itemPrice >= 100) {
                shippingCost = 0.0;
            } else {
                shippingCost = itemPrice * 0.02;
            }
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping cost is: $ " + shippingCost);
            System.out.println("Your total price is: $ " + totalPrice);
        }
    }
}


