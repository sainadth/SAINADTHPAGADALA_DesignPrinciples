
package calculator;

import java.util.Scanner;

public class CalculatorData {
    static char a[] = {'+', '-', '*', '/', '%'};
    static Scanner scanner = new Scanner(System.in);
    public static int inputData(){
        int n = scanner.nextInt();
        return n;
    }
    
    public static char inputOperator(int choice){
        char c = a[choice-1];
        return c;
    }
}
