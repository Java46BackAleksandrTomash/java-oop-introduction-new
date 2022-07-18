package telran.brackets;

public class Brackets {

	
//	private final static String brOpen = "([{";
//	private final static String brClose = ")]}";
//	
//	public static boolean hasValidBrackets(String text) {
//		StringBuilder bracketsStack = new StringBuilder();
//	
//		for(int i = 0; i < text.length(); i++) {
//			if(brOpen.indexOf(text.charAt(i)) >= 0) {
//				bracketsStack.append(text.charAt(i));
//			}else if(brClose.indexOf(text.charAt(i)) >= 0) {
//				if(bracketsStack.isEmpty() || ! remooveIfCouple(bracketsStack, text.charAt(i))) {
//					return false;
//				}
//			}
//		}
//		return bracketsStack.isEmpty();
//		}
//
//	private static boolean remooveIfCouple(StringBuilder bracketsStack, char closingBracket) {
//		char coupleOpeningBracket = brOpen.charAt(brClose.indexOf(closingBracket));
//		char lastStackBracket = bracketsStack.charAt(bracketsStack.length() - 1);
//		if(lastStackBracket == coupleOpeningBracket) {
//			bracketsStack.deleteCharAt(bracketsStack.length() - 1);
//			return true;
//		}
//		return false;
//	}
	public static boolean hasValidBrackets(String text) {
		text = text.replaceAll("[^(){}\\[\\]", "");
		
		int length = text.length();
		
		do {
			text = text.replaceAll("\\(\\)|\\{\\}|\\[\\]", "");
			if(text.length() == length) {
				break;
			}
			length = text.length();
		}
		while(!text.isEmpty());
		return text.isEmpty();
	}
}
	
