import java.util.Scanner;

public class PANCard extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the PAN number:");
		String panNumber = scanner.nextLine();

		int result = validatePAN(panNumber);

		if (result == 1)
			System.out.println("valid");
		else
			System.out.println("invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int validatePAN(String panNumber) {

		if (panNumber.length() != 8)
			return -1;

		for (int i = 0; i < panNumber.length(); i++) {

			if (!(panNumber.charAt(i) >= 'A' && panNumber.charAt(i) <= 'Z' && (i < 3 || i == 7)))
				if (!(panNumber.charAt(i) >= '0' && panNumber.charAt(i) <= '9' && i >= 3 && i <= 6))
					return -1;
		}
		return 1;
	}
}