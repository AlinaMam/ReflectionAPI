package getInfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CallMethods {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*Рассмотрим также, как вызвать методы с помощью Java reflection.
        * Вызовем метод put() у объекта класса HashMap (см. юнит 15.6).
        * Получим метод put() с помощью метода getDeclaredMethod("put", Object.class, Object.class),
        * где первый параметр — имя метода, который мы хотим получить, а последующие — типы аргументов получаемого метода.
        * Вызвать метод можно с помощью метода invoke(), передав в него объект, у которого вызывается и метод, и аргументы.
        * */

        HashMap map = new HashMap();//Создаем объект класса HashMap
        Class clazz = map.getClass();//Получаем объект класса у созданного объекта

        //У класса объекта получим метод put
        Method putMethod = clazz.getDeclaredMethod("put", Object.class, Object.class);

        //Вызовем метод put. В качестве ключа укажем значение "key" и в качестве значения - "value"
        putMethod.invoke(map, "key", "value");

        System.out.println("Values: " + map.toString());

    }
}
