class Vraiment{
    
    public static void main(String args[]) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        System.out.println
        ("L'expression (a && b) ^ !(c && !d) est vraie lorsque:");
        
        // Ces boucles imbriquées génèrent toutes les
        // combinaisons possibles de a, b, c et d
        do {
            do {
                do {
                    do {
                        if ((a && b) ^ !(c && !d)) {
                            System.out.println("a = "+ a + ", b = "+ b
                                               + ", c = "+ c + " et d = " + d);
                        }
                        d = !d;     // inverse d
                    } while (!d);
                    c = !c;         // inverse c
                } while (!c);
                b = ! b;            // inverse b
            } while (!b);
            a = !a;                 // inverse a
        } while (!a);
    }
}