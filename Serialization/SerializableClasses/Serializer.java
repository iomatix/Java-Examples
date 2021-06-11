//package .SerializableClasses;

import java.io.*;

public class Serializer {
    public Serializer() {
    }

    public static class Serialization {
        public static <E> void Serialzie(E Object, String fileName) {
            // Serialization
            try {
                //Saving of object in a file
                FileOutputStream file = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(file);

                // Method for serialization of object
                out.writeObject(Object);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            } catch (IOException ex) {
                System.out.println("IOException is caught");
            }

        }

        public static <E> E Deserialize(E Object, String fileName) {
            // Deserialization
            try {
                // Reading the object from a file
                FileInputStream file = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method for deserialization of object
                Object = (E) in.readObject();

                in.close();
                file.close();

                System.out.println("Object has been deserialized ");
            } catch (IOException ex) {
                System.out.println("IOException is caught");
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException is caught");
            }
            return Object;
        }
    }
}
