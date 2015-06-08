/**
 * Created by jesse_000 on 6/8/2015.
 */
public class TestStack {
    public static void main(String[] args) {
        System.out.println("Test 1: isEmpty");
        Stack stack = new Stack();
        boolean result = stack.isEmpty();
        System.out.println("Expected: true actual: " + result);

        System.out.println("Test 2: push makes isEmpty false");
        stack = new Stack();
        stack.push("one");
        result = stack.isEmpty();
        System.out.println("expected: false actual: " + result);

        System.out.println("Test 3: pop makes isEmpty true");
        stack = new Stack();
        stack.push("one");
        stack.push("Two");
        stack.pop();
        stack.pop();
        result = stack.isEmpty();
        System.out.println("expected: true actual: " + result);
        System.out.println("Test 4: top");
        stack = new Stack();
        stack.push("1");
        String str = stack.top();
        stack.push("2");
        str += stack.top();
        stack.push("3");
        str += stack.top();
        while (!stack.isEmpty()) {
            str += stack.top();
            stack.pop();
        }
        System.out.println("expected: 123321 actual: " + str);

    }
}
