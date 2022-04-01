package entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
    protected String id;
    protected String name;
    protected LocalDate bday;
    protected String email;
    protected String phone;
    public enum EmployeeType {Experience, Fresher, Intern}
    protected List<Certificate> certificateList;
    protected static long count = 0;

    public Employee(String id, String name, LocalDate bday, String email, String phone, List<Certificate> certificateList) {
        this.id = id;
        this.name = name;
        this.bday = bday;
        this.email = email;
        this.phone = phone;
        this.certificateList = certificateList;
    }

    public abstract void showInfo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBday() {
        return bday;
    }

    public void setBday(LocalDate bday) {
        this.bday = bday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Certificate> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<Certificate> certificateList) {
        this.certificateList = certificateList;
    }

}
