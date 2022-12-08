package Builder;

public class PersonBuilderImp implements PersonBuilder{

    private Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setHeight(int height) {
        person.height = height;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
