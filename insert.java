import java.util.ArrayList;

public class insert {
    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int main = arr[i];
            int j = i;
            for (j = i; j > 0; j--) {
                int sub = arr[j];
                arr[j] = arr[j-1];
                if (main < sub) 
                    break;
            }
            arr[j]=main;
        }
        return arr;
    }

	public static void main(String[] Args)  {
        int[] in = new int[]{10,4,2,7,1,124,5,8,-1,2};
        int[] end = insertionSort(in);
        ArrayList<Integer> fin = new ArrayList<Integer>();
        for (int a : end) {
            fin.add(a);
        }
        System.out.println(fin);
    }
}
