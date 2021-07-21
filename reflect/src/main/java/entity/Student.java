package entity;

/**
 * @author minp
 * @version 2.0
 * @date 2021/7/18 11:31 上午
 */

public class Student {
    private String age;
    private String name;
    private String address;

    public Student() {
    }

    public Student(String age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
