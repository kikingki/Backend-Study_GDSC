package generics;


// 제네릭 - 어떤 클래스가 모든 자료형에 같은 기능 제공
public class MyGenericClass<T> {
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
