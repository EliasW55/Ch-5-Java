import java.util.Scanner;
public class Key implements Lockable
{
    private int combination=0000;
    private boolean status;
    Scanner input=new Scanner(System.in);
    public void setKey(int combo) {
        System.out.println("Enter combo");
        int num=input.nextInt();
        if(num==combination) {
            this.combination=combo;
        }
        else {
            System.out.println("That is incorrect");
            setKey(combo);
        }
    }
    
    public void lock() {
        System.out.println("Enter combo");
        int num=input.nextInt();
        if(num==combination) {
           System.out.println("What would you like to do? (1)lock (2)unlock");
           int choice=input.nextInt();
           switch(choice) {
               case 1:
               status=true;
               case 2:
               status=false;
           }
        }
    }

   
}
