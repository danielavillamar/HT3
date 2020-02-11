public class RadixSort {
	
	// A utility function to get maximum value in arr[]
    static int getMax(Comparable arr[], int n)
    {
        int mx = (int) arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i].compareTo(mx)>0)
                mx = (int) arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(Comparable arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ ((int)arr[i]/exp)%10 ]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ ((int)arr[i]/exp)%10 ] - 1] = (int)arr[i];
            count[ ((int)arr[i]/exp)%10 ]--;
        }
