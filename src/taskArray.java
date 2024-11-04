import java.util.Random;
public class taskArray {
    private int size;
    private int [] FibbonachiNumbersArray;

    public taskArray(int size){
        this.size=size;
        FibbonachiNumbersArray = new int[size];
    }
    private Random random = new Random();
    public void printNumbers(int choice){

        if (choice==1){
        System.out.println(size + " первых чисел Фиббоначи: ");
        for (int i = 0; i < size; i++) {
            if (i < 2) {
                FibbonachiNumbersArray[i] = 1;
            } else FibbonachiNumbersArray[i] = FibbonachiNumbersArray[i - 1] + FibbonachiNumbersArray[i - 2];
            System.out.println(FibbonachiNumbersArray[i]);
        }
        }else if (choice == 2){
            System.out.println("Исходный массив: ");
            for (int i=0;i<size;i++){
                FibbonachiNumbersArray[i]=random.nextInt(101);
                System.out.println(FibbonachiNumbersArray[i]);
            }
        }else System.out.println("Неверный выбор ");
    }
    public void printFirstNumbers(int numberFirstElements){
        System.out.println("Первые " + numberFirstElements + " чисел массива: ");
        for (int i = 0; i < numberFirstElements; i++)
        {
            if (FibbonachiNumbersArray[i] % 2 == 0) {
                System.out.println(FibbonachiNumbersArray[i] + "-*");
            } else System.out.println(FibbonachiNumbersArray[i]);
        }
    }
    public float printMiddle(){
        float sumNumbers = 0;
        for (int i = 0; i < size; i++) {
            sumNumbers = sumNumbers + FibbonachiNumbersArray[i];
        }
        System.out.print("Среднее значение одномерного массива: ");
        return(sumNumbers/size);
    }
}
