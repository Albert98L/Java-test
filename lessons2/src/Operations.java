public class Operations {
    public static void main(String[] args) {
        int _x = 9;
        System.out.println(_x);
        int a465 = 98;
        System.out.println(a465);

        String firstName = "Albert";
        System.out.println(firstName);
        String first_name = "Albert";
        System.out.println(first_name);
        String firstNameOfTheBestStudent = "Albert";
        System.out.println(firstNameOfTheBestStudent);

        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(a * b);

        int h = 8, j = 4;
        System.out.println(h / j);
        System.out.println(h % j);

        double r = 5.0, t = 2.0;
        System.out.println(r / t);

        a = 5;
        a = a + 1;
        System.out.println(a);

        a = 5;
        System.out.println(a);
        System.out.println(++a);

        a = 4;
        b = 3;
        c = a++ - --b;// c=4-2=2 , qani vor a++-@ gorcoxutyunic heto kkatari mek gwumarac
        // a=5
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("-------------------");

        boolean aa = a == 5;
        System.out.println(aa);

        System.out.println(a != 5);
        System.out.println(a > 4);
        System.out.println(a <= 5);

        a = 44;
        System.out.println(a % 2 == 0);
        a = 5;
        System.out.println(a >= 2 && a <= 9); // a=5-i hetevabar gtnvum e 2-9 mijakayqum
        boolean mianish = a >= 1 && a <= 9;

        boolean vv = a < 0 || a > 100;
        vv = true;
        System.out.println(!vv);
        System.out.println("--------------------");

        System.out.println(a > 4 && a % 2 == 1 || a < -8);

        System.out.println(5 & 8); // 5y 2akan hamakargov linum e  101 , 8y ` 1000 ,hetevabar 5y 8i het ev arac klini 0

        System.out.println(17 & 24); // 17y 2akanov 10001 e isk 24y 11000 , & anelu depqum kunenanq 10000 ,
        // vor@ tasakan hamakargum klini ayspes (10000)^2= 1*2^4+0*2^3+0*2^2+0*2^1+0*2^0   => 16

        System.out.println(5 | 8); // 0101-5 , 1000-8 , => 1101 , tasakan hamakargi poxenq klini
        // (1101)^2 = 1*2^3+1*2^2+0*2^1+1*2^0= 8+4+0+1=13

        System.out.println(5 ^ 8); // 0101 ev 1000 tveri XOR-@ klini 1101-@ , vor@ tasakan hamakargov klini
        // (1101)^2= 1*2^3+1*2^2+0*2^1+1*2^0= 8+4+0+1=13

        int x = 7;
        x = x + 2; // nuynn e ete anenq  x +=2 qayl@
        System.out.println(x);

        x = 17;
        x = x & 9; // nuynn e ete grenq x &=9
        System.out.println(x);

    }
}
