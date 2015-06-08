import java.util.ArrayList;

/**
 * Created by jesse_000 on 6/8/2015.
 */
public class Stack {
    private ArrayList<String> values;

    public Stack() {
        values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void push(String value) {
        values.add(value);
    }

    public void pop() {
        values.remove(values.size() - 1);
    }

    public String top() {
        return values.get(values.size() - 1);
    }
}
