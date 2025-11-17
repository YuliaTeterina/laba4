import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionApply {
    public static <T, R> List<R> apply(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(function.apply(item));
        }
        return result;
    }
}