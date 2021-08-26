public static String getMiddle(String word) 
{
    int middle = 0;
    if(word.length() % 2 > 0)
    {
      String oddMiddle = "";
      middle = (word.length() / 2) + 1;
      oddMiddle += word.substring(middle - 1, middle);
      return oddMiddle;
    }
    else
    {
      String evenMiddle = "";
      middle = (word.length() / 2) - 1;
      evenMiddle += word.substring(middle,middle + 2);
      return evenMiddle;
    }
}