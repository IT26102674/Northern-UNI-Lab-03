import java.util.Scanner;

public class IT26102674Lab3Q3{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in Rs: ");
        int amount = input.nextInt();

        int note5000 = amount / 5000;  
        amount %= 5000;       

        int note2000 = amount / 2000; 
        amount %= 2000; 

		int note1000 = amount / 1000; 
        amount %= 1000; 
		
		int note500 = amount / 500; 
        amount %= 500; 
		
		int note200 = amount / 200; 
        amount %= 200; 
		
		int note100 = amount / 100; 
        amount %= 100; 
		
		int note50 = amount / 50; 
        amount %= 50; 
		
		int note20 = amount / 20; 
        amount %= 20; 
		
		int note10 = amount / 10; 
        amount %= 10; 
		
		int note5 = amount / 5; 
        amount %= 5; 
		
		int note2 = amount / 2; 
        amount %= 2;
		
		int note1 = amount / 1; 
        amount %= 1;

        System.out.println("5000 Rs notes: " + note5000);
        System.out.println("2000 Rs notes: " + note2000);
		System.out.println("1000 Rs notes: " + note1000);
		System.out.println("500 Rs notes: " + note500);
		System.out.println("200 Rs notes: " + note200);
		System.out.println("100 Rs notes: " + note100);
		System.out.println("50 Rs notes: " + note50);
		System.out.println("20 Rs notes: " + note20);
		System.out.println("10 Rs coins: " + note10);
		System.out.println("5 Rs coins: " + note5);
		System.out.println("2 Rs coins: " + note2);
		System.out.println("1 Rs coins: " + note1);
	

    
    }
}