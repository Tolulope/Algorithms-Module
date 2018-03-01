
public class Tuple{ 
	//tuple of ints for heap
	//could even be used for graphs in the future
  public final int x; 
  public final int y;
  
  public Tuple(int x, int y) { 
    this.x = x; 
    this.y = y; 
  } 
  
  //some of these methods are inspired by haskell tuples
  
  public int first() {
	  return x;
  }
 
  public int second() {
	  return y;
  }
}