package classloader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyClassLoader extends ClassLoader {

    private final Path classDirectory;

    public MyClassLoader(Path classDirectory) {
        this.classDirectory = classDirectory;
    }

    @Override
    protected Class<?> findClass(String name)
            throws ClassNotFoundException {

        System.out.println("Finding: " + name);

        try {
            Path classFile = classDirectory.resolve(
                    name.replace('.', '/') + ".class"
            );

            System.out.println("Looking at: " + classFile);

            byte[] classBytes =
                    Files.readAllBytes(classFile);

            return defineClass(
                    name,
                    classBytes,
                    0,
                    classBytes.length
            );

        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        }
    }
}