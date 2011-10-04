import java.util.Scanner;
class PGDC {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.println("Calcul du plus grand  diviseur commun de deux nombres entiers positifs.");

        // Entrée des données
        System.out.print("Entrez un nombre positif :  ");
        int nb1 = scanner.nextInt();
        System.out.print("Entrez un nombre positif :  ");
        int nb2 = scanner.nextInt();
        
        /* 
           A chaque passage de la boucle while, on modifie le plus grand
           de a et b en déduisant le nombre plus petit, comme indiqué par
           la formule d'Euclide. La boucle se terminera quand a et b sont
           égaux (au pire des cas quand ils valent 1). A ce moment-là, on
           retourne la valeur de a (on aurait aussi pu retourner b). 
        */
        
        int a = nb1;
        int b = nb2;
        
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        
        System.out.println("Le plus grand diviseur commun de " + nb1 + " et " + nb2 + " est " + a);
    }
}