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
    public static void main(String[] args) {
        // call the funtion from here to check output
    }
}
