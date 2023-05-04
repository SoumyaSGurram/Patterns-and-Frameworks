package Question21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class question21 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	    public static void main(String[] args) throws IOException, ClassNotFoundException {
	        // Create an object to be serialized
	        Person person = new Person("John", 30);

	        // Serialize the object to a file
	        FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
	        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	        objectOutputStream.writeObject(person);
	        objectOutputStream.close();
	        fileOutputStream.close();

	        // Deserialize the object from the file
	        FileInputStream fileInputStream = new FileInputStream("person.ser");
	        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	        Person deserializedPerson = (Person) objectInputStream.readObject();
	        objectInputStream.close();
	        fileInputStream.close();

	        // Print the deserialized object's state
	        System.out.println("Deserialized person:");
	        System.out.println("Name: " + deserializedPerson.getName());
	        System.out.println("Age: " + deserializedPerson.getAge());
	    }
	}

	class Person implements Serializable {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }


	}

