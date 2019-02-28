import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Puzzle {
    public void sumAndGreaterThan10(int[] arr){
        int sum = 0;
        List<Integer> output = new ArrayList<>();
        for(int i : arr){
            sum += i;
            if(i > 10){
                output.add(i);
            }
        }
        System.out.println(sum);
        System.out.println(output);
    }
    public void shuffleAndGreaterThan5(List<String> arr){
        List<String> output = new ArrayList<>();
        Collections.shuffle(arr);
        System.out.println(arr);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() > 5){
                output.add(arr.get(i));
                System.out.println(arr.get(i));
            }
        }
        System.out.println(output);
    }
    public void isVowel(){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] a = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> alpha = new ArrayList<>();
        for(char letter : a){
            alpha.add(letter);
        }
        Collections.shuffle(alpha);
        System.out.println(alpha.get(alpha.size()-1));
        System.out.println(alpha.get(0));
        for(char i : vowels){
            if(alpha.get(0).equals(i)){
                System.out.println("First letter is a vowel");
                break;
            }
        }
    }
    public void getRandom(){
        List<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            arr.add(rand.nextInt(100) + 55);
        }
        System.out.println(arr);
    }
    public void randomSuffled(){
        List<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            arr.add(rand.nextInt(100) + 55);
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
    }
    public String randomString(){
        char[] a = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z'};
        Random rand = new Random();
        String str = "";
        for(int i = 0; i < 5; i++){
            str += a[rand.nextInt(25)+1];
        }
        return str;
    }
    public void tenRandomStrings(){
        List<String> output = new ArrayList<>();
        for(int j = 0; j < 10; j++){
            output.add(this.randomString());
        }
        System.out.println(output);
    }
}