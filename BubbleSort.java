public class BubbleSort {
    void swap(int array[])
    {
        int n= array.length;

        for (int i = 0; i<n;i++)
            for( int j = 0; j< n-1 ;j++)
                if(array[j]> array[j+ 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

    }
    public static void main(String[] args) {
        int numbers[]= {8,3,1,4,5,11,7,2,17,13};

        BubbleSort bubble = new BubbleSort();

        bubble.swap(numbers);

        int n = numbers.length;

        for (int i = 0; i < n; ++i)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
    
}
