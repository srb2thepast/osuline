import java.util.ArrayList;
public class BINS {
    static int binarySearch(ArrayList<Integer> arr, int toFind)
    {
        int left = 0, right = arr.size() - 1;
        while (1<=right) {
            int m = left + (right - left) / 2;
  
            // Check if x is present at mid
            if (arr.get(m) == toFind)
                return m;
  
            // If x greater, ignore left half
            if (arr.get(m) < toFind)
               left=m+1;
  
            // If x is smaller, ignore right half
            else
                right = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;
    } 

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<10; i++) {
			int start = i*2;
			list.add(start);
		}
		System.out.println(list);
		System.out.println(binarySearch(list,3));
		//please include additional testing here!
	}
}
