import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("podaj liczbe: ");
    System.out.println("1. liczba do potęgi A do B");
    System.out.println("2. sumy pierwiastków");
    System.out.println("3. max");
        System.out.println("4. dzielenie");
  
    int liczba = scan.nextInt();
      System.out.println("podaj liczbe A ");
      System.out.println("podaj liczbe B ");
    double A = scan.nextInt();
    double B = scan.nextInt();
    switch(liczba) {
      case 1:
        double C = A;
        for (double i=1;i<B;i++) 
        {
          C = C*A;
        }
        System.out.println(C);
        break;

      case 2:
        {
          double z=Math.sqrt(A);
          double x=Math.sqrt(B);
          double c=z+x;
          System.out.println(c);
          break;
        }

      case 3:
        {
           System.out.println("wieksza liczba to ");
          if (A>B)
          {
             System.out.println(A);
            
            
          }else
            System.out.println(B);
          break;
            
        }
      case 4:
        {
             C=A/B;
         if(B==0){
          System.out.println("dzielisz przez 0");
          break;
        }
        }

      
     
    }
  }
}