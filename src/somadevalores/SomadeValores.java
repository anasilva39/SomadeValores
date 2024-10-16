
package somadevalores;


public class SomadeValores {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int soma=0;
        int n;
        
        System.out.println(" A soma dos números é:");
        
        for( n = 1; n<=100; n++){
            soma = soma + n;
            
            System.out.println("Número: "+n);
            System.out.println(soma);
        }
            
        
         
    }
    
}
