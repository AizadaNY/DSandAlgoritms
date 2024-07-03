package sort;

public class HeightCheck {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] sorted_array=new int[n];

        for(int i=0; i < n; i++){
            sorted_array[i]=heights[i];
        }

        while(true){
            boolean swapped=false;
            for(int i=0; i<n-1; i++){
                if(sorted_array[i]>sorted_array[i+1]){
                    swap(sorted_array,i,i+1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

        int count=0;
        for(int i=0; i < n; i++){
            if(heights[i]!=sorted_array[i]){
                count++;
            }
        }

        return count;
    }
    private void swap(int[] a, int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
