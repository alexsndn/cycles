public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");
        for(int a = 1; a < 11; a++){
            System.out.println(a);
        }
        //задание 2.1
        System.out.println("Задание 2.1");
        for(int b = 10;b > 0; b--){
            System.out.println(b);
        }
        //Задание 3.1
        System.out.println("задание 3.1");
        for(int c = 0; c < 18; c++){
            if(c%2==0){
                System.out.println(c);
            }
        }
        //Задание 4.1
        System.out.println("Задание 4.1");
        for (int d = 10; d > -11; d--){
            System.out.println(d);
        }
        //Задание 1.2
        System.out.println("Задание 1.2");
        for(int y = 1904; y<2097; y = y + 4){
            System.out.println(y+" год является високосным");
        }
        //Задание 2.2
        System.out.println("Задание 2.2");
        for(int ts = 7; ts < 99; ts = ts +7){
            System.out.println(ts);
        }
        //Задание 3.2
        System.out.println("задание 3.2");
        for(int e = 1; e < 513; e = e * 2){
            System.out.println(e);
        }
        //Задание 1.3
        System.out.println("Задание 1.3");
        int salary = 29000;
        int total = 0;
        for (int f = 1; f < 13; f++) {
            total = total + salary;
            System.out.println("Месяц " + f + " сумма накоплений равна " + total);
        }
        //Задание 2.3
        System.out.println("задание 2.3");
        int newSalary = 29000;
        int newTotal = 0;
        for (int n = 1; n < 13; n++) {
            newTotal = newTotal + newTotal/100;
            newTotal = newTotal + newSalary;
            System.out.println("Месяц " + n + " сумма накоплений равна " + newTotal);
        }
    }
}