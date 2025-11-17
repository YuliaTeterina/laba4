public class Storage<T> {
    private final T value;
    private final T alternative;

    public Storage(T value, T alternative) {
        this.value = value;
        this.alternative = alternative;
    }

    public T getValue() {
        if (value != null) {
            return value;
        } else {
            return alternative;
        }
    }

    public void printValue() {
        System.out.println("Извлеченное значение: " + getValue());
    }

    @Override
    public String toString() {
        return "Storage{value=" + value + ", alternative=" + alternative + "}";
    }
}