import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建User 实例 libob
        User user = new User(1, "libob", 36);

        ArrayList
//        System.out.println(user.age);// age属性增加private后，代码报错，注释掉。
        // 输出36，Test 类可以访问User 的age属性

        // 需求1. 禁止Test类访问User的age属性
        // age属性增加访问权限 private
        // 改造完成 👍

        // 需求2. 人的中年呀（36岁），我也年轻些
        // 方法：增加获取age属性的专有方法，在方法中我的实际年龄减5岁
        System.out.println(user.getAge());
        // 真好，还是一个追风少年么，减10岁，才是追风少年
        //再次输出 26,我是一个追风少年，wow。

//        Person libob = new Person("libob", 29);
//        Student shi = new Student("shi", 21, 2, 1901);
//
//        shi.getAge();// 子类调用父类
//        libob.getGrade();// 父类调用子类
    }
}
