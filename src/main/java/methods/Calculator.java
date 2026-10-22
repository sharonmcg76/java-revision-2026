package methods;

public class Calculator {

   public double addition (double x, double y){
       double result = x + y;
       return result;
   }

   public static double subtraction (double x, double y){
       double subResult = x - y;
       return subResult;
   }

   public double factorial (double x){
       double factResult = 1;
        for (int i = 1; i <= x; i++){
            factResult = factResult * i;
        }
        return factResult;
   }

   public static double divide (double x, double y) {
       double divideresult = x/y;
       return divideresult;
   }

   public double multiply (double x, double y) {
       double multiplyresult = x*y;
       return multiplyresult;
   }
}


//divide, multiply, more than 2 numbers?