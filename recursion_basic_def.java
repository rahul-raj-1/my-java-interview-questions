//we will use recusrion when a problem depends on the problem of the same naturewith smaller inputsize.
	//eg factorial . Fact(n) =n*fact(n-1)
	private static  int fact(int n)
	{
		if( n==1 || n==0)
			return 1;
		int smallAnswer=fact(n-1);
		
		
		return n*smallAnswer;
		
	}
