package getInfo;

import java.lang.reflect.Modifier;

public class Example_from_Lesson {
    public static void main(String[] args) throws ClassNotFoundException {
        //имена классов
        //для объекта можно узнать имя его класса. Это может помочь при логировании ошибок, когда мы хотим записать
        //в каком классе произошла ошибка
        Object str = "example";
        Class<?> clazz = str.getClass();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());

        System.out.println("---");

        //getModifiers() - можно узнать модификаторы класса
        //возвращает значение типа Integer, которое хранит в себе информацию о присутствии или отсутствии конкретного модификатора
        //класс java.lang.reflect.Modifier предоставляет методы, позволяющие расшифровать это значение

        //Рассмотрим модификаторы классов HashMap, AbstractMap, Map:
        //Получим модификаторы каждого класса, вызвав метод getModifiers()
        //Проверим, является ли класс HashMap публичным и абстрактным, используя методы Modifier.isPublic() и Modifier.isAbstract() соответственно
        //Также проверим, является ли AbstractMap абстрактным классом, а Map  — интерфейсом

        //Получаем класс для java.util.HashMap
        Class hashMap = Class.forName("java.util.HashMap");

        //Получаем класс для java.util.AbstractMap
        Class abstractMap = Class.forName("java.util.AbstractMap");

        //Получаем класс для java.util.Map
        Class map = Class.forName("java.util.Map");

        //Получаем модификаторы для HashMap
        int hashMapModifiers = hashMap.getModifiers();

        //Получаем модификаторы для AbstractMap
        int abstractMapModifiers = abstractMap.getModifiers();

        //Получаем модификаторы для Map
        int mapModifiers = map.getModifiers();

        //Выводим, имеет ли HashMap public модификатор
        System.out.println("HashMap class is public: " + Modifier.isPublic(hashMapModifiers));

        //Выводим, имеет ли AbstractMap abstract модификатор
        System.out.println("AbstractMap class is abstract: " + Modifier.isAbstract(abstractMapModifiers));

        //Выводим, имеет ли Map interface модификатор
        System.out.println("Map is interface: " + Modifier.isInterface(mapModifiers));

        //Выводим, имеет ли HashMap abstract модификатор
        System.out.println("HashMap class is abstract: " + Modifier.isAbstract(hashMapModifiers));
    }
}
