import java.lang.Math;

class Tuple<X, Y> { 
  public final X x; 
  public final Y y; 
  public Tuple(X x, Y y) { 
    this.x = x; 
    this.y = y; 
  } 
} 

public class First{


	public static Double distance(Tuple first, Tuple second){
		Integer y_delta = (second.y + first.y);
		Integer x_delta = (second.x + first.x);
		return Math.sqrt(y_delta*y_delta + x_delta*x_delta);
	}

	public static void main(String[] args){

	}

}