import entity.Person;
import entity.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author minp
 * @version 2.0
 * @date 2021/7/17 11:29 下午
 */

public class KnowClassNameTest {

    @Test
    public void k1Test() throws Exception  {
        Class<?> c1 =  Class.forName("entity.Person");
        Person aClass = (Person) c1.getDeclaredConstructor().newInstance();
        Method[] methods = c1.getMethods();

        for (int i = 0; i < methods.length;i++){
            String name = methods[i].getName();
        }
        Field[] fields = c1.getDeclaredFields();


        for (int f = 0; f < fields.length; f++) {
            String name = fields[f].getName();
        }
        Field field = c1.getDeclaredField("age");

        String canonicalName = c1.getCanonicalName();
        String aClassName = aClass.getName();


        Constructor<?> constructor = c1.getConstructor(Integer.class, String.class, String.class);


        constructor.newInstance(30,"java","java");
        Student ff = ff(Student.class);



        System.out.println(ff);


    }
    private <T> T ff(Class<T> t) throws Exception {
        Field[] fields = t.getDeclaredFields();

        T t1 = t.newInstance();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            fields[i].set(t1,"1");
        }

        return t1;
    }


    @Test
    public void k2Test() {
        Person c2 =  new Person();
        Class<? extends Person> aClass = c2.getClass();
        System.out.println(aClass);


    }
    @Test
    public void k3Test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c3 =  Person.class;
        Person aClass = (Person) c3.getDeclaredConstructor().newInstance();

    }
}
