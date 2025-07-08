public class Caluculator {
   public static void main(String []args) {
       int a=6,b=0;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        try{
            if (b==0) 
            {
                throw new ArithmeticException("0 cant be a divisor");

                
            }
        }catch(ArithmeticException e){
                System.out.println(e.getMessage());
        }
            
    }

}


    


