public class Student extends Person{

    private Integer grade;// 班级
    private Integer number;// 学号




    public Student(String name, Integer age, Integer grade, Integer number) {
        super(name, age);
        this.grade = grade;
        this.number = number;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
