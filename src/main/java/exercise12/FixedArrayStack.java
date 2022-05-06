package exercise12;

public class FixedArrayStack implements Stack{
	
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		if(top == contents.length - 1) {
			throw new StackFullException("Stack is full with size: "+contents.length);
		}
		contents[++top] = anElement;
	}
	
	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException("Stack is empty");
		}
		return contents[top--];
	}

}
