import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year, leap;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        leap = year % 4;
        switch (leap) {
            case 0 -> {
                if(year % 100 != 0){
                    System.out.println(year + " Bir Artık Yıldır!");
                }else if (year % 400 == 0){
                    System.out.println(year + " Bir Artık Yıldır!");
                }else if (year % 100 != 0){
                    System.out.println(year + " Bir Artık Yıldır!");
                }else{
                    System.out.println(year + " Bir Artık Yıl Değildir!");
                }
            }default -> System.out.println(year + " Bir Artık Yıl Değildir!");
        }
    }
}


