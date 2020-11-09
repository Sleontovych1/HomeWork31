package ua.home.javapro;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Less3work1 {

    public static void main(String[] args) {
        Class<?> cls = TestClass.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(TestNew.class)) {
                TestNew test = method.getAnnotation(TestNew.class);
                try {
                    method.invoke(new TestClass(), test.a(), test.b());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}