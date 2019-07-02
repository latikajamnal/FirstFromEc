package tryPack;

public class MyTest {

	/*public static int search(int arr[],int size)
	{
		int start=0, end=size-1;
		while(start<=end)
		{
			int middle=(start+end)/2;
			if(arr[middle]!=middle+1 && arr[middle-1]==middle)
			{
				return (middle+1);
			}
			if(arr[middle]!=middle+1)
			{
				end = middle-1;
			}
			else
			{
				start = middle+1;
			}
		}
		return -1;
	}
	
	public static void main (String args[])
	{
		int array[] = {2,3,4,5,6,7,8};
		int size = array.length;
		System.out.println(MyTest.search(array, size));
	}*/
	
	/*static int findmissing(int [] ar, int N) 
	{ 
	      
	    int l = 0, r = N - 1; 
	    while (l <= r)  
	    { 
	        int mid = (l + r) / 2; 
	      
	        // If this is the first element  
	        // which is not index + 1, then  
	        // missing element is mid+1 
	        if (ar[mid] != mid + 1 &&  
	            ar[mid - 1] == mid) 
	            return (mid + 1); 
	      
	        // if this is not the first 
	        // missing element search 
	        // in left side 
	        if (ar[mid] != mid + 1) 
	            r = mid - 1; 
	      
	        // if it follows index+1 
	        // property then search 
	        // in right side 
	        else
	            l = mid + 1; 
	    } 
	  
	// if no element is missing 
	return -1; 
	} 
	  
	// Driver code 
	public static void main(String [] args) 
	{ 
	    int arr[] = {1,2,3,4,6,7,8}; 
	    int N = arr.length; 
	    System.out.println(findmissing(arr, N)); 
	} */
	
	public static void main(String args[])
	{
		String s = "Latika";
		s = s+" Jamnal";
		System.out.println(s);
	}
}
