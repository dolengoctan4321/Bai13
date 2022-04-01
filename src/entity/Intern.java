package entity;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{

    private String uniName;
    private String major;
    private int semester;

    public Intern(String id, String name, LocalDate bday, String email, String phone, List<Certificate> certificateList, String uniName, String major, int semester) {
        super(id, name, bday, email, phone, certificateList);
        this.uniName = uniName;
        this.major = major;
        this.semester = semester;
    }

    @Override
    public void showInfo() {

    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bday=" + bday +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", uniName='" + uniName + '\'' +
                ", major='" + major + '\'' +
                ", semester=" + semester +
                '}';
    }
}
