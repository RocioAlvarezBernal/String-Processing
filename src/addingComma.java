import java.util.Scanner;

public class addingComma {

	public static void main(String[] args) {
//		String finalString = " ";
//		int counter = 0;
		while (true) {
//		String digits = readLine("Enter a numeric string: ");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a numeric string: ");
			String digits = scanner.nextLine();
			if (digits.length() == 0) {
				break;
			}
			System.out.println( "numbers with commas: " + addCommasToNumericString(digits) );
		}
	}
	
//for (int i=0; i=digits.length; i++)
//012   345   6
//100[,]000[,]0
//
//for (int i=digits.length; i==0; i-=3)
//0   123   456	  789
//1[,]000[,]000[,]000
//
//012   345   678
//100[,]000[,]000
//
		private static String addCommasToNumericString(String digits){
			
////Array attempt 
//		String[] numb = new String[digits.length()];
//			/*
//			 * for (int i=numb.length(); i == 0; i-=3) { if (i % 3 == 0){ 
			//numb[i-2] = "," +
//			 * numb[i-2].toString(); } 
// 			else {
// 			TBD 
// 			} 
// 			String finalString = new String "";
//			 * String(numb);
//			 * 
//			 * return finalStringstring;
//			 * 
//			 */
	//

//			}
//			return finalString;
//		}
	//}
			
////char attempt 
//			String finalString = " ";
//			int counter = 0;
//			for (int i = (digits.length() - 1); i > 0; i -= 2) {
//				counter++;
//				StringBuilder newdigits = new StringBuilder(digits);
//				String finalString=" ";
//				int counter=0;

//				counter++;
//				if (counter % 3 == 0) {
//					finalString = finalString + ",";
//				}
//			
//012   345   6
//100[,]000[,]0
//
//0   123   456	  789
//1[,]000[,]000[,]000
//
//012   345   678
//100[,]000[,]000
//
//			StringBuilder finalString = new StringBuilder(digits);
			String passedNum = " ";
			int counter = 0;
//			for (int i = (digits.length; i == 0; i-=3;) {
//			for (int i = (digits.length() - 1); i == 0; i-=1) {
			for (int i = (digits.length() - 1); i >= 0; i-=1) {
//				counter++;
//				ch[i] = charAt[i] + ",";
//				numAtIndex = digits.charAt[i];
//char ch1 = str.charAt(1)
				char numAtIndex = digits.charAt(i);
//comma = at index plus a comma 
//				ch[i] = comma;
//				char comma = ch[i -];
				passedNum = numAtIndex + passedNum;
//finalString = new string 
//				numAtIndex + finalString;
//				String commaCh = ","; 
//				newdigits.setCharAt(i , ',' );
//				newdigits.setCharAt(i , commaCh );
//				counter++;
				if (counter % 3 != 0) {
					numAtIndex = numAtIndex;
				}
				counter++;
//				if (counter % 3 == 0 
//				if (counter % 3 == 0 && i == 0) 
//				if (counter % 3 == 0 && i >= 0) 
				if (counter % 3 == 0 && i > 0) {
					String commaCh = ","; 
					passedNum = commaCh + passedNum;
				}

//			return ;
//			return finalString;
			}
			return passedNum;
		}
		
	}
