import java.util.Scanner;
import java.util.Random;

class rps_1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        int win;
        String choice[]={"rock","paper","scissor"};
        String win_choice[]={"you","computer"};
        int user_choice,comp_choice;
        System.out.print("*****ROCK PAPER SCISSORS GAME *****\n0.rock\n1.paper\n2.scissor\n\t\tpick your choice:");
        user_choice=scan.nextInt();
        comp_choice=rand.nextInt(0,3);

        System.out.println("\n\nyou picked "+choice[user_choice]+"\ncomputer picked "+choice[comp_choice]);

        if(user_choice==comp_choice)
        System.out.print("\nit is a tie!");

        else if((user_choice==0||comp_choice==0)&&(user_choice==2||comp_choice==2))
        {
            if(comp_choice==0)
            win=1;
            else
            win=0;

            System.out.print("\n"+win_choice[win]+" won!");
        }

        else if((user_choice==1||comp_choice==1)&&(user_choice==2||comp_choice==2)){
            if(comp_choice==2)
            win=1;
            else
            win=0;

            System.out.print("\n"+win_choice[win]+" won!");
        }

        else if((user_choice==0)||(comp_choice==0)&&(user_choice==1)||comp_choice==1){
            if(comp_choice==1)
            win=1;
            else win=0;

            System.out.print("\n"+win_choice[win]+" won!");
        }

    }
}