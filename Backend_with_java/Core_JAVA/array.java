package Backend_with_java.Core_JAVA;

public class array {
    public static void main(String[] args) {
        int [][]nums = new int[3][4];
        String[] option1 = {"Platform Independent","JVM","JRE","JDK"};
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
        }
        // this is not taking values
        // for(int n[] : nums){
        //     for(int m : n){
        //         m = (int)(Math.random()*100);
        //     }
        // }
        for(int n[] : nums){  //enhanced for loop
            for(int m : n){
                
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
