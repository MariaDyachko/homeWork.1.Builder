public class Person {
    protected String name;
    protected String surname;

    protected int age;

    protected String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        if (age == 0) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (this.address.isEmpty()) {
            return false;
        }
        return true;

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(PersonBuilder personBuilder) {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ФИО = '" + name + " " + surname + '\''
                + ", Возраст = " + age
                + ", Адрес = " + address
                + '}';
    }

    @Override
    public int hashCode() {
        return age * name.hashCode() * surname.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(surname);
    }


}
