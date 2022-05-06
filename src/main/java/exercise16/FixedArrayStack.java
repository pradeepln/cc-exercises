package exercise16;

import java.util.Arrays;

public class FixedArrayStack implements Stack{
	
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public synchronized void push(Object anElement) {
		contents[++top] = anElement;
	}
	
	@Override
	public synchronized Object pop() {
		return contents[top--];
	}

	@Override
	public synchronized Object[] toArray() {
		return Arrays.copyOf(contents, contents.length);
	}
}
