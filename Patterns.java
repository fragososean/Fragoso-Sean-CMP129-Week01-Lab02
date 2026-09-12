package Labs.Week_1.scr;

public class Patterns {
    public static void main(String[] args) {
        String plus = "";
        String minus = "";
        
        for(int a=0; a<=10; a++){
            for(int p=0; p<a; p++){
                plus = plus+"+";
            }
            plus = plus+"\n";
        }
        for(int b=10; b>0; b--){
            for(int p=0; p<b; p++){
                minus = minus+"+";
            }
            minus = minus+"\n";
        }
        System.out.println("Pattern A: "+plus);
        System.out.println("Pattern B: \n"+minus);
    }
}