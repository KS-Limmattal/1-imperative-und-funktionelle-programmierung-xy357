import java.util.Arrays;

public class Arrayz {
    static double[] sort(double[] b) {
        int i= b.length;
        //double[] b;
        //b = new double [i];
        for (int z=0; z<=i-1; z++) {
            for (int n=1; n<i; n++) {
            //b [n]=a [n];
            if (b [n]< b[n-1]) {
                double c=b[n];
                b[n]=b[n-1];
                b[n-1]=c;
            } else {
                continue;
            }
            }
        }
        return b;
        
    }
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        System.out.println(Arrays.toString(sort(new double[] {1,3,2})));
        System.out.println(Arrays.toString(sort(new double[] {1.23, 5.34, -3.2, -5.67, 2.34})));
        System.out.println(Arrays.toString(sort(new double[] {})));
        System.out.println(Arrays.toString(sort(new double[] {1})));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        //System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        //System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}
