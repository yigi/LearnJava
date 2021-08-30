public static String accum(String s) 
{
     int wordLength = s.length();
      StringBuilder str = new StringBuilder();
    for(int i = 0; i < wordLength; i++)
    {
       char c = s.charAt(i);
       String appendable = String.valueOf(c).toLowerCase();
       str.append(appendable.toUpperCase());
       str.append(appendable.repeat(i));
       if(i != wordLength - 1)
        str.append("-");
	}
      return str.toString();
}