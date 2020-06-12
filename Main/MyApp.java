package Main;
import java.util.Scanner;

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
        System.out.print("나이를 입력하세요: " );
        System.out.print("대여요금을 입력하세요: ");
        System.out.print("대여 시작일로부터 경과된 시간을 입력하세요: ");
        int age = sc.nextInt();
        int fee = sc.nextInt();
        int period = sc.nextInt();
    }
}
