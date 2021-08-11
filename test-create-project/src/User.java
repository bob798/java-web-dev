public class User {
    Integer id;
    String name;
    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age-10;
    }

    public Integer getId() {
        return id;
    }
}
