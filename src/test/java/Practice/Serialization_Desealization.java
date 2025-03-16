package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_Desealization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	Employee e = new Employee();
	e.setId(1008);
	e.setName("Naveen");
	
	
	// Serialization
	
	FileOutputStream fileoutputstream = new FileOutputStream("C:\\Users\\navee\\OneDrive\\Desktop\\Serialization\\serializableFile5.ser");
	ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
	objectoutputstream.writeObject(e);
	objectoutputstream.close();
	fileoutputstream.close();
	
	// Deserialization
	
	FileInputStream fis = new FileInputStream("C:\\Users\\navee\\OneDrive\\Desktop\\Serialization\\serializableFile2.ser");
	ObjectInputStream object = new ObjectInputStream(fis);
	Employee recreateObject=(Employee) object.readObject();
	System.out.println(recreateObject.getName());
	object.close();
	fis.close();
	
	
}
}
