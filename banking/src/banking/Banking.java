
package banking;
import java.util.Scanner;


/**
 *
 * @author sushrutnaik
 */
public class Banking {

   

    /**This Code Performs Basic Operations Such  1.Deposit 2.Withdraw 3.Enquire
     * User Enters His Choice If He Wants To Deposit He Chooses 1 If He Wants To
     * Withdraw He Chooses 2 And Balance Is Checked With 3  
     * @param args the command line arguments
     *  
     */
    public static void main(String[] args) {
         float amount;
        Scanner inp = new Scanner(System.in);
        

        do {
            System.out.println("Enter initial deposit greater than 500:");
            amount = inp.nextFloat();
        } while (amount < 500);
        
        Bank b1 = new Bank(amount);
        
        Exit:
        while (true) {
            System.out.println("1.Deposit 2: Withdraw 3:Display Balance 4. Exit");
            System.out.println("Enter your choice:");
            int ch = inp.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter amt to be deposited:");
                    amount = inp.nextFloat();
                    b1.deposit(amount);
                    break;

                case 2:
                    System.out.println("Enter amt to be withdrawn:");
                    amount = inp.nextFloat();
                    b1.withdraw(amount);
                    break;

                case 3:
                    b1.display();
                    break;

                case 4:
                        break Exit;
                default:
                    System.out.println("Invalid choice");
            }
        }
        

    }


        
    }
    

