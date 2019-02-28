import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double output = 0.00;
        output = Math.sqrt((legA * legA) + (legB * legB));
        return output;
    }
}