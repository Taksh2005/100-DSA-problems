import java.math.*;
import java.util.Scanner;

class AllProblems{
    static Scanner sc = new Scanner(System.in);

    public static int p1(int arr[]){
        // WAP to find a sum of even number into 1D array. 
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum = sum+arr[i];
            }
        }
        return sum;
    }

    public static boolean p2(String str){
        // WAP to find whether string is palindrome or not.
        boolean isPalindrome = true;
        int n = str.length();
        int i = 0,j = n-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome = false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }

    public static void p3_iterative(int x){
        // WAP to find a Factor of a given number (iterative)
        for(int i = 1;i<=x/2;i++){
            if(x%i == 0){
                System.out.println(i);
            }
        }
        System.out.println(x);
    }
    public static void p3_recursive(int divider, int number){
        // WAP to find a Factor of a given number (recursive)
        if(divider<=0){
            return;
        }
        if(number % divider == 0){
            System.out.println(divider);
        }
        p3_recursive(divider-1, number);
    }
    
    public static int p4_iterative(int x){
        // WAP to find a factorial of a given integer (iterative)
        int factorial = 1;
        for(int i = 1;i<=x;i++){
            factorial *= i;
        }
        return factorial;
    }
    public static int p4_recursive(int x){
        // WAP to find a factorial of a given integer (recursive)
        if(x == 1){
            return 1;
        }
        return x*p4_recursive(x-1);
    }

    public static int p5_iterative(int x){
        // WAP to find a summation of a digit of a given number. (Iterative)
        int sum = 0;
        while (x!=0) {
            sum += x%10;
            x /= 10;
        }
        return sum;
    }
    public static int p5_recursive(int x){
        // WAP to find a summation of a digit of a given number. (recursive)
        if(x == 0){
            return 0;
        }
        return x%10+p5_recursive(x/10);
    }
    
    public static void p6(){
        // Print a following pattern
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
    public static void p7_iterative(){
        // WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative)
        int n, fibbonacci_number = 0;
        System.out.println("Enter number of terms: ");
        n = sc.nextInt();
        if(n == 0){return;}
        System.out.println(fibbonacci_number);
        for(int i = 1, fibbonacci_number2 = 1;i != n ;i++){
            System.err.println(fibbonacci_number2);
            int temp = fibbonacci_number;
            fibbonacci_number = fibbonacci_number2;
            fibbonacci_number2 = temp+fibbonacci_number2;
        }
    }
    public static void p7_recursive(){
        // WAP to find a Fibonacci series up to n terms (n is entered by user) (recursive)
        int n;
        System.out.println("Enter number of terms: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println(fibonacciNumber(i));
        }
    }
    public static int fibonacciNumber(int n){
        // funtion to find nth term of fibonacci series with recursion
        if (n==0) {
            return 0;
        }    
        if(n == 1){
            return 1+fibonacciNumber(0);
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }

    public static void p8(int x){
        // WAP to find a total odd and total even digit of a given number
        int oddDigits = 0, evenDigits = 0;
        while (x!=0) {
            int r = x%10;
            if (r%2==1) {
                oddDigits++;
            }
            else evenDigits++;
            x /= 10;
        }
        System.err.println("Odd digits: "+oddDigits+"; Even Digits: "+evenDigits);
    }

    public static void p9(int x){
        // WAP to find whether a number is Odd or Even without using a % operator.
        boolean isOdd = true;
        if((x & 1) == 0) isOdd = false;
        if(isOdd) System.out.println(x + " is odd");
        else System.out.println(x + " is even");
    }

    public static void p10(){
        // WAP to find a prime number between range (range should be entered by user). 
        System.out.println("Enter number of start and end: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start;i<=end;i++){
            if(i<=1){continue;}
            boolean isPrime = true;
            for(int j = 2;j<=i/2;j++){
                if(i%j == 0) isPrime = false;
            }
            if(isPrime) System.out.println(i);
        }
    }

    public static boolean p11(int n){
        // WAP to find weather given number is Armstrong number is not.
        boolean isArmstrong = true;
        int temp = n, digits = 0;
        while (temp!=0) {
            digits++;
            temp /= 10;
        }
        int sumDig = 0;temp = n;
        while(temp!=0){
            int r = temp%10;
            sumDig = sumDig+ (int)Math.pow(r,digits);
            temp /= 10;
        }
        if(sumDig != n) isArmstrong = false;
        System.out.println(isArmstrong);

        return isArmstrong;
    }
    public static void main(String[] args) {
    }
}
