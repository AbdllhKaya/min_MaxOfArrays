public class MinMaxOfArrays {
    public static void main(String[] args) {
        int[] rock = {0, 1, 2, 3, -5, 100, 1000, -15};
        int min = rock[0];
        int max = rock[0];

        for(int i: rock){
            if(i < min ){
                min = i;
            }
            if( i >max ){
                max=i;
            }
        }
    System.out.println("Min = " + min);
    System.out.print("Max = " + max);
    }

}