//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> i
import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean newItem = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item [0.50-9.99]: ", 10.00, 0.50);
            totalPrice = totalPrice + itemPrice;
            newItem = SafeInput.getYNConfirm(in, "Do you have another item? [Y/N]: ");
        }while(newItem);
    }
}