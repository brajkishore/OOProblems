public class Ravi {

  public static void main(String[] args) {

    //extractDigits(23);
    //decimal2Binary(19);
    String number="1F5";
    anyBase2Decimal(number,16);
  }

  static void extractDigits(int n){

    while(n>0){
      int singleDigit=n%10;
      System.out.println("single Digit:"+singleDigit);
      n=n/10;
    }

  }

  static void decimal2Binary(int n){

    String s="";
    while(n>0){
      int remainder=n%2;
      int quotient=n/2;
      s=remainder+s;
      System.out.println(n+"/2="+quotient+",r="+remainder);
      n=quotient;
    }
    System.out.println("Binary:"+s);
    anyBase2Decimal(s,2);
  }
  static void anyBase2Decimal(String number,int base){

    int len=number.length();
    int power=len-1;
    int index=0;
    int num=0;
    while(power>=0){
      char x=number.charAt(index);

      int subtract=0;
      if(x>=48 && x<=57)
        subtract=48;
      else if(x>=65 &&x<=90)
        subtract=55;
      else if(x>=97 &&x<=122)
        subtract=87;

      int finalValue=x-subtract;

      num=num+(int)(finalValue*Math.pow(base,power));

      System.out.println(base+"^"+power+"*"+finalValue+"="+num);

      power=power-1;
      index=index+1;
    }
  }

}
