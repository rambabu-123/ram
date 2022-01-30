package ram;
import java.util.Scanner;
	public class Card
	{
	    String cardName;
	    long cardNo;
	    char cardType;
	    double purchaseAmount;
	    double cashback;

	    public Card(String name,  long num, char type,double amt) {
	        cardName = name;
	        cardNo = num;
	        cardType = type;
	        purchaseAmount = amt;
	        cashback = 0;
	    }
	    
	    void cal() {
	        switch (cardType) {
	            case 'S':
	            case 's':
	            cashback = 2.0 * purchaseAmount / 100.0;
	            break;
	            
	            case 'G':
	            case 'g':
	            cashback = 5.0 * purchaseAmount / 100.0;
	            break;
	            
	            case 'P':
	            case 'p':
	            cashback = 8.0 * purchaseAmount / 100.0;
	            break;
	            
	            default:
	            System.out.println("INVALID CARD TYPE");
	        }
	    }
	    void display() {
	        System.out.println("Card Holder Name: " + cardName);
	        System.out.println("Card Number: " + cardNo);
	        System.out.println("Purchase Amount: " + purchaseAmount);
	        System.out.println("Cashback: " + cashback);
	    }
	    
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter Card Holder Name:");
	        String n = in.nextLine();
	        System.out.println("Enter Card Number:");
	        long no = in.nextLong();
	        System.out.println("Enter Card Type:");
	        char t = in.next().charAt(0);
	        System.out.println("Enter Purchase Amount:");
	        double a = in.nextDouble();
	        
	        Card obj = new Card(n, no, t, a);
	        obj.cal();
	        obj.display();
	    }
	}

