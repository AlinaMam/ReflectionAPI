package Zadacha_28_2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Class> classes = getAllClasses();
        for (Class clazz : classes) {
            //имплементирует ли класс интерфейс Deletable и проверяем что класс не является интерфейсом
            if (Deletable.class.isAssignableFrom(clazz) && !Modifier.isInterface(clazz.getModifiers())) {
                Deletable deletable = (Deletable) clazz.getConstructor().newInstance();
                deletable.delete("s3d4");
            }
        }
    }

    public static List<Class> getAllClasses() throws IOException, ClassNotFoundException {
        //getClassLoader() - возвращает загрузчик классов для конкретного класса
        //getResource("") - означает, что классы лежат в том же пакете, что и класс Main
        URL upackage = Main.class.getClassLoader().getResource("");

        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
        String line;
        List<Class> classes = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            classes.add(Class.forName(line.replace(".class", "")));
        }
        return classes;

    }
}
