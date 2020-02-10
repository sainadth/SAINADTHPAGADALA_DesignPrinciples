package calculator;

public class Calculator {
  
    public static void main(String[] args) {
        // TODO code application logic here
        double num1 = 0,num2 = 0;
        try{
            System.out.println("Enter number 1: ");
            num1 = CalculatorData.inputData();
            System.out.println("Enter number 2: ");
            num2 = CalculatorData.inputData();
        }
        catch(Exception e){
            System.out.println("Invalid Input!....");
        }
        while(true){
            System.out.println("Choose an operation among the following\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Division Modulo\n6. Exit");
            int choice = (int)CalculatorData.inputData();
            if(choice == 6){
                System.out.println("Calculator Ended ....");
                return;
            }
            else if(choice>6 || choice<1){
                System.out.println("Choice valid option[1-6]!...");
                continue;
            }
            char ch = CalculatorData.inputOperator(choice); 
            try{
                double result = CalculatorOperations.evaluateExpression(num1, num2, ch);
                System.out.println("Result of the operation is: "+result);
            }
            catch(Exception e){
                System.out.println("Arithmetic Exception occured! Enter valid operands");
            }
        }
    }
    
}
