package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {
        int[] scores = {85, 24, 88, 99, 100};
        String[] names = {"Jake", "Rose", "Wang", "Zhang", "Liu"};

        int maxScore=scores[0], minScore=scores[0];
        String maxName = "",minName = "";

        for (int i = 0; i < scores.length; i++) {
            String eachName=names[i];//gets each names from the array names
            int eachScore=scores[i];//gets each score from the array scores

            if (eachScore>maxScore){// used for compare the scores to assign the max score to maxScore
                maxScore=eachScore;
                maxName=eachName;
            }
            if (eachScore<minScore){// used for compare the scores to assign the min score to minScore
                minScore=eachScore;
                minName=eachName;
            }

        }
        System.out.println(maxName +" "+ maxScore);
        System.out.println(minName +" "+ minScore);
    }
}
/*
given a array, how to find out the maxScore's name and minScore's name
 */