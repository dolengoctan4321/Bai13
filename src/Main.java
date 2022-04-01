import UI.ScannerFac;
import UI.UIController;



public class Main {
    public static void main(String[] args) {
        UIController uiController = new UIController();
        while (true){
            System.out.println("Nhap phim 1 de them nhan vien: ");
            System.out.println("Nhap phim 2 de tim nhan vien theo ID: ");
            System.out.println("Nhap phim 3 de tim nhan vien theo type: ");
            System.out.println("Nhap phim 4 de xoa nhan vien: ");
            System.out.println("Nhap phim 5 de hien thi danh sach nhan vien: ");
            System.out.println("Nhap phim 6 de ket thuc: ");
            Integer choice = ScannerFac.isValidInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhan phim 1 de them nhan vien kinh nghiem");
                    System.out.println("Nhan phim 2 de them nhan vien moi ra truong");
                    System.out.println("Nhan phim 3 de them nhan vien thuc tap");
                    uiController.insertID();
                    break;
                }
                case 2:{
                    uiController.searchID();
                    break;
                }
                case 3:{
                    uiController.searchByTypeEm();
                    break;
                }
                case 4:{
                    uiController.remove();
                    break;
                }
                case 5:{
                    uiController.showEmployees();
                    break;
                }
                case 6:
                    return;
                default:
                    System.out.println("Nhap sai, xin moi nhap lai");
            }
        }
    }
}
