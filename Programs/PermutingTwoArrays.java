/*There are two n-element arrays of integers, A and B. 
Permute them into some A' and B' such that the relation A'[i] + B'[i] >= k holds for all i where 0<=i<n.
There will be  queries consisting of A, B, and k. 
For each query, return YES if some permutation A', B' satisfying the relation exists. Otherwise, return NO.
*/

class Result {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        for(int i=0; i < A.size()-1; i++) {
            for(int j=i+1; j < A.size(); j++) {
                if(A.get(i) > A.get(j)) {
                    int temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }
        }
        for(int i=0; i < B.size()-1; i++) {
            for(int j=i+1; j < B.size(); j++) {
                if(B.get(i) < B.get(j)) {
                    int t = B.get(i);
                    B.set(i, B.get(j));
                    B.set(j, t);
                }
            }
        }
        for(int i=0; i < A.size(); i++) {
            if(A.get(i) + B.get(i) < k){
                return "NO";   
            }
        }
        return "YES";
        
    }

}

