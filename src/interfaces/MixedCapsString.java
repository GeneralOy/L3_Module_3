package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	public String funkifyText(String input) {
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			if(i % 2 == 1) {
				output += input.substring(i, i + 1).toUpperCase();
			}else {
				output += input.substring(i, i + 1).toLowerCase();
			}
		}
		System.out.println(output);
		return output;
		
		
	}

}
