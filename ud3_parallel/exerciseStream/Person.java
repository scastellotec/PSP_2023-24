package ud3_parallel.exerciseStream;

public class Person {

    private String name;
    private Integer age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    String gender;
    Country country;

    public Boolean isAdult() {
        return age >= 18;
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String gender, Country country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
