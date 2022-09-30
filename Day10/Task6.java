package JavaTask.Day10;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        int n,arm=0,rem,c;
        System.out.println("enter any number");
        Scanner r=new Scanner(System.in);
        n= r.nextInt();
        c=n;
         
        while(n>0){
            rem=n%10;
           arm= (rem*rem*rem)+arm;
           n=n/10;
        }
        if(c==arm)
            System.out.println("armstrong number");
        else 
            System.out.println("not armstrong");
    }
}
