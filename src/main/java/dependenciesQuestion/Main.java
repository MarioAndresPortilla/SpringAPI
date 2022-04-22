package dependenciesQuestion;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] projects = new String[]{"a", "b", "c", "d", "e", "f"};
        List<String[]> dependencies = new ArrayList<>();
        dependencies.add(new String[]{"a", "d"});
        dependencies.add(new String[]{"f", "b"});
        dependencies.add(new String[]{"b", "d"});
        dependencies.add(new String[]{"f", "a"});
        dependencies.add(new String[]{"d", "c"});

        try {
            String[] res = dependenciesQuestion.BuildOrderResolver.Build(projects, dependencies);
            StringBuilder workingString = new StringBuilder("");
            for (int i = 0; i < res.length; i++) {
                if (i != 0) {
                    workingString.append(", ");
                }
                workingString.append(res[i]);
            }
            System.out.println("Order after build: " + workingString.toString());
        } catch (Exception e) {
            System.out.println("Fatal Error: " + e.toString());
        }
    }
}