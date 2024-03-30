import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int dy, zodyak;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dy = inp.nextInt();
        zodyak = dy % 12;

        switch (zodyak){
            case 0:
                System.out.println("Çin Zodyağı Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Koyun");
                break;
        }

    }
}
