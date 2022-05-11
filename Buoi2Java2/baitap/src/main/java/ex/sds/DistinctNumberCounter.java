package ex.sds;

public class DistinctNumberCounter {
    int[] array;

    public DistinctNumberCounter() {
    }

    public DistinctNumberCounter(int[] array) {
        this.array = array;
    }

    // public DistinctNumberCounter(String line) {
    //     array = line.split(",");
    // }
    
    public void readArray(){
        for(int i = 0; i < array.length ; i++ ) {
            int temp = array[i];
            System.out.print(temp+" ");
        }
        System.out.println();
    }

    public int countDistinct(){
        int i,j;
        int dem =1;
        int temp =1;

        for(i=1;i<array.length;i++){
            for(j=0;j<i;j++){
                if(array[j]==array[i]){
                    temp =0; break;
                } else temp =1;
            }
            if(temp==1) dem++;
        }
        return dem;
    }
}
