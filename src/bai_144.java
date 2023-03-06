public class bai_144 {
    public static boolean ktSoNguyenTo(int n){
        // check so nguyen to khi n >= 2
        if (n <= 1) return false;
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int soNguyenToDauTien(int[] arr){
        for (int i = 0; i <= arr.length; i++) {
            if (ktSoNguyenTo(arr[i])) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,5,7,24};

        System.out.println(soNguyenToDauTien(arr));
    }
}
