package programmers.level1;

public class HidePhoneNum {
	
	public static void main(String[] args) {
		String phnum= "01094375946";
		int x = phnum.length()-4;
		String star = "";
		for(int i=0; i < x ; i++) {
			star += "*";
		}
		System.out.println(star+phnum.substring(phnum.length()-4 , phnum.length()));
	}
}
