import java.util.ArrayList; // import the ArrayList class

public class Sorting {

    //precondition: input has been declared and contains at least one element
    //poscondition: an array containing all the elements of input in ascending order is returned.
    private static int[] sort(int[] input) {
   		//your code goes here
		ArrayList<Integer> outlist = new ArrayList<Integer>();

		// go through each item
		for (int item: input) {
			// loop through each element in outlist
			Boolean inserted = false;
			for (int i = 0; i < outlist.size(); i++) {
				// check if the current element is greater or equal to the focused input number
				if (item >= outlist.get(i)) {
					inserted = true;
					outlist.add(i,item);
					break;
				}
			}
			if (!inserted) {
				outlist.add(item);
			}
			System.out.println(outlist);
		}
		
		int[] output = new int[outlist.size()];
		
		// parse to array and reverse
		for (int i = 0; i < outlist.size(); i++) {
			int item = outlist.get(i);

			output[outlist.size() - i-1] = item;
		}



		return output;
    }

    public static void main(String[] args) {
   	 System.out.println("Try to sort [8,2,9,1,0,2,-3, 233]");
   	 int[] input = {8,2,9,1,0,2,-3,233};
   	 int[] result = sort(input);
   	 for(int i=0; i<result.length; i++) {
   		 System.out.print(result[i]+ (i == result.length-1 ? "":", "));
   	 }
   	 System.out.print(" is the result and it should read [-3,0,1,2,2,8,9,233]");
    }
}
