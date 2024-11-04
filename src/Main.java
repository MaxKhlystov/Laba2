/*модификаторы доступа везде*/

public class Main {

    public static void main(String[] args){
        taskArray FibbonachiNumbersArray = new taskArray(9);
        //пункт а
        System.out.println("Для вывода массива чисел Фиббоначи введите 1. Для вывода массива случайных чисел введите 2: ");
        FibbonachiNumbersArray.printNumbers(2);
        //пункт б
        FibbonachiNumbersArray.printFirstNumbers(6);
        //пункт с
        System.out.println(FibbonachiNumbersArray.printMiddle());
        //Пункт д.
        numberWord number = new numberWord(2914.26);
        number.writeNumber();
    }
}