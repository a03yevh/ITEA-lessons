package Homeworks.HW_Lesson9_sp.HW9;

import java.lang.reflect.InvocationTargetException;

public class MyClass<T> {
    public static <T> T factoryMethod(Class<T> type) {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}