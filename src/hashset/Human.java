package hashset;

import java.util.Objects;

public class Human {
    private int age;
    private String name;
    private String surname;

    public static class BuilderHuman {
        private Human h;

        public BuilderHuman() {
            h = new Human();
        }

        public BuilderHuman setAge(int age) {
            h.age = age;
            return this;
        }

        public BuilderHuman setName(String name) {
            h.name = name;
            return this;
        }

        public BuilderHuman setSurname(String surname) {
            h.surname = surname;
            return this;
        }

        public Human buildHuman() {
            return h;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
