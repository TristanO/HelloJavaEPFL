import java.util.Scanner;
class Bilan {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]) {
        // Lecture du nombre de mois
        System.out.print("Donnez le nombre de mois: ");
        int months = scanner.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        int total = 0;
        
        // Lecture des montants, accumulation et valeurs extrêmes
        for (int i = 0; i < months; i++) {
            System.out.print(" Donnez le montant du mois " + (i + 1)  + " (Frs): ");
            int montant = scanner.nextInt();
            total = total + montant;
            
            if (montant > max) {
                max = montant;
            }
            
            if(montant < min) {
                min = montant;
            }           
        }
        
        System.out.println("La somme mensuelle moyenne reçue est: " + (total / months));
        System.out.println("Le montant mensuel minimal reçu est: "+ min);
        System.out.println("Le montant mensuel maximal reçu est: "+ max);
    }
}