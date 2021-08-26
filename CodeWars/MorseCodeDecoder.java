public class MorseCodeDecoder 
{
    public static String decode(String morseCode) 
    {
    String[] morseWords = morseCode.split("   ");
    StringBuilder humanized = new StringBuilder("");  
    for (String morseWord : morseWords) 
	{
        String[] morseChars = morseWord.split(" ");
        for (String morseChar : morseChars) {
            if (!morseChar.isEmpty()) 
			{
                humanized.append(MorseCode.get(morseChar));
            }
        }
        humanized.append(" ");
    }
    return humanized.toString().trim();
	}
}