public class CombiPermu {
    
    public static void main(String[] args) {
        /* Formule mathématique de la permutation de k
         * élements parmi n: (n!)/(n-k)!
         * Formule mathématique de la combinaison de k
         * élements parmi n: (n!)/(k!*(n-k)!) */
        
        int n, k;
        n = 10; //valeur à définir
        k = 6; //valeur à définir
        
        int n_factorial, k_factorial, n_minus_k_factorial;
        n_factorial = 1;
        k_factorial = 1;
        n_minus_k_factorial = 1;
        
        //calcul des factoriels
        for (int i = 1; i <= n; i++){
            n_factorial *= i;
        }
        for (int i = 1; i <= k; i++){
            k_factorial *= i;
        }
        for (int i = 1; i <= (n - k); i++){
            n_minus_k_factorial *= i;
        }
        
        //permutation
        System.out.println("Le nombre de permutations de " + k + " élements parmi " + n +
                " est " +  (n_factorial/n_minus_k_factorial));
        
        //combinaison
        System.out.println("Le nombre de combinaisons de " + k + " élements parmi " + n +
                " est " +  (n_factorial/(k_factorial*n_minus_k_factorial)));
    }
}