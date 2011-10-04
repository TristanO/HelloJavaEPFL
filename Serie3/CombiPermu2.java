public class CombiPermu2 {
    
    public static void main(String[] args) {
        
        int n, k;
        n = 10; //valeur à définir
        k = 6; //valeur à définir
        
        int n_factorial, k_factorial, n_minus_k_factorial;
        n_factorial = 1;
        k_factorial = 1;
        n_minus_k_factorial = 1;
        
        //calcul amélioré des factoriels
        if (k < (n - k)) {
            for (int i = 1; i <= k; i++){
                k_factorial *= i;
            }
            n_minus_k_factorial = k_factorial;
            
            for (int i = k; i <= (n - k); i++){
                n_minus_k_factorial *= i;
            }
            n_factorial = n_minus_k_factorial;
            for (int i = (n - k); i <= n; i++){
                n_factorial *= i;
            }
        } else {
            for (int i = 1; i <= (n - k); i++){
                n_minus_k_factorial *= i;
            }
            k_factorial = n_minus_k_factorial;
            
            for (int i = (n - k); i <= k; i++){
                k_factorial *= i;
            }
            n_factorial = k_factorial;
            
            for (int i = k; i <= n; i++){
                n_factorial *= i;
            }
        }
    
        //permutation
        System.out.println("Le nombre de permutations de " + k + " élements parmi " + n +
                " est " +  (n_factorial/n_minus_k_factorial));
        
        //combinaison
        System.out.println("Le nombre de combinaisons de " + k + " élements parmi " + n +
                " est  " +  (n_factorial/(k_factorial*n_minus_k_factorial)));
    }
}