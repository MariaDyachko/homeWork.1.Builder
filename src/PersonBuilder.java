public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder(String surname) {
        this.surname = surname;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        String validPerson = validatePerson();
        if (validPerson.isEmpty()) {
            return new Person(name, surname, age, address);
        } else {
            throw new IllegalStateException(validPerson);
        }
    }

    private String validatePerson() {
        if (age < 0) {
            return "возраст не может быть отрицательным";
        } else if (this.name == null || name.trim().isEmpty()) {
            return "поле \"Имя\" не заполнено";
        } else if (this.surname == null || surname.trim().isEmpty()) {
            return "поле \"Фамилия\" не заполнено";
        }
        return "";

    }


}
