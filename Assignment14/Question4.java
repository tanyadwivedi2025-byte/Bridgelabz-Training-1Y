package Assignment14;

public class Question4 {
    public void wrapperComparison(){
        Integer a=100;
        int b=100;
        int c=200;
        int d=200;
        System.out.println("Compare a and b : "+(a==b));
        System.out.println("Compare c and d : "+(c==d));
        System.out.println("Compare a and b using .eqyals : "+(a.equals(b)));
    }
    public static void main(String[] args){
        Question4 q4=new Question4();
        q4.wrapperComparison();
    }
}

