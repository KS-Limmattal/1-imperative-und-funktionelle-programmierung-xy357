public class Loops {
    static void primeFactorisation(int n){
        int i=2;
        if (n%i==0){
            n=n/i;
            System.out.println(n);
        } else {
            System.out.println(i);
        }
    }

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    static double pi(int d){
        double p=0;
        double z=0;
        for (int k=0; k<=2451;){
            double a=Math.pow(-1,k);
            double b=(2*k)+1;
            double c=a/b;
            p=4*c;
            z=z+p;
            k=k+1;
        
        }
        return (z);
    }
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(6);
        // TODO: Schreibe mehr Testcode
        System.out.println();
        
        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        System.out.println(pi(0));
        for (int n = 0; n < 12; n++){
            //System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
