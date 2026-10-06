import java.util.Scanner;

public class IT26102674Lab3Q4{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the five digit number: ");
        int amount = input.nextInt();

        int note10000 = amount / 10000;  
        amount %= 10000;             

        int note1000 = amount / 1000; 
        amount %= 1000; 

		int note100 = amount / 100; 
        amount %= 100; 
		
		int note10 = amount / 10; 
        amount %= 10; 
		
		int note1 = amount / 1; 
        amount %= 1; 

        System.out.print( note10000 +" ");
        System.out.print(note1000+" ");
		System.out.print(note100+" ");
		System.out.print(note10+" ");
		System.out.print(note1);
		
	

    
    }
}