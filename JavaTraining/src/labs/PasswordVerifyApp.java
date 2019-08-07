package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Read a file that checks the criteria for a password
 * Read a file that contains multiple sets of passwords(use http://www.theonegenerator.com/ to generate a set of test data).
 * Verify that the password contains all of the following criteria:
 *  - 1. A number
 *  - 2. A letter
 *  - 3. Special character(!@#)
 *  Create three User Defined Exceptions for the corresponding criteria:
 *  If the password does not meet the criteria, create and throw the appropriate exception
 * 
 */
public class PasswordVerifyApp {

	public static void main(String[] args) {

		String password = null;
		
		String[] passwordList = new String[19];
		String line = " ";
		
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		// 1. Define the file
		String filename = "C:\\Sheila\\JavaPractice\\passwords.txt";
		
		// 2. create a file
		File file = new File(filename);
		
		// 3. read the file
		BufferedReader br;
		try {
			 br = new BufferedReader(new FileReader(file));
			int i = 0;
			/*
			 * do { // System.out.println("test : "+br.readLine()); passwordList[i] =
			 * br.readLine(); System.out.println("Test2: "+passwordList[i]); i++; }
			 * while(br.readLine() != null);
			 */
			while((line = br.readLine()) != null) {
				passwordList[i] = line;
			//	System.out.println("Test2: "+passwordList[i]);
				i++;
			}
				
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: cannot read password");
			e.printStackTrace();
		}
		finally {
			System.out.println("Program  end");
		}
		
		//Verify that the password contains all of the following criteria:
		//	 *  - 1. A number
		//	 *  - 2. A letter
		//	 *  - 3. Special character(!@#)
		
		/*
		 * try { for(int n = 0; n < password.length(); n++) {
		 * 
		 * for(int m = 0; m < numbers.length;m++) { if(password.substring(n,
		 * n+1).equals(numbers[m])) { count++; } }
		 * 
		 * } if(count == 0) { throw new NoNumberException(); }
		 * 
		 * System.out.println(password); } catch(NoNumberException e) {
		 * System.out.println("error"); }
		 */
		
		for(String pw:passwordList) {
		try {
			 if(pw == null) {}
			 else {
				String regex = "(.)*(\\d)(.)*";
				String regex1 = "(.)*[a-zA-Z](.)*";
				String regex2 = "(.)*[!@#](.)*";
				Pattern pattern;
				Matcher matcher;
				
				
				pattern = Pattern.compile(regex);
				matcher = pattern.matcher(pw);
				boolean isMatched = matcher.matches();
				
				pattern = Pattern.compile(regex1);
				matcher = pattern.matcher(pw);
				boolean isMatchedLetter = matcher.matches();
				
				pattern = Pattern.compile(regex2);
				matcher = pattern.matcher(pw);
				boolean isMatchedSpecialChar = matcher.matches();
				
				
				if(isMatched == false) {
					throw new NoNumberException(pw);
				}
				
				if(isMatchedLetter == false) {
					throw new NoLetterException(pw);
				}
				
				if(isMatchedSpecialChar == false) {
					throw new NoSpecialCharacterException(pw);
				}
				
				System.out.println(pw);
			
			}
		}
			catch(NoNumberException e) {
				System.out.println(e.toString());
			}
			catch(NoLetterException e) {
				System.out.println(e.toString());
			}
			catch(NoSpecialCharacterException e) {
				System.out.println(e.toString());
			}
		}
			
		}
	}


class NoNumberException extends Exception{
	String password;
	NoNumberException(String password){
		this.password = password;
	}
	public String toString() {
		return password + "\n"+"No digit found";
	}
}

class NoLetterException extends Exception{
	String password;
	NoLetterException(String password){
		this.password = password;
	}
	public String toString() {
		return(password + "\n" + "No letter found");
	}
}

class NoSpecialCharacterException extends Exception{
	String password;
	NoSpecialCharacterException(String password){
		this.password = password;
	}
	public String toString() {
		return password+"\n"+"No special character found";
	}
}