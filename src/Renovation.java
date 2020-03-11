import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hieght = Integer.parseInt(scan.nextLine());
        int wight = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());
        double totalArea = Math.ceil(wight * hieght * 4 * (100 - percent) / 100);
        String imput = scan.nextLine();
        boolean flag=false;
        while (!imput.equals("Tired!")) {
            totalArea = totalArea - Double.parseDouble(imput);
            if (totalArea < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(totalArea));
                break;
            }
            if (totalArea == 0&&flag) {
                System.out.printf("All walls are painted! Great job, Pesho!");
                break;
            }
            flag=true;
            imput= scan.nextLine();
        }

        if (totalArea > 0) {
            System.out.printf("%.0f quadratic m left.", totalArea);
        }
    }
}
