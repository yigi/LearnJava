public static String highAndLow(String numbers) 
{
    String[] numberStrs = numbers.split(" ");
    int[] numbersArr = new int[numberStrs.length];
    for(int i = 0; i < numberStrs.length; i++)
	{
      numbersArr[i] = Integer.parseInt(numberStrs[i]);
	}
    Arrays.sort(numbersArr);
    return numbersArr[numbersArr.length - 1] + " " + numbersArr[0];
  }