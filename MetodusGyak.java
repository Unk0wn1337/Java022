package metodusgyak;


public class MetodusGyak {

   
    public static void main(String[] args) {
       elso10SzamOsszege();
      
       
    
    }
  
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg +=i;
        }
        return osszeg;
        
    }

    private static int kiiratas(int a, int b) {
        return a=b;
        
    }
    private static void osszead(int a, int b){
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }                            

}
    
    
    
    
    

