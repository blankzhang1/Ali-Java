import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class num {
    public static List<List<Integer>> getNum(int[] a) {
        List<List<Integer>> b = new ArrayList<List<Integer>>();
        Arrays.sort(a);
        int n = a.length;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(a[i] + a[j] + a[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(Integer.valueOf(a[i]));
                        temp.add(Integer.valueOf(a[j]));
                        temp.add(Integer.valueOf(a[k]));
                        if(!b.contains(temp))
                            b.add(temp);
                    }
               }
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
