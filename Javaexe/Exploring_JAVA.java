class Exploring_JAVA{
public static void main(String[] args) {
	toidentify toidentify = new toidentify();
	toidentify.CharacterIdentifying();
		
	}	
}
class toidentify {
	public void CharacterIdentifying(){
	char a[]={'a','9','B','?',' '};
	for (int i=0;i<a.length ;i++ ) {
		if(Character.isDigit(a[i]))
			System.out.println(a[i] + " is a DIGIT");
		if(Character.isLetter(a[i]))
			System.out.println(a[i] + " is a LETTER");
		if(Character.isWhitespace(a[i]))
			System.out.println(a[i] + " is a Whitespace");
		if (Character.isUpperCase(a[i])) {
			System.out.println(a[i] + " is an UPPERCASE");
}		if (Character.isLowerCase(a[i])) {
	System.out.println(a[i] + " is LOWERCASE");
}

	}

	}
}