package ex.sds;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctNumberCounter {
    private int[] array;
    public DistinctNumberCounter(){}
    public DistinctNumberCounter(int array[]){
        this.array = array;
    }
    public DistinctNumberCounter(String line) {
        parseLine(line);
    }
    public int[] getArray() {
        return array;
    }
    private void parseLine(String line) {
        if (line == null) return;
        if (line.length() == 0) return;
        String[] tokens = line.split(",");
        array = new int[tokens.length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.valueOf(tokens[i]);
        }
    }
    public void readArray() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        parseLine(line);
        scanner.close();
    }
    public int countDistinct() {
        if (array == null || array.length == 0) return 0;
        HashMap<Integer, Boolean> set = new HashMap<Integer,Boolean>();
        for (int num : array) {
            Boolean check = set.get(num);
            if (check == null) {
                set.put(num, true);
            }
        }
        return set.size();
    }
}
