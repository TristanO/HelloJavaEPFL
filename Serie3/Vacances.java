import java.util.Scanner;
class Vacances {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        
        // Entree des donnees
        System.out.println("Entrez vos frais fixes mensuels:");
        double fixeMensuel = scanner.nextDouble();
        
        System.out.println("Entrez votre salaire mensuel:");
        double salaireMensuel = scanner.nextDouble();
        
        System.out.println("Entrez les frais par enfant:");
        double enfantMensuel = scanner.nextDouble();
        
        System.out.println("Entrez le nombre d'enfants");
        int nbEnfants = scanner.nextInt();
        
        System.out.println("Entrez le montant de vos economies");
        double economie= scanner.nextDouble();
        
        // Calcul de la fortune
        double fortune = (salaireMensuel * 12) + economie -
            (fixeMensuel + (nbEnfants * enfantMensuel)) * 12;
        
        // Calcul des budgets vacances minimal et confort
        double budgetMin = 300.0 * 2 + nbEnfants * 200.0;
        double budgetConfort = 1000.0 * 2 + nbEnfants * 300.0 + 500.0;
        
        // Calcul du seuil
        double seuil = 0.1 * fortune;
        
        // Tests
        if (budgetConfort <= seuil)
        {
            System.out.println("Vive le club Solemio!");
        }
        else
        {
            if (budgetMin <= seuil)
            {
                System.out.println("Le camping du coin est super!");
            }
            else
            {
                if (fortune <=0)
                {
                    System.out.println("Vous ne partirez pas en vacances cette année!");
                }
                else
                {
                    int pourcentage = (int) ((budgetMin * 100) / fortune);
                    System.out.println("Pour partir en vacances, il faudrait prélever " + pourcentage + "%  de votre fortune");
                }
            }
        }
    }
}