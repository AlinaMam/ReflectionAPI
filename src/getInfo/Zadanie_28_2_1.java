package getInfo;

import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;

public class Zadanie_28_2_1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Имеет ли ArrayList модификаторы public или protected
        //2. Имеет ли AbstractList модификаторы static или abstract
        //3. Является ли Collection интерфейсом


        //1
        Class arrayList = Class.forName("java.util.ArrayList");
        int modifiers = arrayList.getModifiers();
        System.out.println("ArrayList имеет модификатор public: " + Modifier.isPublic(modifiers));
        System.out.println("ArrayList имеет модификатор protected: " + Modifier.isProtected(modifiers));

        //2
        Class abstractList = Class.forName("java.util.AbstractList");
        int modifiers1 = abstractList.getModifiers();
        System.out.println("AbstractList имеет модификатор static: " + Modifier.isStatic(modifiers1));
        System.out.println("AbstractList имеет модификатор abstract: " + Modifier.isAbstract(modifiers1));

        //3
        Class collection = Class.forName("java.util.Collection");
        int modifiers2 = collection.getModifiers();
        System.out.println("Collection является интерфейсом: " + Modifier.isInterface(modifiers2));





    }
}
