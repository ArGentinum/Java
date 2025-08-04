import java.util.Scanner;
import java.util.Random;

class rps_2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        int win;
        String choice[]={"rock","paper","scissor"};
        String win_choice[]={"you","computer","no one"};
        int user_choice,comp_choice;
        System.out.print("*****ROCK PAPER SCISSORS GAME *****\n0.rock\n1.paper\n2.scissor\n\t\tpick your choice:");
        user_choice=scan.nextInt();
        comp_choice=rand.nextInt(0,3);

        System.out.println("\n\nyou picked "+choice[user_choice]+"\ncomputer picked "+choice[comp_choice]);
        
        //determining winner algorithm
        if(comp_choice==user_choice)
        win=2;
        else if(Math.abs(user_choice-comp_choice)==2){
            if(comp_choice==0)win=1;else win=0;
        }
        else {
            if(comp_choice-user_choice>1)win=1;else win=0;
        }


        System.out.print("\n"+win_choice[win]+" won!");

        scan.close();
    }
}