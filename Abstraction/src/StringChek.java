import java.util.Stack;

public class StringChek {

	public static boolean isBalance(String input) {
		Stack<Character> stack = new Stack<>();
		
		for(char c : input.toCharArray()) {
			
			if(c =='(' || c== '[' || c=='{') {
				stack.push(c);
			}else if(c ==')' || c == ']' || c=='}') {
				
				if(stack.isEmpty()) {
					return false;
				}
			
			char top = stack.pop();
			if((c== ')' && top !='(') || (c ==']' && top!='[') || (c=='}' && top !='{')){
				return false;
			}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
 
		String input = "{. {. (. }. ). }. []";
		boolean isBalacnced = StringChek.isBalance(input);
		System.out.println(isBalacnced);
	}

}
