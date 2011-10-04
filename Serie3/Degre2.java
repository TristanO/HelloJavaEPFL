import java.util.Scanner;

class Degre2 {
    private static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
	double a = 0.0;
	double b = 0.0;
	double c = 0.0;
	/* 
	ceci peut aussi etre écrit en une seule ligne : "double a,b,c;"
	*/ 
	
	while (a == 0.0){
		System.out.println("Entrez une valeur non nulle pour a:");
		a = scanner.nextDouble();
		
	}
	System.out.println("Entrez une valeur pour b:");
	b = scanner.nextDouble();
	System.out.println("Entrez une valeur pour c:");
	c = scanner.nextDouble();
	double delta = b*b - (4.0 * a * c);
	if (delta < 0.0) {
		System.out.println("Pas de solution réelles");
	} else if (delta == 0) {
		System.out.println("Il existe une seule solution unique"+ -b/(2.0*a));
	} else {
		System.out.println("Deux solutions :" 
				+ (-b - Math.sqrt(delta)) / (2.0 * a)
				+ " et " + (-b + Math.sqrt(delta)/(2.0 * a)));
	}
    }
}

class Degre3 {
    private static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
	}
}