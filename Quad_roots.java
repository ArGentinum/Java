
import java.util.Scanner;


public class Quad_roots{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a,b,c,x,y;
        System.out.print("enter coefficient a:");
        a=scan.nextInt();
        System.out.print("\nenter coefficient b:");
        b=scan.nextInt();
        System.out.print("\nenter coefficient c:");
        c=scan.nextInt();

        double d=(Math.pow(b,2))-(4*a*c);

        System.out.println("\ndiscriminant is :"+d);


        if(d==0){
        System.out.println("the given quadratic equation has two real and equal roots:"+(-b+Math.sqrt(d))/(2*a)+","+(-b-Math.sqrt(d))/(2*a));
        }

        else if (d>0){
            System.out.println("the given quadratic equation has two real and distinct roots:"+(-b+Math.sqrt(d))/(2*a)+","+(-b-Math.sqrt(d))/(2*a));
        }

        else if(d<0){
            System.out.println("the given quadratic equation has two imaginary roots:"+((-b/2*a)+"-"+(int)Math.sqrt(-d)+"i,"+(-b/2*a)+"+"+(int)Math.sqrt(-d)+"i"));
        }

        scan.close();
    }
}