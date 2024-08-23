import java.lang.reflect.Method;

class ReflectEx {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.util.Date");
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("toString");
            String result = (String) method.invoke(obj);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
