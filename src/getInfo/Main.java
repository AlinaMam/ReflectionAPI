package getInfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Создать экземпляр класса
        MyClass obj = new MyClass();

        // Получить класс объекта
        Class<?> cls = obj.getClass();

        // Получить приватный метод по его имени
        Method method = cls.getDeclaredMethod("privateMethod");

        // Разрешить вызов приватного метода
        method.setAccessible(true);

        // Вызвать приватный метод объекта
        method.invoke(obj);

    }
}
class MyClass {
    private void privateMethod() {
        System.out.println("Вызван приватный метод");
    }
}
