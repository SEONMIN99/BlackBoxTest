package Main;
import java.util.Scanner;
import Calculation.RentalDVD;

/**
 * Main Method
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민) 
 * @version (2020.06.12)
 */
public class MyApp 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요: " );
        int age = sc.nextInt();
        System.out.println("대여요금을 입력하세요: ");
        int fee = sc.nextInt();
        System.out.println("대여 시작일로부터 경과된 시간을 입력하세요: ");
        int period = sc.nextInt();
        
        RentalDVD rd = new RentalDVD();
        System.out.println(rd.calcRentalFee(age, fee, period) + "원입니다");
    }
}
