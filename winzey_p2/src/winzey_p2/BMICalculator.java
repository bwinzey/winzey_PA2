package winzey_p2;
import java.util.Scanner;
public class BMICalculator {
	double weight;
	double height;
	double bmi;
	String category;
	boolean unitType=false;//true if imperial, false if in metric

	public void calculateBmi() {
		if(readUnitType())bmi=getWeight()*703/(getHeight()*getHeight());
		else bmi=getWeight()/(getHeight()*getHeight());
		calculateBmiCategory();
	}

	public String getBmiCategory() {
		return category;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBmi() {
		return bmi;
	}

	public void displayBmi() {
		System.out.println("BMI: " + getBmi());
	}

	public void readUserData() {
		String type="";
		Scanner in = new Scanner(System.in);
		while(!type.equals("1")&&!type.equals("2")) {
		System.out.println("Enter 1 if measurements are Imperial, or 2 if they are Metric.");
		type = in. nextLine();}
		if(type.equals("1")) unitType=true;
		if(unitType) {
			System.out.println("Enter your weight in Pounds");
			setWeight(Double.parseDouble(in. nextLine()));
			System.out.println("Enter your height in inches");
			setHeight(Double.parseDouble(in. nextLine()));
		}
		else {
			System.out.println("Enter your weight in Kilograms");
			setWeight(Double.parseDouble(in. nextLine()));
			System.out.println("Enter your height in Meters");
			setHeight(Double.parseDouble(in. nextLine()));
		}
		if(weight<0||height<0)
			System.exit(1);

	}

	private boolean readUnitType() {
		return unitType;

	}

	private void calculateBmiCategory() {
		if(bmi<18.5) category="Underweight";
		else if(bmi<25) category="Normal";
		else if(bmi<30) category="Overweight";
		else category="Overweight";
	}

	private double readMeasurementData() {
		return 0;

	}

	private void setWeight(double w) {
		weight=w;

	}

	private void setHeight(double h) {
		height=h;

	}

	private double readMetricData() {
		return 0;

	}

	private double readImperialData() {
		return 0;

	}

}
