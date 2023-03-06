public class bai_147 {
    public static double soDuongCuoiCung(double[] arr){
        for (int i = arr.length - 1; i >=0 ; i--){
            if (arr[i] > 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        double []arr = {-1.2,2.7,-8.9,1.7,2.2};
        System.out.println("Số dương cuối cùng " + soDuongCuoiCung(arr));
    }
}
