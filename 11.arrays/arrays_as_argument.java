/**
 * arrays_as_argument
 */
public class arrays_as_argument {

    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        update(marks); //calling update function

        //to print our marks
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
        // it prints
        // 98,99,100

    }
    
}