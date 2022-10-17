import java.util.Scanner;
public class Main {

    public Main(){ Scan = new Scanner(System.in); }
    @Override
    protected void finalize(){ Scan.close(); }
    Scanner Scan;
    int         ex;
    private double t;
    private final double PI = 3.14;
    private final double TA = 1.13;
    private final double CO = 1.2;
    public boolean PromptI(String str){
        System.out.print(str);
        if (Scan.hasNextInt()) {
            t = Scan.nextInt();
            return true;
        }
        System.out.println("Error format ex : 1234");
        Scan.nextLine();
        return false;
    }
    public boolean PromptD(String str){
        System.out.print(str);
        if (Scan.hasNextDouble()) {
            t = Scan.nextDouble();
            return true;
        }
        System.out.println("Error format ex : 1234.5678");
        Scan.nextLine();
        return false;
    }
    public double Multi(double a, double b){ return a * b; }
    public double Taxe(){ return Multi(t, TA); }
    public double CircleS() { return (Multi(PI, Multi(t, t))); }
    public double CircleP() { return (Multi(2, Multi(PI, t))); }
    public double Perimetre(double a, double b){ return Multi(2, (a + b)); }
    public double Conv(){ return Multi(t, CO); }

    public static void main(String[] args) {
        Main Fx = new Main();
        Main Fxt = new Main();
        while (true) {
            Fx.ex = -1;
            System.out.printf("Format ex : 1, 2, ...,6 ou 0 => EXIT\nEnter numero exercice : ");
            if (Fx.Scan.hasNextInt())
                Fx.ex = Fx.Scan.nextInt();
            if (Fx.ex == 1 && Fx.PromptD("Saisir prix HT : ")) {
                System.out.println("Prix TTC = " + String.format("%.4f", Fx.Taxe()));
            }
            else if (Fx.ex == 2) {
                double temp;
                if (Fx.PromptI("Saisir x : ") && Fxt.PromptI("Saisir y : ")){
                    System.out.println("Valeur avant permutation");
                    System.out.println(" x est = " + (int) Fx.t + " et il est enregiste a l'adresse " + System.identityHashCode(Fx.t));
                    System.out.println(" Y est = " + (int) Fxt.t + " et il est enregiste a l'adresse " + System.identityHashCode(Fxt.t));
                    temp = Fx.t; Fx.t = Fxt.t; Fxt.t = temp;
                    System.out.println("Valeur apres permutation");
                    System.out.println(" x est = " + (int) Fx.t + " et il est enregiste a l'adresse ");// + VM.current().addressOf(Fx.t));
                    System.out.println(" Y est = " + (int) Fxt.t + " et il est enregiste a l'adresse " + System.identityHashCode(Fxt.t));
                }
            }
            else if (Fx.ex == 3) {
                if (Fx.PromptD("Saisir rayon : ")) {
                    System.out.println(" Surface = " + String.format("%.1f", Fx.CircleS()));
                    System.out.println(" Perimetre = " + Fx.CircleP());
                }
            }
            else if (Fx.ex == 4) {
                if (Fx.PromptD("Saisir la longueur : ") && Fxt.PromptD("Saisir la largeur : ")) {
                    System.out.println("Surface = " + String.format("%.1f", Fx.Multi(Fx.t, Fxt.t)));
                    System.out.println("Perimetre = " + String.format("%.1f", Fx.Perimetre(Fx.t, Fxt.t)));
                }
            }
            else if (Fx.ex == 5) {
                if (Fx.PromptD("Saisir du montant en $US : "))
                    System.out.println("Montant CAD = " + String.format("%.1f", Fx.Conv()) + "\nMontant US = " + Fx.t);
                }
            else if (Fx.ex == 6) {
                int x, y, somme, quotient, modulo, produit;
                System.out.println("Attention semsible au crash pour le respet de l'exercice");
                System.out.print("Saisir x : ");
                x = Fx.Scan.nextInt();
                System.out.print("Saisir y : ");
                y = Fx.Scan.nextInt();
                System.out.println("somme = " + (somme = x + y));
                System.out.println("produit = " + (produit = x * y));
                System.out.println("modulo = " + (modulo = x % y));
                System.out.println("quotient = " + (quotient = x / y));
            }
            else if (Fx.ex == 0)
                break;
            Fx.Scan.nextLine();
            Fx.t = 0;
            Fxt.t = 0;
        }
        Fx.finalize();
        Fxt.finalize();
    }
}
