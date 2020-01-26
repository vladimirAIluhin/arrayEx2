import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] arg) {
        int arraySize = getArraySize();
        Integer[] givenArray = getRandomArray(arraySize);
        printArray("Given array", givenArray);
        List<Integer>[] resultArray = separateNumbers(givenArray);
        printArray("Positive numbers:", resultArray[0].toArray(new Integer[0]));
        printArray("Negative numbers:", resultArray[1].toArray(new Integer[0]));
    }

    private static int getArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        return scanner.nextInt();
    }

    private static Integer[] getRandomArray(int arraySize) {
        Integer[] randomArray = new Integer[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }

    private static void printArray(String message, Integer[] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element[" + 1 + "]=" + array[i]);
        }
    }

    private static List<Integer>[] separateNumbers(Integer[] array) {
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer>[] resultArray = new List[2];
        resultArray[0] = positiveNumbers;
        resultArray[1] = negativeNumbers;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeNumbers.add(array[i]);
            }
            else if (array[i] > 0){
                positiveNumbers.add(array[i]);
            }
        }
        return resultArray;
    }
}
