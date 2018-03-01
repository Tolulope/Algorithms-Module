
public class MinHeapElement extends Tuple {
	
	public boolean isLeftChild;
	public boolean isRightChild;
	public boolean isHead;
	
	int parent;
	int value;

	public MinHeapElement(int parent, int value, String leftOrRight) throws Exception {
		super(parent, value);
		if(leftOrRight.toLowerCase().equals("l")) {
			isLeftChild = true;
			isRightChild = false;
		} else if (leftOrRight.toLowerCase().equals("r")) {
			isRightChild = true;
			isLeftChild = false;
		} else {
			throw new IllegalArgumentException("Need to say whether it is a left or right child");
		}
		
	}
	
	public boolean isMinHeaElement() {
		boolean isMinHeapElement = false;
		if(x < y) {
			isMinHeapElement = true;
		}
	return isMinHeapElement;	
	}
	
	public void setParent(int par) {
		this.parent = par;
	}
	
	public void setHead() {
		this.parent = -1;
		this.isHead = true;
	}
	
	public void setLeftChild() {
		this.isLeftChild = true;
		this.isRightChild = false;
	}
	
	public void setRightChild() {
		this.isRightChild = true;
		this.isLeftChild = false;
	}
	
	
	

}
