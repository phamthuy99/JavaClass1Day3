public class bai_146 {
    public static double giaTriAmDauTien(double[] arr)
    {
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] < 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        double[] arr = {1,-3,4,-6,10};
        System.out.println("Giá trị âm đầu tiên: " + giaTriAmDauTien(arr));

    }
}
