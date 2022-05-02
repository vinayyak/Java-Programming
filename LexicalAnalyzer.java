import java.util.Scanner;
public class LexicalAnalyzer { // lexical analyzer converts source program input into a stream of tokens
                              // program will identify tokens and print them
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Scanner Class
        System.out.println("Enter number of Lines");
        String[] input = new String[scan.nextInt()];
        scan.nextLine();
        String con =" ";
        System.out.println("Please enter your program");
        for (int i=0; i<input.length; i++)
        {
            input[i]= scan.nextLine();
            con = con.concat(input[i]+" ");

        }
        System.out.println("\nInput Lines are");
        String output[] = con.split(" ");
        for(String output1:output)
        {
            System.out.println(" "+output1);

        }
        System.out.println(" ");
        int id = 0;
        int token = 0;
        for(int i = 0; i<output.length; i++)
        {
            if(null != output[i])
            {
                switch(output[i])
                {
                    case "String":
                    case "int":
                    case "float":
                    case "double":
                    case "boolean":
                        token++;
                        System.out.println("< DataType, " + output[i] +">");
                        break;
                    case "if":
                    case "ifelse":
                    case "else":
                        token++;
                        System.out.println("< ConditionalStatement, " + output[i] +">");
                        break;
                    case ";":
                        token++;
                        System.out.println("< EndofStatement, " + output[i] +">");
                        break;
                    case ",":
                        token++;
                        System.out.println("< Colon, " + output[i] +">");
                        break;
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                         token++;
                        System.out.println("< ID, " +id+" " + output[i] +">");
                        break;
                    case " ":
                        System.out.println(" ");
                        break;
                    case "1":
                    case "2":
                    case "3":
                         token++;
                        System.out.println("< number, " + output[i] +">");
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                         token++;
                        System.out.println("< Operator, " + output[i] +">");
                        break;
                    default:
                        System.out.println("Input type is not defined" +output[i]);

                }
            }
        }
    }
}