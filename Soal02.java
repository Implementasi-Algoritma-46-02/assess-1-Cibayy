import java.util.Scanner;

public class Soal02 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	double masaStudi = input.nextDouble();
	double ipk = input.nextDouble();
	input.nextLine();
	int eprt = input.nextInt();
	String hki = input.nextLine();
	String lomba = input.nextLine();

	if (masaStudi == 3.0 && ipk >= 3.5 && eprt >= 450) {
		if (hki.equals("ada")|| lomba.equals("ada"))  {
			System.out.println("Cumlaude");
			
		}
	
	} else{
		System.out.println("Tidak Cumlaude");
	}
}
}
