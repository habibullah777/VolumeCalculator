package Volume;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Menu();
        int input;

        System.out.println("Please enter the value to calculate the volume OR enter 0 to quit ");

        while ((input = keyboard.nextInt()) != 0)
        {
            System.out.println();
            Volume vol = new Volume(input);
            vol.PrintVolumes();

            System.out.println();
            System.out.println("Please enter the value to calculate the volume OR enter 0 to quit ");

        }
    }

    static void Menu()
    {
        System.out.println();
        System.out.println("========================================");
        System.out.println("Welcome to Volume Calculator Application");
        System.out.println("========================================\n");
        System.out.println("Using this application, user can calculate the volume of:");
        System.out.println("1) A sphere");
        System.out.println("2) A cube");
        System.out.println("3) A regular tetrahedron");
        System.out.println();
    }
}