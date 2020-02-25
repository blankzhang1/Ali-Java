import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class num {
    public static List<List<Integer>> getNum(int[] a) {
        List<List<Integer>> b = new ArrayList<List<Integer>>();
        Arrays.sort(a);
        int n = a.length;
        for(int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            /* two for loops by creating a while loop
            instead of looping j & k individualy, put them together
            and check until j == k
             */
            while(j < k) {
                if(a[i] + a[j] + a[k] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(Integer.valueOf(a[i]));
                    temp.add(Integer.valueOf(a[j]));
                    temp.add(Integer.valueOf(a[k]));
                    if(!b.contains(temp))
                        b.add(temp);
                    j++;
                    k--;
                }
                else if(a[i] + a[j] + a[k] < 0)
                    j++;
                else
                    k--;
            }
        }
        return b;
    }

    public static void main(String[] args){
        int inputArr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = getNum(inputArr);
        System.out.println(result);
    }
}
