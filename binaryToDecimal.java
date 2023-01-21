public class binaryToDecimal {
    public static void main(String args[]){
      Test.binToDec(1111);
    }
}
    class Test{

    public static void binToDec(int binNum){
        int temp=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            if(pow==0){
                decNum=decNum+lastDigit*1;
            }
            decNum=decNum+(lastDigit*2*pow);

            pow++;
            binNum=binNum/10;
        
        }

       /*  while(binNum>0){
            int lastDigit=binNum%10;
           
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow);

            pow++;
            binNum=binNum/10;
        
        }
        */

      
        System.out.println("decimal of "+ temp+" = "+ decNum);
    }
}
