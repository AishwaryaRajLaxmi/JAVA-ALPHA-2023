// package functions;
import java.util.*;
public class demo {
    public static void print(){
        System.out.println("Hello");
        System.out.println("world");
    }

    public static int calculateSum(int a,int b)//parameter or formal parameter{
        int sum=a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a, b);//arguements or actual parameters
        System.out.println(sum);
    }

    
}
