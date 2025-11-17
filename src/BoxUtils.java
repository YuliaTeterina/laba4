import java.util.List;
import java.util.ArrayList;

public class BoxUtils {

    public static double findMaxValue(List<? extends Box<? extends Number>> boxes) {
        if (boxes == null || boxes.isEmpty()) {
            throw new IllegalArgumentException("Список коробок не может быть пустым");
        }

        Double max = null;

        for (Box<? extends Number> box : boxes) {
            if (box != null && box.isFull()) {
                Number value = box.peek();
                if (value != null) {
                    double doubleValue = value.doubleValue();
                    if (max == null || doubleValue > max) {
                        max = doubleValue;
                    }
                }
            }
        }

        if (max == null) {
            throw new IllegalArgumentException("Не найдено ни одного заполненного числа в коробках");
        }

        return max;
    }
}