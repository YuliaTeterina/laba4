import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Collections {
    public static <T, C extends Collection<T>> C collect(List<T> list,
                                                         Supplier<C> collectionFactory,
                                                         Predicate<T> predicate) {
        C result = collectionFactory.get();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}