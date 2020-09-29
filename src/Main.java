import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String date = new SimpleDateFormat("ddMMyyyy  Hms").format(new Date());     //вывод веремени/даты
        System.out.println(date);

        System.out.println("Кофе-машина");

        //TODO: read from console
        Scanner sc = new Scanner(System.in);                                                 //сканер
        System.out.println("Введите число:");

        int moneyAmount = sc.nextInt();

        System.out.println(moneyAmount);

        int[] drinkPrices = {150, 80, 20};
        String[] drinkNames = {"капучино", "американо", "воду"};

        CoffeeMachine coffeeMachine =
                new CoffeeMachine(drinkPrices, drinkNames);
        boolean can = coffeeMachine.checkPrices(moneyAmount);
        if(can == false) {
            System.out.println("Недостаточно средств :( Arbiten))");
        }


        //TODO: print current date and time: 20200924_144805
        //SimpleDateFormat

        //TODO: create class JavaSoundRecorder and change it to record
        // 30-second audio. Screenshot all codes and results and send
        // to Telegram-chat with hash-tag #уменяполучилось
        // https://www.codejava.net/coding/capture-and-record-sound-into-wav-file-with-java-sound-api
    }
}