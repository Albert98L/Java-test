public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;

        System.out.println(a[0] + a[4]);
        System.out.println(a.length); // cuyc e talis zangvaci erkautyun@
        System.out.println(a[0] + a[a.length - 1]); // arajin arjeqin gumarum enq verchin arjeq@
        System.out.println("-----------");

        int[] array = {1, 7, 8, 2, 6, 4, 45};
        // int[] array = new int[7]
        // int[0] = 1
        // int[1] = 7
        // ....
        // int[6]= 45
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);

        // int[]  x
        // x=  new int[]{1,6,9,89 ,5};

        int x = -54;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non positive");
        }

        int v;
//        if (x > 0)
//            v = 1;
//        else
//            v = 0;
        v = x > 0 ? 1 : 0;

//        x > 0 ? System.out.println("Positive") : System.out.println("Positive"); sxal greladzev
        System.out.println(x > 0 ? "positive" : "non positive+");

        x = 0;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            if (x < 0) System.out.println("Negative");
            else System.out.println("zero");
        }

        int counter = 1;

        while (counter < 12) {
            System.out.println(counter);
            counter++;
        }
        // kam vor nuynn e ete anenq soutln(counter++ + " ") , whilen irenic nerkayacnum e cikl , nman e IF-in
        // tarberutyamb vor ete if-i depqum gorcoxutyun@ avartvum e noric chi krknum , while-@ anum e da sharunakakan ,
        // minchev paymani avart

        x = 11;
        do {
            System.out.println("barev");
            x++;
        } while (x <= 4); // do-i depqum arajin sout hraman@ katarum e heto nor sksum e hashvi arnel codi pahanjin

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " "); // for-i mej popoxakan haytararekuc da gorcumm e miayn for-i tiruytum

        }
        System.out.println();
        String[] names={"Aram", "Suren","Pogos", "Ara" };
        for (int index = 0; index < names.length ; index++){
            System.out.println(names[index]);
        }
        for(String s: names){
            System.out.println(s); // for each tipy ashxatum e 0-ic minchev verch
        }

        for(int i = names.length -1 ; i>=0; i--){
            System.out.println(names[i]);
        }
    }

}
