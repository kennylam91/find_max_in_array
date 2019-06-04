import java.util.Scanner;

public class find_max_in_array {
    public static void main(String[] args) {
        System.out.println("How many numbers do u want to input? ");
        Scanner input = new Scanner(System.in);
        int sizeArray = input.nextInt();
        double[] myArray = new double[sizeArray];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Input each element: ");
            myArray[i] = input.nextDouble();
        }
        for (int j=0;j<myArray.length;j++) {
            System.out.println(myArray[j]);
        }
        double maxArray = findMax(myArray);
        System.out.println("max= "+maxArray);



    }
    static double findMax(double[] array){
        double max = array[0];
        for (double element : array) {
            if (max < element) max = element;
        }
        return max;
    }
}
