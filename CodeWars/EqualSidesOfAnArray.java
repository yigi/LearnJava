public static int findEvenIndex(int[] arr) 
{
	int left, right = 0;
  
	for(int i = 0; i < arr.length; i++)
	{
	left = sumLeft(i,arr);
	right = sumRight(i,arr);
  
	if( left == right )
		return i;
	}
	return -1;     
}
 
public static int sumLeft(int pivot, int[] arr)
{
  int leftSum = 0;
  for(int i = pivot; i >= 0; i--)
  {
    leftSum += arr[i];       
  }
  return leftSum;
}

public static int sumRight(int pivot, int[] arr)
{
  int rightSum = 0;
  for(int i = pivot; i < arr.length ; i++)
  {
    rightSum += arr[i];       
  }
 return rightSum;
}