package methods;

import java.util.Objects;
import java.util.Scanner;

public class MainTwo {
    static void main() {

        Calculator calculator = new Calculator();

        do {
            System.out.println("please enter a simple sum eg: 2 + 3, 5 / 4, 6 ! or Stop to end program");
            Scanner scanner = new Scanner(System.in);  //create object from class to use.  scanner variable of type Scanner.
            String line = scanner.nextLine(); //nextline method on scanner object
            if (Objects.equals(line, "Stop")) {  // null safe equals() method, to compare strings.
                System.out.println("Ending Program");
                break;
            }

            String[] array = line.split(" ");  //create array of strings, using space separator.

            double x = Double.parseDouble(array[0]); //parse string at position [0] into integer
            double y = 1;
            if (!array[1].equals("!")) {
                y = Double.parseDouble(array[2]);
            }
            switch (array[1]) {

                case "+":
                    System.out.println(calculator.addition(x, y));
                    break;
                case "-":
                    System.out.println(Calculator.subtraction(x, y));
                    break;
                case "x":
                    System.out.println(calculator.multiply(x, y));
                    break;
                case "/":
                    System.out.println(Calculator.divide(x, y)); //divide is static, so Calculator.
                    break;
                case "!":
                    System.out.println(calculator.factorial(x));
            }

        } while (true);
    }
}


