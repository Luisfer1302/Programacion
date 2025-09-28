public class Main {

    public static int factorial (int n){
        if (n==0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static long sumarIterativo(int[] v){
        long suma = 0;
        for (int i = 0; i < v.length; i++){
            suma += v[i];
        }
        return suma;
    }

    public static void main(String[] args) {

        int fN;

        fN = factorial(5);
        System.out.println(fN);
    }


}
