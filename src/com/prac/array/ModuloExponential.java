package com.prac.array;

public class ModuloExponential {

    public static void main(String[] args) {
        System.out.println(400%125);
        ModuloExponential me = new ModuloExponential();
        int finalresult = me.getModuloValue(9,3,5);
        System.out.println(finalresult);
    }
// num= 9 , power =3, mod =5
    //num =9 , mod = 5, result =4, never findout power was 3.
public int getModuloValue(int num,int power, int mod){
    if(num == 1) return num%mod;

    if(num%2 == 0) return ((getModuloValue((num*num)%mod,power/2, mod))%mod);
    else return ((num*getModuloValue((num*num)%mod,(power-1)/2, mod))%mod);
}
  /*  public int getModuloValueTwopower(int num,int power1,int power2, int mod){
        if(num == 1) return num%mod;

        if(num%2 == 0) return ((getModuloValue((num*num)%mod,(power1+power2)/2,power2, mod))%mod);//*((getModuloValue((num*num)%mod,power1,power2/2, mod))%mod)
        else return ((num*getModuloValue((num*num)%mod,((power1-1)+(power2-1))/2,power2, mod))%mod);//*((num*getModuloValue((num*num)%mod,power1,power2-1/2, mod))%mod)
    }*/

}
