package academy.javapro;

public class StackAdditionLab {
    public static void main(String[] args) {
        // Test case 1: Basic operations and addition
        System.out.println("=== Test Case 1: Basic Addition ===");
        // TODO: Create an instance of ArrayStack named stack
        ArrayStack<Integer> stack = new ArrayStack<>();

        // TODO: Verify the stack is empty using the isEmpty method
        System.out.println("Is stack empty? " + stack.isEmpty());
        // TODO: Push two elements to the stack: 10 and 20
        stack.push(10);
        stack.push(20);

        // TODO: Verify size of the stack using the size method
        System.out.println("Size after pushing two elements: " + stack.size());
        // TODO: Print the stack statistics using the getStats method
        System.out.println(stack.getStats());
        // TODO: Print the global statistics using the getGlobalStats method
        System.out.println(stack.getGlobalStats());
        // TODO: Add the top two elements using the addTopTwo method
        stack.addTopTwo();
        // TODO: Get the result of the addition using the pop method by assigning it to a variable named result
        Number result = stack.pop();
        // TODO: Print the result of the addition
        System.out.println("Sum: " + result);

        // Test case 2: Resizing
        System.out.println("\n=== Test Case 2: Array Resizing ===");

        // TODO: Create an instance of ArrayStack named resizeStack
        ArrayStack<Integer> resizeStack = new ArrayStack<>();

        // TODO: Push 15 elements to trigger resize (default capacity is 10) using a loop
        System.out.println("Pushing 15 elements to trigger resize...");

        // TODO: Print the stack size after pushing 15 elements
        for(int i = 0; i < 15; i++){
            resizeStack.push(i);
        }
        System.out.println("Stack size after pushing 15 elements: " + resizeStack.size());

        // TODO: Print the stack statistics using the getStats method
        System.out.println(resizeStack.getStats());

        // Test case 3: Multiple instances
        System.out.println("\n=== Test Case 3: Multiple Stack Instances ===");

        // TODO: Create an instance of ArrayStack named floatStack with Double type
        ArrayStack<Double> floatStack = new ArrayStack<>();
        // TODO: Push three elements to the floatStack: 1.5, 2.5, and 3.5
        floatStack.push(1.5);
        floatStack.push(2.5);
        floatStack.push(3.5);
        // TODO: Print the first stack statistics using the getStats method
        System.out.println("First Stack stats: " +stack.getStats());
        // TODO: Print the statistics for resizeStack and floatStack
        System.out.println("Second Stack stats: " +resizeStack.getStats());
        System.out.println("Third Stack stats: " + floatStack.getStats());
        // TODO: Print the global statistics using the getGlobalStats method
        System.out.println("Global stats: " + stack.getGlobalStats());
    }
}
