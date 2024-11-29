class Solution {
    void pushZerosToEnd(int[] arr) {
        int zeroIndex = -1, index = -1;
        int[] b = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == 0)
            {
                int j = index == -1? i : index;
                for(; j < arr.length; j++) {
                    if(arr[j] != 0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        index = j;
                        break;
                    }
                }
            }
    }
}
