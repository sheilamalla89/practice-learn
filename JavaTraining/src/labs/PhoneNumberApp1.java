package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp1 {

	public static void main(String[] args) {
		// This will read a text file and will retrieve phone number
				// valid phone number:
					// 10 digit long
					// Area code cannot start in 0 or 9
					// There can be 911 in the phone
		String phoneNumber = null;
		// 1. Define the file
		String filename = "C:\\Sheila\\JavaPractice\\readCorrectPhoneNumber.txt";
		
		// 2. Create a file
		File file = new File(filename);
		
		// 3. Open the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNumber = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot read file");
			e.printStackTrace();
		}
		
		// valid phone number:
		// 10 digit long
		// Area code cannot start in 0 or 9
		// There can be 911 in the phone
		try {
			if(phoneNumber.length() != 10) {
				throw new InvalidPhoneDigitException(phoneNumber);
			}
			if(phoneNumber.substring(0, 1).equals("0") || phoneNumber.substring(0, 1).equals("1")) {
				throw new InvalidAreaCodeException(phoneNumber);
			}
			for(int n = 0; n < phoneNumber.length(); n++) {
				if(phoneNumber.substring(n, n+1).equals("9")) {
					if(phoneNumber.substring(n+1, n+3).equals("11")) {
						throw new EmergencyNumberSequenceException(phoneNumber);
				}
			}
			}
		System.out.println(phoneNumber);
		//br.close();
		}
		catch(InvalidPhoneDigitException e) {
			System.out.println("Phone number length is less than 10");
			System.out.println(e.toString());
		}
		catch(InvalidAreaCodeException e) {
			System.out.println("Phone contain invalid area code");
			System.out.println(e.toString());
		}
		catch(EmergencyNumberSequenceException e) {
			System.out.println("Emergency sequence found");
			System.out.println(e.toString());
		}
	}

}

class InvalidPhoneDigitException extends Exception{
	String num;
	InvalidPhoneDigitException(String num){
		this.num = num;
	}
	public String toString() {
		return "Error: not enough digit phone number: "+num;
	}
}

class InvalidAreaCodeException extends Exception{
	String num;
	InvalidAreaCodeException(String num){
		this.num = num;
	}
	public String toString() {
		return "Error: Area code 0 or 1: "+num;
	}
}

class EmergencyNumberSequenceException extends Exception{
	String num;
	EmergencyNumberSequenceException(String num){
		this.num = num;
	}
	public String toString() {
		return "Error:emergency number found "+num;
	}
}