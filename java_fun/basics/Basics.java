import java.util.ArrayList;
import java.util.List;
public class Basics {
    public void oneTo255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }
    public void oddOneTo255(){
        for(int i = 1; i <= 255; i += 2){
            System.out.println(i);
        }
    }
    public void sum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum += i;
            System.out.println("New number: " + i + " sum: " + sum);
        }
    }
    public void arrayIterator(int[] x){
        for(int i : x){
            System.out.println(i);
        }
    }
    public void max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void average(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = sum/arr.length;
        System.out.println(average);
    }
    public void arrayOfOdds(){
        List<Integer> y = new ArrayList<>();
        for(int i = 1; i <= 255; i += 2){
            y.add(i);
        }
        System.out.println(y);
    }
    public void greaterThan(int[] arr, int y){
        int counter = 0;
        for(int i : arr){
            if(i > y){
                counter ++;
            }
        }
        System.out.println(counter);
    }
    public void square(int[] x){
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * x[i];
        }
        System.out.println(x);
    }
    public void noNeg(int[] x){
        for(int i = 0; i < x.length; i++){
            if( x[i] < 0){
                x[i] = 0;
            }
        }
        for(int i : x){
            System.out.println(i);
        }
    }
    public void maxMinAvg(int[] x){
        double[] output = {x[0], x[0], 0.0};
        int sum = 0;
        for(int i = 1; i < x.length; i++){
            sum += x[i];
            if(x[i] > output[0]){
                output[0] = x[i];
            }
            if(x[i] < output[1]){
                output[1] = x[i];
            }
        }
        output[2] = sum/x.length;
        System.out.println(output);
    }
    public void shiftingArray(int[] x){
        for(int i = 0; i < x.length - 1; i++){
            x[i] = x[i + 1];
        }
        x[x.length - 1] = 0;
        System.out.println(x);
    }
}