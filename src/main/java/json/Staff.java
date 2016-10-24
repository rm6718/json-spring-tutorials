package json;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sam on 10/24/16.
 */
public class Staff {

    private String name;
    private int age;
    private String position;
    private BigDecimal salary;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int getYearswithcompany() {
        return yearswithcompany;
    }

    public void setYearswithcompany(int yearswithcompany) {
        this.yearswithcompany = yearswithcompany;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private List<String> skills;
    private int yearswithcompany;
    private String birthday;


}
