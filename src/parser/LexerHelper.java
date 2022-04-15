package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {
		try {
			text = text.substring(1, text.length() - 1);

			if (text.equals("\n"))
				return '\n';
			else if (text.equals("\t"))
				return '\t';
			return text.toCharArray()[0];
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return '.';
	}

	public static double lexemeToReal(String text) {
		try {
			return Double.parseDouble(text);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	
}
