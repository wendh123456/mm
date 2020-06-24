package cn.wendh;

import java.util.Objects;

public class Stutent {
    private String name;
    private  int age;

    public Stutent() {
    }

    public Stutent(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stutent stutent = (Stutent) o;
        return age == stutent.age &&
                Objects.equals(name, stutent.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Stutent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
