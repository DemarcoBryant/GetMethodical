//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your message (60 letter limit): ");
        String msg = in.nextLine();
        SafeInput.prettyHeader(msg);
    }
}