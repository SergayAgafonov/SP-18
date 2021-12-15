package Bank;

import java.util.Scanner;

public class ACCOUNT extends Thread {
    int balance;
    public ACCOUNT(int balance){
        this.balance = balance;
    }
    //
    public void Snyatie (int SnyatMoney){
        if (balance < SnyatMoney){
            System.out.println("На Вашем счету недостаточно средств.");  // public void Snyatie нужен для выполнения операции "Снятие со счета"
        }
        else {
            balance -= SnyatMoney;
            System.out.println("Деньги успешно сняты с Вашего банковского счета.");
        }
        //
        //
    }
    public void Popolnenie (int ZachsliteMoney){
        balance += ZachsliteMoney;
        System.out.println("Счет пополнен."); // public void Popolnenie нужен для выполнения операции "Пополнение счета"
    }
//
    //
    public void start() { // public void start отвечает за вывод действий
        Scanner in = new Scanner(System.in);
        while (true){
            try {
                Thread.sleep(1500); //Данная строка отвечает за задержку меню
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("_______________________");
            System.out.println("__________DTB__________");
            System.out.println("Баланс: " + balance + " Рублей");
            System.out.println("Чтобы пополнить счет, нажмите 1");
            System.out.println("Чтобы снять наличные со счета, нажмите 2");
            System.out.println("Чтобы выйти из меню, нажмите 3");
            System.out.println("_______________________");
            System.out.println("__________DTB__________");
            int n = in.nextInt();
            if (n == 1){
                System.out.println("Введите сумму, которую Вы хотите положить на Ваш банковский счет");
                int ZachsliteMoney = in.nextInt();
                Popolnenie(ZachsliteMoney);
            }

            else if (n == 2){
                System.out.println("Введите сумму, которую Вы хотите снять с Вашего банковского счета");
                int SnyatMoney = in.nextInt();
                Snyatie(SnyatMoney);
            }
            else if (n == 3){
                System.out.println("Всего доброго, уважаемый клиент DTB!");
                break;
            }
        }
    }
}
//