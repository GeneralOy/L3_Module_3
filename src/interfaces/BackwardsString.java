package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		funkifyText(s);
		
		
		}
	// TODO Auto-generated constructor stub
	public String funkifyText(String input) {
		String output = "";
		for(int i = input.length() - 1; i > -1; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
		return output;
		
		
	}

}
