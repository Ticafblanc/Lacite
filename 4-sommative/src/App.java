public class App {
    public static void main(String[] args) throws Exception {
        int x=10, y=9 ;
        var res = ! ((x != y++)&&(x==y++)||(x<++y));  
        System.out.println("x="+x+"y="+y+"res="+res);
    
    }
}
