public class MyClass {
    public static void main(String args[]) {
     int[] kaynak = new int [5];
     kaynak [0]=1;
     kaynak [1]=12;
     kaynak [2]=13;
     kaynak [3]=179;
     kaynak [4]=19876;
     
     for(int no : kaynak){
      System.out.println(no);   
     }
       int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {13, 24, 35, 46, 57},
                {10, 23, 35, 48, 58}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
    }
}
