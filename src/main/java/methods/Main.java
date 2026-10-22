package methods;

public class Main {
    static void main() {
        Calculator calculator = new Calculator();  //declared variable which has type and name
        double addResult = calculator.addition(3,5);
        System.out.println(addResult);
        System.out.println(calculator.addition(3,6));

        //call static method
        System.out.println(Calculator.subtraction(7,5)); //italic means static, Calculator w capital letter is the class.

        double factResult = calculator.factorial(10);//non-static, calculator with small letter is the object created on line 5
        System.out.println(factResult);

        double divideresult = Calculator.divide (7,5); //static
        System.out.println(divideresult);

        double multiplyresult =calculator.multiply(7,5);
        System.out.println(multiplyresult);

    }

}
