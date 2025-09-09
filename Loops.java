public class Loops {
    static void primeFactorisation(int n){
        for(int i=2; n > 1;i++) {
            if (n % i==0){
                n = n / i;
                System.out.println(n);
            } else {
                //i=i+1;
                System.out.println(i);
            }
        }
    }

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(3);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            //System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
