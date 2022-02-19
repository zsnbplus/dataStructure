package JVM;

public class Car {

    public static void main(String[] args) {
        /*实例对象由同一个模板类创建而来*/
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Class<? extends Car> aClass = car2.getClass();
        ClassLoader classLoader = car1.getClass().getClassLoader();
        System.out.println( car1.getClass().getClassLoader()); //AppClassLoader
        System.out.println(classLoader.getParent()); //ExtClassLoader
        System.out.println(classLoader.getParent().getParent()); //null  没有这个方法或者 调用不到(用c或c++写的在操作系统的本地方法库中，访问不到)
    }
}
