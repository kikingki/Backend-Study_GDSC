package annotation;

import java.lang.reflect.Method;

// 어노테이션은 어노테이션을 붙인 코드(데이터)에 대한 정보를 알려주는 메타 데이터
public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException{
        Method m1 = AnnotationExample.class.getDeclaredMethod("printAgeDefault");
        CustomAnnotation customAnnotation1 = m1.getDeclaredAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation1.myAge());

        Method m2 = AnnotationExample.class.getDeclaredMethod("printAgeCustom");
        CustomAnnotation customAnnotation2 = m2.getDeclaredAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation2.myAge());
    }

    // 직접 만든 어노테이션은 다른 개발자가 무슨 역할을 하는지 하나하나 다 알아봐야 함.
    @CustomAnnotation
    public static void printAgeDefault() {
    }

    @CustomAnnotation(myAge = 28)
    public static void printAgeCustom() {
    }
}
