public static int countBits(int n)
{
	String result = Integer.toBinaryString(n);
    int count = 0;
    for (char ch : result.toCharArray())
    {
      if(ch == '1')
        count++;
    }
    return count;
}