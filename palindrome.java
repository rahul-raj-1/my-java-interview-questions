public static void main(String args[]){

        String str = "racecar";
        int size =str.length();
        boolean check=false;
		
		for( int i=0; i< size;i++)
		{
			
			if(str.charAt(i)==str.charAt(size-1-i))
				check=true;
			else
			{
				check=false;
				break;
			}
				
			
		}
		
		System.out.println(" val of check " + check);
