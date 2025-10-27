import java.util.Arrays;

public class Arrayz {
    static double[] sort(double[] b) {
        int i= b.length;
        // double[] b;
        // b = new double [i];
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
    
    static boolean isMagicSquare(int[][] a) {
        boolean h=true;
        int i = a.length;
        boolean w=true;
        for (int l=0; l<i; l++ ){
            if (w==true){
                if (i==a[l].length){
                    w=true;
                } else {
                    w=false;
                }
            } else {
                h=false;
                break;
            }
        }
        if (w==true) {
        int Summe=0;
        for (int eintzei=0; eintzei<i; eintzei++) {        //Anzahl Zeilen und Spalten
            Summe = Summe + a[eintzei][0];
        }
        for (int q=0; q<i; q++){
            int Summe2=0;
            for (int eintzei=0; eintzei<i; eintzei++) {
                Summe2 = Summe2 + a[eintzei][q];
            }
            if (Summe != Summe2) {
                h=false;
            }
            if (h==false){
                break;
            }
        }
        for (int q=0; q<i; q++){
            int Summe2=0;
            for (int eintzei=0; eintzei<i; eintzei++) {
                Summe2 = Summe2 + a[q][eintzei];
            }
            if (Summe != Summe2) {
                h=false;
            }
            if (h==false){
                break;
            }
        }
        int Summe2=0;
        for (int eintzei=0; eintzei<i; eintzei++) {
            Summe2 = Summe2 + a[eintzei][eintzei];
        }
        if (Summe != Summe2) {
            h=false;
        }
        Summe2=0;
        for (int eintzei=0; eintzei<i; eintzei++) {
            Summe2 = Summe2 + a[eintzei][i-1-eintzei];
        }
        if (Summe != Summe2) {
            h=false;
        }
    }else{
        h=false;
    }
        return h;
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
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        int [][] mS2= new int [][] {{1}};
        System.out.println(isMagicSquare(mS2));
        int [][] nmS2 = new int [][] {{1,1}, {2}};
        System.out.println(isMagicSquare(nmS2));
        System.out.println();
    }
}
