public class Test01 {
    public static void main(String[] args) {
        System.out.println("\n\nEven number from 10 to 20");
        for (int x = 10; x <= 20; x++) {
            if (x % 2 == 0)
                System.out.print(x + " ");
        }
        System.out.println("\n\n Print odd number from 0 to 100");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.print(i + " ");

        }
        System.out.println("\n\n Given an array. print odd elements");
        int[] arrays = {2, 6, 8, 9, 5, 15, 68, 64, 98, 101, 112, 103, 9, 1, 7};
        for (int a : arrays) {
            if (a % 2 == 1)
                System.out.print(a + " ");

        }
        
    }
}
