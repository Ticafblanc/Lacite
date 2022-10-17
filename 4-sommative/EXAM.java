import java.util.Scanner;

public class EXAM {
    public static void main(String[] args) {
        //------------------part 2-------------
        boolean bool1,bool2;
        //lecture des variables
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer la premiere valeur :");
        bool1=sc.nextBoolean();
        System.out.println("Entrer la deuxieme valeur :");
        bool2=sc.nextBoolean();
        //Comparaison des deux valeurs
        System.out.println(bool1+" == "+bool2+"Resultat: "+(bool1==bool2));
        //------------------part 2-------------
        // lecture des variables
        System.out.println("Entrer la valeur de a :");
        double a =sc.nextDouble();
        System.out.println("Entrer la valeur de b :");
        double b =sc.nextDouble();
        System.out.println("Entrer la valeur de c :");
        double c=sc.nextDouble();
        // la comparaison ---------
        boolean res=  ((int)(a+b) ==(int)c);
        System.out.println( (int)(a+b)+"=="+(int)c+"---->"+res);

        sc.close();
    }
}
