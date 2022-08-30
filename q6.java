import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n1 ,n2 ;
        int max , min;
        System.out.println("Enter 2 numbers:");
        n1= in.nextInt();
        n2= in.nextInt();
        System.out.println("the sum:"+(n1+n2));
        System.out.println("the dif:"+(n1-n2));
        System.out.println("the pro:"+(n1*n2));
        System.out.println("the dis:"+(n1%n2));
        min=n1;
        if (n1>n2) {
            max = n1; min=n2;
        }
        else max=n2;
        System.out.println("the max:"+max);
        System.out.println("the min:"+min);


    }
}
