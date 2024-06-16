/*There is a large pile of socks that must be paired by color. 
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
*/

// way 1
class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> types = new HashSet<Integer>(ar);
        int pairs = 0, count = 0;
        for(int element : types) {
            count = 0;
            for(int j = 0; j < ar.size(); j++) {
                if(element == ar.get(j))
                    count++;
            }
            pairs += count / 2;
        }
        return pairs;
    }

}


// way 2
class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> colorCount = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int color = ar.get(i);
            if(colorCount.containsKey(color)){
                colorCount.put(color, colorCount.get(color)+1);
            } else {
                colorCount.put(color, 1);
            }
        }
        int pairs = 0;
        for(int color : colorCount.values()){
            pairs += color / 2;
        }
        return pairs;
    }

}
