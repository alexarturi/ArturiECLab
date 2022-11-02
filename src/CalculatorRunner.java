import java.util.Scanner;

public class CalculatorRunner {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        Calculator test = new Calculator();
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String initial = scan.nextLine();
        int ind = initial.indexOf(" ");
        double first = Double.parseDouble(initial.substring(0,ind));
        String operation = initial.substring(ind+1, ind+2);
        double second = Double.parseDouble(initial.substring(ind+3));
        System.out.println();

        if (operation.equals("+")){
            System.out.println(test.add(first, second));
        } else if (operation.equals("-")){
            System.out.println(test.subtract(first, second));
        } else if (operation.equals("*")){
            System.out.println(test.multiply(first,second));
        } else if (operation.equals("/")){
            System.out.println(test.divide(first,second));
        } else if (operation.equals("%")){
            System.out.println(test.mod(first,second));
        } else {
            System.out.println(test.exponent(first, second));
        }
    }
}
