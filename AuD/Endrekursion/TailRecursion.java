public class TailRecursion {
   public static void main(String[] args) {
      System.out.println(pow2(5));
      System.out.println(sumFactors(220));
   }

   public static int pow2(int n){
      int erg=2;
      erg=pow2rek(2, n);
      return erg;
   }

   public static int pow2rek(int pow, int n){
      if(n==0){
         return 1;
      }
      if(n==1){
         return pow;
      }
      else{
         return pow2rek(pow*2, n-1);
      }
   }

   public static int sumFactors(int n){
      int erg;
      erg=Factorsrek(n, 0, 1);
      return erg;
   }

   public static int Factorsrek(int n,int erg, int z){
      if(z>n/2){
         return erg;
      }
      if((n%z)==0 & z<=(n/2)){
         return Factorsrek(n, erg+z, z+1);
      }
      else{
         return Factorsrek(n, erg, z+1);
      }
   }
}
