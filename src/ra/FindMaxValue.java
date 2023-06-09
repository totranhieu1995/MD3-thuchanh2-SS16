package ra;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max<numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\MD3 demo\\MD3-thuchanh2-SS16\\src\\ra\\number.txt";
        String PATH_RESULT = "D:\\MD3 demo\\MD3-thuchanh2-SS16\\src\\ra\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxvalue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxvalue);
    }
}
