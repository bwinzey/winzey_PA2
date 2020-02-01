package winzey_p2;

public class Main {
		public static void main(String[] args) {
		    BMICalculator app = new BMICalculator();
		    app.readUserData();
		    app.calculateBmi();
		    app.displayBmi();
		    System.out.println(app.getBmiCategory());
		}

	}

