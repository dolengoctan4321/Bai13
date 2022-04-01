package entity;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{

    private LocalDate gradDate;
    private String uniName;
    private String gradRank;

    public Fresher(String id, String name, LocalDate bday, String email, String phone, List<Certificate> certificateList, LocalDate gradDate, String uniName, String gradRank) {
        super(id, name, bday, email, phone, certificateList);
        this.gradDate = gradDate;
        this.uniName = uniName;
        this.gradRank = gradRank;
    }

    public LocalDate getGradDate() {
        return gradDate;
    }

    public void setGradDate(LocalDate gradDate) {
        this.gradDate = gradDate;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getGradLevel() {
        return gradRank;
    }

    public void setGradLevel(String gradLevel) {
        this.gradRank = gradRank;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bday=" + bday +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gradDate=" + gradDate +
                ", uniName='" + uniName + '\'' +
                ", gradLevel='" + gradRank + '\'' +
                '}';
    }
}
