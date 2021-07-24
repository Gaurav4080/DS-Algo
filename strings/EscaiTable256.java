package strings;

public class AnagramOfString {

	public static void main(String[] args) {
		
		String a = "act"; 
		String b = "atc";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		
		for(int i =0; i<256;i++) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
				System.out.println("The numbers are Anagram Of Each Other");
			}else {
				System.out.println("No, Both the numbers are not Anagram of each other");
			}
		}
	
	}
	
}


