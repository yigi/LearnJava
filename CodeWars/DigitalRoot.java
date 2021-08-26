public static int digital_root(int n) 
{
    int residual = 0;
    int sum = 0;
    
    if( n < 10 )
      return n;
    
    sum = sumOfDivident(n);
    
    while(sum >= 10)
      sum = sumOfDivident(sum);

    return sum;
}
  
public static int sumOfDivident( int n )
{
    int residual = 0;
    while ( n / 10 >= 1)
    {
      residual += n % 10;
      n /= 10;  
    }
    
    return residual + n;
}