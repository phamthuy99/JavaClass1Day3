public class bai_143 {
    public static int soChan(int[] arr){
        for (int i = 1; i < arr.length ; i++){
            if (arr[i] % 2 == 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,19};
        System.out.println("Số chẵn đầu tiên : " + soChan(arr));
    }
}
