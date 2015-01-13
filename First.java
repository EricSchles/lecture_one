import java.lang.Math;

class Tuple{ 
  public final Integer x; 
  public final Integer y; 
  public Tuple(Integer x, Integer y) { 
    this.x = x; 
    this.y = y; 
  } 
} 

public class First{


	public static Double distance(Tuple first, Tuple second){
		Integer y_delta = (second.y - first.y);
		Integer x_delta = (second.x - first.x);
		return Math.sqrt(y_delta*y_delta + x_delta*x_delta);
	}


	public static <T> void print(T input){
		System.out.println(input);
	} 
	public static void main(String[] args){
		
		ArrayList list = new ArrayList();
		Tuple first = new Tuple(1,1);
		Tuple second = new Tuple(8,6);
		Tuple third = new Tuple(6,8);
		Tuple fourth = new Tuple(1,3); 

		list.add(first);
		list.add(second);
		list.add(third);
		list.add(fourth);

		
	}

}