package getInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class InfoPackage {
    public static void main(String[] args) {
        //С помощью рефлексии мы также можем получить информацию о пакете, в котором хранится класс объекта.
        //Эта информация находится в классе Package.
        //Данный класс можно получить, вызвав метод getPackage() у объекта класса.

        Object obj = 5;
        Class clazz = obj.getClass();
        Package classPackage = clazz.getPackage();
        System.out.println(classPackage.getName());

        //Чтобы получить информацию о родительском классе достаточно вызвать метод getSuperclass().
        //Например, получим имя родительского класса строки

        String str = "example";
        Class superClass = str.getClass().getSuperclass();
        System.out.println(superClass.getSimpleName());

        System.out.println("------------------");

        //Информация об интерфейсах
        //Здесь стоит обратить внимание на то, что метод getInterfaces() вернёт только интерфейсы класса объекта,
        //при этом в них не будет интерфейсов родительского класса, несмотря на то, что класс их тоже имплементирует.

        Object map = new HashMap<>();
        Class[] interfaces = map.getClass().getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        System.out.println("------------------");

        //Конструкторы, методы и поля
        //Рассмотрим какие есть конструкторы у класса HashMap

        Object mapa = new HashMap<>();
        Constructor[] constructors = mapa.getClass().getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);

        System.out.println("------------------");

        //Все поля класса можем получить с помощью метода getDeclaredFields()
        Object mapa1 = new HashMap<>();
        Field[] declaredField = mapa1.getClass().getDeclaredFields();
        Arrays.stream(declaredField).forEach(System.out::println);

        System.out.println("------------------");

        //Получить описание всех методов класса
        Object hashMap = new HashMap<>();
        Method[] declaredMethods = hashMap.getClass().getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);

    }
}
