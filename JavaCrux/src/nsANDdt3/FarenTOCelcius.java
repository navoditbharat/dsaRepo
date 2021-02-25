package nsANDdt3;
public class FarenTOCelcius {
	public static void main(String[] args) {
		for( int Fahrenh=0;Fahrenh<=300;Fahrenh+=20) {
		System.out.print("Fahrenheit= " + Fahrenh);
		int Cel = (Fahrenh-32)*5/9;
		System.out.println(" Cel = "+ Cel);
		}
	}

}
