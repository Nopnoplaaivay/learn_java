import java.util.Scanner;

public class SoSanhStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap gia sp: ");
        double gia_sp = in.nextDouble();
        System.out.println("Nhap thue: ");
        double thue = in.nextDouble();

        System.out.printf("Gia mua sp la: %.2f\n", gia_sp + gia_sp * thue);

    }
}