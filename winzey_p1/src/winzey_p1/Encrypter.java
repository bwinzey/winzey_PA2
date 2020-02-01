package winzey_p1;
import java.util.Arrays;
public class Encrypter {

	public static int[] encrypt(int[] enc) {
		//math
		int[] abc= Arrays.copyOf(enc, enc.length);
		abc[0]=(abc[0]+7)%10;
		abc[1]=(abc[1]+7)%10;
		abc[2]=(abc[2]+7)%10;
		abc[3]=(abc[3]+7)%10;
		//number swaps
		int temp=abc[0];
		abc[0]=abc[2];
		abc[2]=temp;
		temp=abc[1];
		abc[1]=abc[3];
		abc[3]=temp;
			
		return abc;

	}
	

}
