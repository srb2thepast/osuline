import java.util.ArrayList;

public class select {
    public static int[] selectionSort(int[] input) {
        for (int i = 0; i < input.length-1; i++) {
            int min = input[i];
            int minindex = 0;
           for (int c = i+1; c < input.length; c++) {
                System.out.println(min + " " + input[c]);
                if (input[c] < min) {min = input[c]; minindex = c;}
                
           }
           int cur = input[i];
           if (min != cur) {
                input[i] = min;
                input[minindex] = cur;
           }
        }
        return input;
    }
    
	public static void main(String[] Args)  {
        int[] in = new int[]{10,4,2,7,1,124,5,8};
        int[] end = selectionSort(in);
        ArrayList<Integer> fin = new ArrayList<Integer>();
        for (int a : end) {
            fin.add(a);
        }
        System.out.println(fin);
    }
}