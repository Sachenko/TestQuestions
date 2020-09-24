public class ArraysTest {

    //    static int[] Arrays1 = new int[0];
//    static int[] Arrays2 = new int[0];
    static int[] a1 = new int[Rand.randPlus(15)];
    static int[] a2 = new int[Rand.randPlus(15)];


    public static int[] Arr() {

        for (int a = 0; a < a1.length; a++) {
            a1[a] = Rand.randPlus(1);
        }
        bubbleSort(getArrays1());
        String intArrays1String = java.util.Arrays.toString(a1);
        System.out.println("Arrays1.length = " + a1.length +
                "\n" + intArrays1String +
                "\n" + "===================");

        for (int a = 0; a < a2.length; a++) {
            a2[a] = Rand.randPlus(40);
        }
        bubbleSort(getArrays2());
        String intArrays2String = java.util.Arrays.toString(a2);
        System.out.println("Arrays2.length = " + a2.length +
                "\n" + intArrays2String +
                "\n" + "===================");


        int[] Arrays3 = new int[a1.length + a2.length];
//        String intArrays3String = java.util.Arrays.toString(Arrays3);
//        System.out.println("Create new Arrays3.length = " + Arrays3.length + "\n" + "===================");

        int i1 = 0;
        int j2 = 0;


        if (a1.length == 0) {
            for (int k = 0; k < Arrays3.length; k++) {
                int a = a2[k];
                Arrays3[k] = a;}
                String intArrays3String = java.util.Arrays.toString(Arrays3);
                System.out.println(intArrays3String);
             return Arrays3;
        }
        if (a2.length == 0) {
            for (int k = 0; k < Arrays3.length; k++) {
                int u = a1[k];
                Arrays3[k] = u;}
                String intArrays3String = java.util.Arrays.toString(Arrays3);
                System.out.println(intArrays3String);
             return Arrays3;
        }

            for (int k = 0; k < Arrays3.length; k++) {
                if (i1 > a1.length - 1) {
                    int a = a2[j2];
                    Arrays3[k] = a;
                    System.out.println("#1");
                    j2++;
                } else if (j2 > a2.length - 1) {
                    int a = a1[i1];
                    Arrays3[k] = a;
                    System.out.println("#2");
                    i1++;
                } else if (a1[i1] < a2[j2]) {
                    int a = a1[i1];
                    Arrays3[k] = a;
                    System.out.println("#3");
                    i1++;
                } else {
                    int b = a2[j2];
                    Arrays3[k] = b;
                    System.out.println("#4");
                    j2++;
                }

            }
            String intArrays3String = java.util.Arrays.toString(Arrays3);
            System.out.println(intArrays3String);

        return Arrays3;
    }


    static int[] getArrays1() {
        return a1;
    }

    static int[] getArrays2() {
        return a2;
    }

    static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
