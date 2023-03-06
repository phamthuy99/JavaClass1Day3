public class bai_145 {
    public static boolean soHoanThien(int n)
    {
        int sum = 0;
        for (int i = 1 ; i < n; i++){
            if( n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }
        return false;
    }
    public static int soHoanThienDauTien(int arr[])
    {
        for(int i = 0 ; i < arr.length; i++){
            if(soHoanThien(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,6,3,10,496};
        System.out.println(soHoanThienDauTien(arr));
    }
}
