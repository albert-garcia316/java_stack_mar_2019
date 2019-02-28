import java.util.ArrayList;
import java.util.List;

public class PuzzleTest {
    public static void main(String[] args) {
        Puzzle myPuzzle = new Puzzle();
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        String[] arrStr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        List<String> strList = new ArrayList<>();
        for(String s : arrStr){
            strList.add(s);
        }
        myPuzzle.sumAndGreaterThan10(arr);
        myPuzzle.shuffleAndGreaterThan5(strList);
        myPuzzle.isVowel();
        myPuzzle.getRandom();
        myPuzzle.randomSuffled();
        System.out.println(myPuzzle.randomString());
        myPuzzle.tenRandomStrings();
    }
}