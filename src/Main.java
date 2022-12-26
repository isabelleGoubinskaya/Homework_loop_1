public class Main {
    public static void main(String[] args) {
        byte a = 1;
        for (a=1; a<=10; a++){
            System.out.println(a);
        }

        byte b = 10;
        for (b=10; b>=1; b--){
        System.out.println(b);
        }

        int c = 0;
        for (c=0; c<=17; c++){
            c = c + 1;
            System.out.println(c);
        }

        int d = 10;
        int i = 0;
        for (i=0; i<=19; i++){
            d = d-1;
            System.out.println(d);
        }

        int e  = 1904;
        for (e =1904; e<= 2096; e = e+4) {
            System.out.println(e + " - год является високосным");
        }

        int f =7;
        for (f=7; f<=98; f=f+7) {
            System.out.print(f);
        }

        int g = 1;
        for (g=1; g<=512;g+=g) {
            System.out.print(g);
        }

        int money = 0;
        int j = 1;
        for (j=1;j<=12;j++) {
            money = money + 29000;
            System.out.println("Месяц - " + i + ". Cумма накоплений равна " + money + " рублей");
        }

        int money2 = 29000;
        int account = 0;
        int k = 0;
        for (k = 1; k <= 12; k++) {
            account = account + (account/100) + money2;
            System.out.println("Месяц - " + i + ". Cумма накоплений равна " + account + " рублей");
        }

    }
}