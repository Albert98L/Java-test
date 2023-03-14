public class ArraysLab {
    public static void main(String[] args) {
        System.out.println("Print numbert fron 1 to15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nPrint even numbers from -10 to 20");
        for (int i = -10; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n\nPrint * symbols using given number");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*
        //**
        //***
        //****
        System.out.println("\n\nPrint * symbols using given number in reverse mode");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\nCreate an array with number 1-11");
        int[] array = new int[11];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.println("\n\nCreate an array with even numbers from -10 to 10");
        int[] array2 = new int[11];
//        array2[0] = -10;
//        array2[1] = -8;
//        array2[2] = -6;
//        array2[verjin]=10
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
        }
        for (int i :array2) {
            System.out.print(i + " ");
        }
    }
}
