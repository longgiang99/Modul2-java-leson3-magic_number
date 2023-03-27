import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     int[][] number = {{1,2,3,4,}, {6,7,8,9,} };
     int max =  number[0][0];
        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j <  number[i].length; j++) {
                System.out.print(number[i][j]+ " ");
                if(number[i][j] > max){
                    max = number[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("phan tu lon nhat la: "+ max);
    }
}