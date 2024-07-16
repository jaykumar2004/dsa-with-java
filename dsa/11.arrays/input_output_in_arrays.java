import java.util.*;
public class input_output_in_arrays {
    public static void main(String[] args) {
        //input and output

        int marks[]= new int[100];

        Scanner sc = new Scanner(System.in);  
        // int phy;
        // phy=sc.nextInt();
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths
        System.out.println("phy: "+marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("maths: "+marks[2]);

        //to update the marks
        // marks[2]=100;
        // System.out.println("update maths marks: "+marks[2]);     //yeha pe updated marks ki value print hogi

        //suppose maths ke marks sirf 1 he badhey he

        // marks[2]=marks[2]+1;  //we can alos calculate +,/,-,%
        // System.out.println("updated maths marks:"+marks[2]);

        //to find the percentage

        int percentage = (marks[0]+marks[1]+marks[1]) / 3;
        System.out.println("percentage is: " + percentage + "%");

        //to calculate the length of array

        System.out.println("length of array: "+ marks.length);
        }
}
