
public class Main {
    public static void main(String[] args) {
        int sizeArray = 10;
        //пункт а
        int[] FibbonachiNumbersArray = new int[sizeArray];
        System.out.println(sizeArray + " первых чисел Фиббоначи: ");
        for (int i = 0; i < sizeArray; i++) {
            if (i < 2) {
                FibbonachiNumbersArray[i] = 1;
            } else FibbonachiNumbersArray[i] = FibbonachiNumbersArray[i - 1] + FibbonachiNumbersArray[i - 2];
            System.out.println(FibbonachiNumbersArray[i]);
        }
        //пункт б
        int numberFirstElements = 10;
        System.out.println("Первые " + numberFirstElements + " чисел массива: ");
        for (int i = 0; i < numberFirstElements; i++)
        {
            if (FibbonachiNumbersArray[i] % 2 == 0) {
                System.out.println(FibbonachiNumbersArray[i] + "-*");
            } else System.out.println(FibbonachiNumbersArray[i]);
        }
        //пункт с
        float sumNumbers = 0;
        for (int i = 0; i < sizeArray; i++) {
            sumNumbers = sumNumbers + FibbonachiNumbersArray[i];
        }
        System.out.print("Среднее значение одномерного массива: ");
        sumNumbers = sumNumbers / sizeArray;
        System.out.println(sumNumbers);
        //Пункт д.
        numberWord number = new numberWord(1212.72);
        number.writeNumber();
    }
}