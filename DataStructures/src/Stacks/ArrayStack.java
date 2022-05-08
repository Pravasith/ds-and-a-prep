package Stacks;

public class ArrayStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = -1;

    public void push(int data) {
        if (top + 1 == capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];

            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }

        stack[++top] = data;
    }

    public void pop() {
        if (top >= 0) {
            stack[top] = 0;
            top--;
        }

    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        for (int i = 0; i < top + 1; i++) {
            System.out.print(stack[i] + ", ");
        }

        System.out.println("\n");
    }
}
