// package .SerializableClasses;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class HumanNotSerializable extends Human{

    private void writeObject(ObjectOutputStream oos) throws IOException {
		// Throw to prevent serialization 
        throw new NotSerializableException();
    }

    public HumanNotSerializable() {
    }

    public HumanNotSerializable(String sname, String name) {
        super(sname, name);
    }

    public HumanNotSerializable(String sname, String name, int age) {
        super(sname, name, age);
    }
}
