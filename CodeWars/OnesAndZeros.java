public static int ConvertBinaryArrayToInt(List<Integer> binary) 
{
  int over = 0;
  int sum = 0;
  for(int b = binary.size(); b > 0; b--)
  {
    if( b == binary.size() )
    {
      sum += binary.get(b-1);
      over++;
      continue;
    }
    else
    {
      sum += binary.get(b-1) * (int) Math.pow(2, over );
      over++;
    }
  }
  return sum;
}