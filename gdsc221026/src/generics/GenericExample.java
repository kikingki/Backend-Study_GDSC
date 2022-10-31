package generics;

public class GenericExample {
    public static void main(String[] args) {
        // 사용할 때 타입 지정
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>();
        MyGenericClass<String> exampleString = new MyGenericClass<>();

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics!");
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());

        /*
        제네릭 타입 파라미터 관련 활용법 --> 제네릭은 데이터 타입에 대한 불확실성이 있기 때문에 Bound 개념 필요
        - Unbounded(제약 없음)
        - bounded(제약 있음)
            1. Upper Bound(지정한 클래스와 그 자식들만 가능-상한선, 모든 파라미터 타입 가능)
            2. Lower Bound(지정한 클래스와 그 부모들만 가능-하한선, Wildcard 사용 구현)
         */
    }
}
