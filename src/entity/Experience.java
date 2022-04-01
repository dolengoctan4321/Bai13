package entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {

    private int exyear;
    private String skills;

    public Experience(String id, String name, LocalDate bday, String email, String phone, List<Certificate> certificateList, int exyear, String skills) {
        super(id, name, bday, email, phone, certificateList);
        this.exyear = exyear;
        this.skills = skills;
    }

    public int getExyear() {
        return exyear;
    }

    public void setExyear(int exyear) {
        this.exyear = exyear;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String toString() {
        return "Experience{" +
                "id='" + id + '\'' +
                ", fullName='" + name + '\'' +
                ", birthday=" + bday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", exyear=" + exyear +
                ", skills='" + skills + '\'' +
                '}';
    }


}
