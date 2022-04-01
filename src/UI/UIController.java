package UI;

import DV.EmployeeController;
import DV.ExceptionService;
import entity.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import Exception.BirthDayException;
import Exception.FullNameException;
import Exception.EmailException;
import Exception.PhoneException;

public class UIController {
    EmployeeController employeeController = new EmployeeController();

    public void insertID() {
        Employee employeeType = null;
        int flag = ScannerFac.isValidInt();
        switch (flag){
            case 1: {
                employeeType = this.insertExperience();
                break;
            }
            case 2: {
                employeeType = this.insertFresher();
                break;
            }

            case 3: {
                employeeType = this.insertIntern();
                break;
            }
            default:
                System.err.println("Sai mat roi");
        }
        try{
            check(employeeType);
        }catch (BirthDayException e){
            System.err.println("Nhap sai dinh dang, xin moi nhap lai");
        } catch (EmailException e){
            System.err.println("Nhap sai dinh dang, xin moi nhap lai");
        } catch (FullNameException e){
            System.err.println("Nhap sai dinh dang, xin moi nhap lai");
        } catch (PhoneException e){
            System.err.println("Nhap sai dinh dang, xin moi nhap lai");
        }
        this.employeeController.insert(employeeType);
        System.out.println(employeeType);
    }

    public void searchID(){
        System.out.println("Nhap ID can cap nhat: ");
        String id = ScannerFac.isValidString();
        Employee employee = this.employeeController.searchByID(id);
        System.out.println(employee.toString());
    }

    public void searchByTypeEm(){
        int flag = ScannerFac.isValidInt();
        Employee employeeSearch = (Employee) this.employeeController.searchByType(flag);
        System.out.println(employeeSearch.toString());
    }

    public void remove(){
        System.out.println("Nhap id can xoa: ");
        String id = ScannerFac.isValidString();
        System.out.println(employeeController.removeByID(id)?"Thanh cong" : "Thai bai");
    }

    public void showEmployees(){
        this.employeeController.searchAll().forEach(Employee :: showInfo);
    }

    private Experience insertExperience() {
        System.out.println("Nhap ID: ");
        String id = ScannerFac.isValidString();
        System.out.println("Nhap ten: ");
        String name = ScannerFac.isValidFullName();
        System.out.println("Nhap ngay sinh: ");
        LocalDate date = ScannerFac.isValidLocalDate();
        System.out.println("Nhap email: ");
        String email = ScannerFac.isValidEmail();
        System.out.println("Nhap so dien thoai: ");
        String phone = ScannerFac.isValidPhone();
        System.out.println("Nhap so bang cap: ");
        List <Certificate> certificateArrayList = new ArrayList<>();
        int certificates = ScannerFac.isValidInt();

        for (int i = 1; i<certificates; i++){
            System.out.println("Nhap bang cap "+i + ":");
            System.out.println("Nhap ID bang cap: ");
            int cerID = ScannerFac.isValidInt();
            System.out.println("Nhap ten bang cap: ");
            String cerName = ScannerFac.isValidString();
            System.out.println("Nhap ngay cap bang cap: ");
            LocalDate cerDate = ScannerFac.isValidLocalDate();
            System.out.println("Nhap muc do bang cap: ");
            String cerRank = ScannerFac.isValidString();
            Certificate certificate = new Certificate(cerID,cerName,cerDate,cerRank);
            certificateArrayList.add(certificate);
            System.out.println(certificate);
        }

        System.out.println("Nhap nam kinh nghiem: ");
        int exYear = ScannerFac.isValidInt();
        System.out.println("Nhap ki nang tot nhat: ");
        String skills = ScannerFac.isValidString();

        Experience experience = new Experience(id, name, date, email, phone, certificateArrayList, exYear, skills);
        return experience;
    }

    private Fresher insertFresher() {
        System.out.println("Nhap ID: ");
        String id = ScannerFac.isValidString();
        System.out.println("Nhap ten: ");
        String name = ScannerFac.isValidFullName();
        System.out.println("Nhap ngay sinh: ");
        LocalDate date = ScannerFac.isValidLocalDate();
        System.out.println("Nhap email: ");
        String email = ScannerFac.isValidEmail();
        System.out.println("Nhap so dien thoai: ");
        String phone = ScannerFac.isValidPhone();

        System.out.println("Nhap so bang cap: ");
        List <Certificate> certificateArrayList = new ArrayList<>();
        int certificates = ScannerFac.isValidInt();

        for (int i = 1; i<certificates; i++){
            System.out.println("Nhap bang cap "+i + ":");
            System.out.println("Nhap ID bang cap: ");
            int cerID = ScannerFac.isValidInt();
            System.out.println("Nhap ten bang cap: ");
            String cerName = ScannerFac.isValidString();
            System.out.println("Nhap ngay cap bang cap: ");
            LocalDate cerDate = ScannerFac.isValidLocalDate();
            System.out.println("Nhap trinh do bang cap: ");
            String cerRank = ScannerFac.isValidString();
            Certificate certificate = new Certificate(cerID,cerName,cerDate,cerRank);
            certificateArrayList.add(certificate);
        }

        System.out.println("Nhap thoi gian tot nghiep: ");
        LocalDate gradDate = ScannerFac.isValidLocalDate();
        System.out.println("Nhap ten truong dai hoc: ");
        String uniName = ScannerFac.isValidString();
        System.out.println("Nhap trinh do tot nghiep: ");
        String gradRank = ScannerFac.isValidString();

        Fresher fresher = new Fresher(id, name, date, email, phone, certificateArrayList, gradDate, uniName, gradRank);
        return fresher;
    }

    private Intern insertIntern() {
        System.out.println("Nhap ID: ");
        String id = ScannerFac.isValidString();
        System.out.println("Nhap ten: ");
        String name = ScannerFac.isValidFullName();
        System.out.println("Nhap ngay sinh: ");
        LocalDate date = ScannerFac.isValidLocalDate();
        System.out.println("Nhap email: ");
        String email = ScannerFac.isValidEmail();
        System.out.println("Nhap so dien thoai: ");
        String phone = ScannerFac.isValidPhone();
        System.out.println("Nhap so bang cap: ");
        List <Certificate> certificateArrayList = new ArrayList<>();
        int certificates = ScannerFac.isValidInt();

        for (int i = 1; i<certificates; i++){
            System.out.println("Nhap bang cap "+i + ":");
            System.out.println("Nhap ID bang cap: ");
            int cerID = ScannerFac.isValidInt();
            System.out.println("Nhap ten bang cap: ");
            String cerName = ScannerFac.isValidString();
            System.out.println("Nhap ngay cap bang cap: ");
            LocalDate cerDate = ScannerFac.isValidLocalDate();
            System.out.println("Nhap trinh do bang cap: ");
            String cerRank = ScannerFac.isValidString();
            Certificate certificate = new Certificate(cerID,cerName,cerDate,cerRank);
            certificateArrayList.add(certificate);
            System.out.println(certificate);
        }

        System.out.println("Nhap ten truong dai hoc: ");
        String uniName = ScannerFac.isValidString();
        System.out.println("Nhap nganh thuc tap: ");
        String major = ScannerFac.isValidString();
        System.out.println("Nhap ky thuc tap: ");
        int semester = ScannerFac.isValidInt();

        Intern intern = new Intern(id, name, date, email, phone, certificateArrayList, uniName, major, semester);
        return intern;
    }

    private void check(Employee employee) throws BirthDayException, EmailException, FullNameException, PhoneException {
        ExceptionService.bdayCheck(employee.getBday());
        ExceptionService.emailCheck(employee.getEmail());
        ExceptionService.nameCheck(employee.getName());
        ExceptionService.phoneCheck(employee.getPhone());
    }
}
