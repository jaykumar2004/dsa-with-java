/**
 * LinearSearch
 */
public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;  // This shows that the key is not found
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 20;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index " + index);
        }
    }
}

//question: make an array of string type
//including menu items
//pass the string key
//and then check konsi kiskey equal he ya nhi
