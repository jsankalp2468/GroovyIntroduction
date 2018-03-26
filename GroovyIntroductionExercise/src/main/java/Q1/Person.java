package Q1;

public class Person {
    String name;
    int age;
    String gender;
    String address;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sankalp");
        person.setAge(1);
        person.setGender("Male");
        person.setAddress("Alpha-2, Greater Noida");

        System.out.println("**********************************");

        System.out.println("Through Getters");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());


        System.out.println("**********************************");

        System.out.println("Through Dot(.) Operater");

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.address);

    }


}

//Q) Create a class in Java along with follwing fields.
// classname: Q1.Person fields: name, age, gender, address
// Access the fields in all known ways: like through getter , by dot operator
