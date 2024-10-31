public class taskWithArray {
    int size_array;
    public taskWithArray(int size_array){
        this.size_array=size_array;
    }
    int [] FibbonachiNumbersArray = new int[size_array];
    void write(){
        System.out.println(size_array + " первых чисел Фиббоначи: ");
        for (int i = 0; i < size_array; i++) {
        if (i < 2) {
            FibbonachiNumbersArray[i] = 1;
        } else FibbonachiNumbersArray[i] = FibbonachiNumbersArray[i - 1] + FibbonachiNumbersArray[i - 2];
        System.out.println(FibbonachiNumbersArray[i]);
        }
    }
}
