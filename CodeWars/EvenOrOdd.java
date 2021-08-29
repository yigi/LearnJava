public static String even_or_odd(int number) 
{
	if( number < 0)
		number *= -1;
      
	return number % 2 > 0 ? "Odd" : "Even";
    }