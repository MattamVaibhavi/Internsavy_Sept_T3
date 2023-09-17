import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one from the following options");
        System.out.println("1) USD to € Euros");
        System.out.println("2) € Euros  to USD");
        System.out.println("3) £ Pounds to USD");
        int exchange = sc.nextInt();
        switch (exchange){
            case 1: {
                System.out.println("Enter the number of USD");
                double usd = sc.nextDouble();

                if(usd>=0){
                    System.out.println(usd + "USD is " + usd*0.908 + " € Euros.  ");
                }
                else{
                    System.out.println("please put in positive numbers of USD");
                }
            }
            break;
            case 2:{
                System.out.println("Enter the number of € euros ");
                double euro = sc.nextDouble();

                if (euro>=0){
                    System.out.println(euro + " € Euros  is " + euro*1.101 + " USD. ");
                }
                else{
                    System.out.println("please put in positive numbers of € Euros.");
                }
            }
            break;
            case 3:{
                System.out.println("Enter the number of £ Pound");
                double pounds = sc.nextDouble();

                if (pounds>=0){
                    System.out.println(pounds + " £ Pounds is " + pounds*1.28 + " USD ");
                }
                else{
                    System.out.println("please put in positive numbers of  £ Pounds ");
                }
            }
            break;
        }
        sc.close();
    }

}