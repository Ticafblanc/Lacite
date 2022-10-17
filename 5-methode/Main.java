import java.util.Scanner;
import java.lang.Math;

public class Main {

    public Main(){ t_d = new double[4]; Scan = new Scanner(System.in); }
    @Override
    protected void finalize(){ Scan.close(); }
   
    Scanner Scan;
    private double t_d[];
    private String s;
   
    public double get(int i){ return this.t_d[i]; }
    public void set(double d, int i){ this.t_d[i] = d; }
    public String get(){ return this.s; }
    public void set(String st){ this.s = st ; }

    public boolean Prompt(String str, int i){
        System.out.println(str);
        if (Scan.hasNextDouble()) {
            this.t_d[i] = Scan.nextDouble();
            return true;
        }
        System.out.println("Error format ex : 1234.5678");
        Scan.nextLine();
        return false;
    }
    
    public void Prompt(String str){
        System.out.println(str);
        this.s = Scan.nextLine();
    }

    public static void main(String[] args) {
        Main fx = new Main();
        int         ex;
        
        while (true) {
            ex = -1;
            System.out.printf("format ex : 1, 2, ...,5 ou 0 => EXIT\nEnter numero exercice : ");
            if (fx.Scan.hasNextInt())
                ex = fx.Scan.nextInt();
            fx.Scan.nextLine();
            if (ex == 1){
                System.out.println("Donner les coordonnees du point A");
                fx.Prompt("YA :", 1);
                System.out.println("Donner les coordonnees du point B");
                fx.Prompt("XB :", 2);
                fx.Prompt("YB :", 3);
                System.out.println("Distance = " + Math.sqrt((fx.get(0) - fx.get(2)) * (fx.get(0) - fx.get(2)) + (fx.get(1) - fx.get(3)) * (fx.get(1) - fx.get(3))));
            }
            else if (ex == 2) {
                fx.Prompt("Donner la distance A", 0);
                fx.Prompt("Donner la distance B", 1);
                fx.Prompt("Donner la distance C", 2);
                fx.set((fx.get(0) + fx.get(1) + fx.get(2)) / 2, 3);
                System.out.println("Surface = " + Math.sqrt(fx.get(3) * (fx.get(3) - fx.get(0)) * (fx.get(3) - fx.get(1)) * (fx.get(3) - fx.get(2))));
            }
            else if (ex == 3) {
                fx.Prompt("Donner la chaine : ");
                System.out.println(" longueur : " + fx.get().length());
                System.out.println(" chaine en minuscule : " + fx.get().toLowerCase());
                System.out.println(" premier character : " + fx.get().charAt(0));
                System.out.println(" extraction chaine : " + ((fx.get().indexOf("jou") >= 0)? "jou" : ""));
                System.out.println(" chaine repetition : " + fx.get().repeat(3));
                System.out.println(" chaine avec remplacement : " + fx.get().replace("o", "i"));
                continue;
            }
            else if (ex == 4) {
                fx.Prompt("Saisir le temps : ", 0);
                System.out.println("temps = " + (int)fx.get(0));
                System.out.println("hh = " + (int)(fx.get(0) / 3600));
                System.out.println("mm = " + (int)((fx.get(0) % 3600) / 60));
                System.out.println("mm = " + (int)((fx.get(0) % 3600) % 60));
            }
            else if (ex == 5) { System.out.println("res = 596"); }
            else if (ex == 0)
                break;
            fx.Scan.nextLine();
        }
        fx.finalize();
    }
}
