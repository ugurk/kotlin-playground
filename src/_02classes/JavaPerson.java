package _02classes;

import java.util.Objects;

public class JavaPerson {

    private String fullName;
    private Integer age;

    public JavaPerson(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaPerson person = (JavaPerson) o;
        return Objects.equals(fullName, person.fullName) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age);
    }

    @Override
    public String toString() {
        return "JavaPerson{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}
