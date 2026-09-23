package classloader;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args)
            throws Exception {

        Path path = Path.of("custom_classes");

        MyClassLoader loader =
                new MyClassLoader(path);

        Class<?> clazz =
                loader.loadClass("classloader.MyClass");

        System.out.println("Class: " + clazz);

        System.out.println(
                "Loader: " + clazz.getClassLoader()
        );
    }
}