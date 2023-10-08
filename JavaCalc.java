
    
import java.util.Scanner;
//hello its the edit
public class JavaCalc {
    static String xS = new String(), yS = new String(), operatorString = new String();
    static Scanner s = new Scanner(System.in);
    static int operator, xI, yI;

    public static void main(String[] args) {
        System.out
                .println("Simple Java 2 Operator Command Line Calculator!\n\tBy:Andrew Carr\n\nCTRL+C to quit");

        while (!xS.equalsIgnoreCase("quit") || !yS.equalsIgnoreCase("quit")
                || !operatorString.equalsIgnoreCase("quit")) {

            while (xS.equals("")) {
                System.out.print("Enter Var 1? ");
                xS = s.nextLine().trim();                
            }
            while (yS.equals("")) {
                System.out.print("Enter Var 2? ");
                yS = s.nextLine().trim();
            }

            while (operatorString.equalsIgnoreCase("")) {
                System.out.println("\nvar1=" + xS + " var2=" + yS + "\n"
                        + "\tSelect an operator:" + "\n\t\t1 = +\n"
                        + "\n\t\t2 = -\n" + "\n\t\t3 = /\n" + "\n\t\t4 = *\n"
                        + "\n\t\t5 = %\n" + "\n\tChoice? ");

                operatorString = s.nextLine();
            }

            if (operatorString.equalsIgnoreCase("quit"))
                continue;

            System.out.println("Parsing...");
            try {
                xI = Integer.valueOf(xS);
                yI = Integer.valueOf(yS);
                operator = Integer.valueOf(operatorString);
            } catch (Exception e) {
                System.out.println("Values entered are bad, try again..."
                        + e.getMessage());
						xS="";
						yS="";
						operatorString="";
                continue;
            }

            switch (operator) {
            case 1:
                // addition
                try {
                    System.out.println("\n\n" + xI + " + " + yI + " = "
                            + String.valueOf(xI + yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 2:
                // sub
                try {
                    System.out.println("\n\n" + xI + " - " + yI + " = "
                            + String.valueOf(xI - yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 3:
                // div
                try {
                    System.out.println("\n\n" + xI + " / " + yI + " = "
                            + String.valueOf(xI / yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 4:
                // mult
                try {
                    System.out.println("\n\n" + xI + " * " + yI + " = "
                            + String.valueOf(xI * yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 5:
                // mod
                try {
                    System.out.println("\n\n" + xI + " % " + yI + " = "
                            + String.valueOf(xI % yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            default:
				System.out.println("Invalid choice...");
            }

            operatorString = "";
			xS = "";
			yS = "";

        }

        s.close();
    }