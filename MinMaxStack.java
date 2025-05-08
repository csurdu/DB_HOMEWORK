import java.util.*;
class MinMaxStack {
    private Stack<Integer> minStack;
    private Stack<Integer> maxStack;

    public MinMaxStack() {
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void insert(int value) {

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new NoSuchElementException("No elements in minStack");
    }

    public int extractMin() {
        if (!minStack.isEmpty()) {
            return minStack.pop();
        }
        throw new NoSuchElementException("No elements in minStack");
    }

    public int getMax() {
        if (!maxStack.isEmpty()) {
            return maxStack.peek();
        }
        throw new NoSuchElementException("No elements in maxStack");
    }

    public int extractMax() {
        if (!maxStack.isEmpty()) {
            return maxStack.pop();
        }
        throw new NoSuchElementException("No elements in maxStack");
    }
}