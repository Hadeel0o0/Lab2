import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter x:");
        num= in.nextInt();
        System.out.println(num*num);
        System.out.println(num*num*num);
        System.out.println(Math.pow(num,4));
    }
}
