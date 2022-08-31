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
                case "WGS84_to_SK42_convertors_test":
                    try
                    {
                        double longSK42 = WGS84_SK42_Translator.WGS84_SK42_Long(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3]));
                        double latSK42 = WGS84_SK42_Translator.WGS84_SK42_Lat(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3]));
                        double[] second_convertor_result = Second_Convertor.WGS84ToSK42Meters(Double.parseDouble(userInput[1]), Double.parseDouble(userInput[2]), Double.parseDouble(userInput[3]));
                        System.out.println("First convertor result:" + latSK42 + " " + longSK42);
                        System.out.println("Second convertor result:" + second_convertor_result[0] + " " + second_convertor_result[1]);
                    }
                    catch (Throwable e)
                    {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case "help":
                    System.out.println("Commands list:");
                    System.out.println("WGS84_to_SK42_convertors_test");
                    System.out.println("All those commands must receive 3 double values as arguments to work properly.");
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }
}