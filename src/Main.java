import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] userInput;
        while (true)
        {
            userInput = scanner.nextLine().split(" ");

            switch (userInput[0])
            {
                case "SK42_WGS84_Long":
                    try
                    {
                        System.out.println(WGS84_SK42_Translator.SK42_WGS84_Long(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3])));
                    }
                    catch (Throwable e)
                    {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case "WGS84_SK42_Long":
                    try
                    {
                        System.out.println(WGS84_SK42_Translator.WGS84_SK42_Long(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3])));
                    }
                    catch (Throwable e)
                    {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case "SK42_WGS84_Lat":
                    try
                    {
                        System.out.println(WGS84_SK42_Translator.SK42_WGS84_Lat(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3])));
                    }
                    catch (Throwable e)
                    {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case "WGS84_SK42_Lat":
                    try
                    {
                        System.out.println(WGS84_SK42_Translator.WGS84_SK42_Lat(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3])));
                    }
                    catch (Throwable e)
                    {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case "help":
                    System.out.println("Commands list:");
                    System.out.println("SK42_WGS84_Long");
                    System.out.println("WGS84_SK42_Long");
                    System.out.println("SK42_WGS84_Lat");
                    System.out.println("WGS84_SK42_Lat");
                    System.out.println("All those commands must receive 3 double values as arguments to work properly.");
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }
}