package getInfo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class CreateFields {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //Также во время выполнения программы можно получать и задавать значения полям.
        //Рассмотрим следующий пример, демонстрирующий, почему с reflection нужно обращаться с осторожностью.

        HashMap map = new HashMap();//Создадим объект класса HashMap
        Class<?> clazz = map.getClass();//Получим у него класс

        //Создадим у него новый объект HashMap
        HashMap hashMap = (HashMap) clazz.getConstructor().newInstance();

        //Получим у созданного объекта поле size
        Field size = hashMap.getClass().getDeclaredField("size");

        //Установим доступность поля
        size.setAccessible(true);

        //Установим полю size значение 10
        size.setInt(hashMap, 10);

        System.out.println("Map is empty: " + hashMap.isEmpty());
        System.out.println("Map size: " + hashMap.size());
        System.out.println("Values: " + hashMap.toString());


    }
}
