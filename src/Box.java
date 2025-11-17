public class Box<T> {
    private T value;

    public Box() {
        this.value = null;
    }

    public boolean isFull() {
        return value != null;
    }

    public void put(T value) {
        if (isFull()) {
            throw new IllegalStateException("Коробка уже заполнена! Нельзя положить новый объект.");
        }
        this.value = value;
    }

    public T get() {
        T result = value;
        value = null;
        return result;
    }

    public T peek() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{value=" + value + "}";
    }
}