package UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerFac {
    private static Scanner scanner = new Scanner(System.in);

    public static String isValidEmail() {
        String email = "";
        while (true) {
            email = scanner.nextLine();
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pattern = Pattern.compile(emailRegex);
            if (pattern.matcher(email).find()) {
                break;
            } else {
                System.err.println("Nhap sai, moi nhap lai!!!");
            }
        }
        return email;
    }

    public static LocalDate isValidLocalDate() {
        while (true){
            try {
                System.out.println("Hay nhap theo dinh dang chuan ");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-YYYY");
                String date = scanner.nextLine();
                try {
                    if (simpleDateFormat.parse(date) != null){
                        LocalDate localDate = LocalDate.parse(date);
                        return localDate;
                    }
                } catch (ParseException e){
                    System.err.println("Nhap sai dinh dang, moi nhap lai");
                }
            }catch (RuntimeException e){
                System.err.println("Nhap sai, moi nhap lai");
            }
        }
    }

    public static String isValidFullName(){
        String fullName = "";
        while (true){
            fullName = scanner.nextLine();
            String nameRegex = "^[a-zA-Z\s]{0,50}$";
            Pattern pattern = Pattern.compile(nameRegex);
            if (pattern.matcher(fullName).find()){
                break;
            }
            else {
                System.err.println("Nhap sai, xin moi nhap lai, ho va ten chi chua chu va viet hoa");
            }
        }
        return fullName;
    }

    public static int isValidInt(){
        while (true){
            try {
                int varInt = Integer.parseInt(scanner.nextLine());
                if (varInt >0){
                    return varInt;
                } else {
                    System.err.println("Nhap sai, xin moi nhap lai");
                }
            } catch (NumberFormatException e){
                System.err.println("Nhap sai du lieu, xin moi nhap lai");
            }
        }
    }

    public static String isValidString() {
        while (true){
            String varString = scanner.nextLine();
            if (!varString.isEmpty()){
                return varString;
            } else {
                System.err.println("Nhap sai, xin moi nhap lai");
            }
        }
    }

    public static String isValidPhone(){
        String number = "";
        while (true){
            number = scanner.nextLine();
            String numRegex = "^[0-9]{10,12}$";
            Pattern pattern = Pattern.compile(numRegex);

            if (pattern.matcher(number).find()){
                break;
            }
            else {
                System.err.println("Nhap sai, xin moi nhap lai, so dien thoai chi chua 10 den 12 so");
            }
        }
        return number;
    }
}
