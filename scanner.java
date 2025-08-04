import java.util.Scanner;
//public class name is same as the filename why?
public class scanner{
    public static void main(String[] args){
        //System.out.println("checking if the program compiles");
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter ur first string statement input:");

        String java=scanner.nextLine();
        System.out.print("\nThe text you entered:"+java +"-------------");
    scanner.close();
    }
}