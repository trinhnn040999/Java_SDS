package ex.sds;

public class Toan {
    private int count = 0;
    private int sofibonancii;

    public void tang(int count){
        this.count = count+1;
    }
    public void showCount(){
        System.out.println("Gia tri cua bien count la: "+count);
    }
    public int fibonacci(int n){
        if(n<=0) return -1;
        if(n==1) return 0;
        if(n==2) return 1;
        return sofibonancii = fibonacci(n-1)+fibonacci(n-2);
    }
    public void showFibonancii(){
        System.out.println("Gia tri cua so finbonancii la: "+ sofibonancii);
    }
    private static int value[] = new int[1000];
    public int getFinbo(int n){
        if(n<=0) return -1;
        if(n==1) return 0;
        if(n==2) return 1;
        if(n>2){
            int luuValue = value[n];
        }
    }

    }
}