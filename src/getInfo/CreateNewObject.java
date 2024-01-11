package getInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class CreateNewObject {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*C помощью Java reflection можно не только получить информацию об объекте, но и создать новый объект.
        Делается это с помощью класса java.lang.reflect.Constructor.
        Чтобы создать новый объект класса, нужно получить конструктор класса и вызвать у него метод newInstance()*/

        Class clazz = Class.forName("java.util.HashMap");
        Constructor constructor = clazz.getConstructor();
        HashMap hashMap = (HashMap) constructor.newInstance();
        System.out.println(hashMap.getClass().getSimpleName());
        System.out.println(hashMap.isEmpty());


    }
}
