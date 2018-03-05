import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        // the hypotenuse is the side across the right angle
        // calculate the value of c given legA and legB
        // calling the sqrt static method of the Math class 
        double result = Math.sqrt(legA) + Math.sqrt(legB);
    
    	return result;
    	
    }
}