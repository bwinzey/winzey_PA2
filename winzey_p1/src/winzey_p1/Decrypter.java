package winzey_p1;
import java.util.Arrays;
public class Decrypter {

	public static int[] decrypt(int[] dec) {
		//math
		int[] decrypted= Arrays.copyOf(dec, dec.length);
		//witchcraft
		decrypted = Encrypter.encrypt(decrypted);
		for(int i=0;i<4;i++) decrypted[i]-=4;
		return decrypted;

	}

}
