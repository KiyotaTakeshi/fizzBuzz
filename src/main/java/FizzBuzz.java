import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private Rule rule;

    private Map<Integer, String> results = new HashMap<>();

    public void doFizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            String result = rule.checkFizzBuzz(i);
            if (result.isEmpty()) {
                results.put(i, String.valueOf(i));
            } else {
                results.put(i, result);
            }
        }
    }

    public FizzBuzz(Rule rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "FizzBuzz{" +
                "results=" + results +
                '}';
    }
}
