public class Methoden {
    static void hours(int s){
        //System.out.println(s);
        int sec;
        sec = s % 60;
        //System.out.println("sec: " + sec);
        int min;
        int m;
        m = s / 60;
        min = m % 60;
        //System.out.println("min: " + min);
        int h;
        h = m / 60;
    
        //System.out.println("h: " + h);
        //System.out.print("h:min:sec - ");

        System.out.println(h + ":" + ((min < 9) ? "0" + min : min) + ":" + ((sec < 9) ? "0"+ sec :  sec));
        //System.out.println(h + ":" + min + ":" + sec);
    }
    static double distance(int x, int y){
        int c;
        c=x*x+y*y;
        int d;
        d=(int) Math.sqrt(c);
        return d;
    }

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        hours(3);
        hours(59);
        hours(75);
        hours(120);
        hours(3600);
        hours(3661);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        System.out.println(distance(4,3));
        System.out.println(distance(1,1));
        System.out.println(distance(2,2));
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
