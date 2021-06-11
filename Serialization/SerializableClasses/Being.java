// package .SerializableClasses;
import java.io.Serializable;

public class Being implements Serializable {
    private static final long serialVersionUID = 1L;
    // Serialized
    private String surname;
    private String name;
    private int age;

    // Not Serialized
    transient boolean isGoodMood;

    public Being() {

    }

    public Being(String sname, String name) {
    this.name = name;
    this.surname = sname;
    }
    public Being(String sname, String name,int age) {
        this.name = name;
        this.surname = sname;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGoodMood() {
        return isGoodMood;
    }

    public void setGoodMood(boolean goodMood) {
        isGoodMood = goodMood;
    }
}
