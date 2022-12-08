package Builder;

public interface PersonBuilder {

    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setHeight(int height);

    Person build();
}
