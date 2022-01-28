public class lesson9binary {
    public static void binary(String args[]) {
        /*3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
         Входящие параметры: массив и число.
         (считаем что массива который нам передали отсортирован, проверять это не нужно)*/


        int counter, item, array[], first, last;
        Scanner input = new Scanner(System.in);

        array = new int[6];

        System.out.println("Введите масив из 6 чисел");

        for (counter = 0; counter < 6; counter++) {
            array[counter] = input.nextInt();

            System.out.println("Введите элемент для  поиска: ");
            item = input.nextInt();
            first = 0;
            last = 6 - 1;

            binarySearch(array, first, last, item);
        }
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является элементом массива");

        } else {
            System.out.println("Элемент не найден в массиве");
        }
    }

}




