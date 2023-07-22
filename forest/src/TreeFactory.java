import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> trees = new HashMap<>();

    public static TreeType getTreeType(final String name, final String color) {
        final String key = name + '#' + color;
        if (!trees.containsKey(key)){
            trees.put(key, new TreeType(name, color));
        }
        return trees.get(key);
    }
}
