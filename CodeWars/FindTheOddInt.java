public static int findIt(int[] intArr) 
{
  HashMap<Integer,Integer> hmap = new HashMap<>();
	 
  for(int i = 0; i < intArr.length; i++)
  {
	if(hmap.containsKey(intArr[i]))
	{
		int val = hmap.get(intArr[i]);
		hmap.put(intArr[i], val + 1);
	}
	else
		hmap.put(intArr[i], 1);
  }

  for(Integer a:hmap.keySet())
  {
	if(hmap.get(a) % 2 != 0)
	  return a;
  }
  
  return -1;
}