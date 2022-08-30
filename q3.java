import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n1 ,n2 , n3;
        System.out.println("Enter 3 numbers :");
        n1= in.nextInt();
        n2= in.nextInt();
        n3= in.nextInt();
        System.out.println("the averg is : ");
        System.out.println((n1+n2+n3)/3);
    }
}
