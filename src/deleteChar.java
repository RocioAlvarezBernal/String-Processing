public class deleteChar {

	public static void main(String[] args) {

		removeAllOccurrences("This is a test", 't');
		removeAllOccurrences("Summer is here!", 'e');
		removeAllOccurrences("---0---", '-');
	}
	
	public static void removeAllOccurrences(String str, char ch) {
		String modifiedString = " ";
		String uselessString = " ";

		for (int i = 0; i < str.length(); i++) {
			char currentCh = str.charAt(i);
			
//			if (currentCh.equals(ch) ){
			if (currentCh == ch) {
				uselessString += "list of occurences " + uselessString + currentCh;
			}
			if (currentCh != ch) {
				modifiedString = modifiedString + currentCh;
			}
		}
//		System.out.println(modifiedString + uselessString);
		System.out.println(modifiedString);
	}
}