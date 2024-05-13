/**Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.
Example
Scores are in the same order as the games played. She tabulates her results as follows:
                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.
Returns
int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
**/

public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[2]));
        int most=0, least=0, min=scores.get(0), max=scores.get(0);
        for(int i=1; i<scores.size(); i++) {
            if(scores.get(i)>max){
                most++;
                max = scores.get(i);
            }
            if(scores.get(i)<min) {
                least++;
                min = scores.get(i);
            }
        }
        result.set(0, most);
        result.set(1, least);
        return result;  

    }
