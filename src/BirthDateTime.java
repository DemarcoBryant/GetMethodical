//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter birth year [1950-2015]: ", 2015, 1950);
        birthMonth = SafeInput.getRangedInt(in, "Enter birth month [1-12]: ", 12, 1);

        switch (birthMonth)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            birthDay = SafeInput.getRangedInt(in, "Enter birth day [1-31]: ", 31, 1);
            break;
            case 4: case 6: case 9: case 11:
            birthDay = SafeInput.getRangedInt(in, "Enter birth day [1-30]: ", 30, 1);
            break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter birth day [1-28]: ", 28, 1);
                break;
        }

        birthHour = SafeInput.getRangedInt(in, "Enter birth hour [1-24]: ", 24, 1);
        birthMinute = SafeInput.getRangedInt(in, "Enter birth minute [1-59]: ", 59, 1);

        System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}