package winzey_p1;
import java.util.Scanner;
import java.util.Arrays;
public class Application {

	public static void main(String[] args) {
		Encrypter obj= new Encrypter();
		Decrypter obj1= new Decrypter();
		System.out. println("Enter a 4-digit number to encrypt or decrypt.");
		Scanner in = new Scanner(System.in);
		String orig = in. nextLine();
		int[] input= new int[4];//converting string to int array
		input[0]=Integer.valueOf(orig.substring(0,1));
		input[1]=Integer.valueOf(orig.substring(1,2));
		input[2]=Integer.valueOf(orig.substring(2,3));
		input[3]=Integer.valueOf(orig.substring(3));
		System.out.print("Input: ");
		printArr(input);
		System.out.print("Encrypted: ");
		printArr(Encrypter.encrypt(input));
		System.out.print("Decrypted: ");
		printArr(Decrypter.decrypt(input));
	}
	public static void printArr(int[] i) {
		for (int value : i) {
		    System.out.print(value);
		}
		System.out.println();
	}

}
