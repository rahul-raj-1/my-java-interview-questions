



//count number of increasing subarrays
 static long strictIncreasingSunArrayCount(int[] arr)
	 {
		  // Initialize count of subarrays as 0
	        
	        int n=arr.length;
	        
	      
	        if(n==1) 
	        return 0;
	        
		    int i=0; 
		    int j=1;
		    int res=0;
		    while(i<n && j<n){
		        if(arr[j-1]<arr[j]){
		            res+=j-i;
		        }
		        else{
		            i=j;
		        }
		        j++;
		    }
		    return res;
	 }
