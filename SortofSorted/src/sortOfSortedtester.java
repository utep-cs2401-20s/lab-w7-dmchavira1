import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class sortOfSortedtester {
    @Test
    //this test is to test if the algorithm is working as it should.
    public void SortOfSorted1(){
        sortOfSorted main = new sortOfSorted();
        int [] arrA = {9, 6 ,2 ,0};
        int [] exp ={2,0,6,9};
        main.sortOfSorted(arrA);
        // this is to see if showing correctly
        for(int i =0; i<arrA.length; i++){
        System.out.print(arrA[i]+ " " );
        }


        assertArrayEquals(exp, arrA);
    }
    @Test
    //this test is to test if the algorithm is working as it should
    // i tried it with negatives to see if the code work.
    public void SortOfSorted2(){
        sortOfSorted main = new sortOfSorted();
        int [] arr1 = {9, 6 ,2 ,0 ,8 , -1 , 5};
        int [] exp ={6,5, -1, 0, 2,8,9};
        main.sortOfSorted(arr1);
        // this is to see if showing correctly
        for(int i =0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " " );
        }


        assertArrayEquals(exp, arr1);
    }
    @Test
    //this test is to test if the algorithm is working as it should
    // this test is to test if it work if the length was long.
    public void SortOfSorted3(){
        sortOfSorted main = new sortOfSorted();
        int [] arr1 = {1,2,3,4, 5 , 6, 7, 8,9, 10};
        int [] exp ={ 8,7 ,4 ,3 ,1 ,2 , 5,6 , 9, 10};
        main.sortOfSorted(arr1);
        // this is to see if showing correctly
        for(int i =0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " " );
        }


        assertArrayEquals(exp, arr1);
    }
    @Test
    // this test was to see if the code would still work if all the values were negative.
    public void SortOfSorted4(){
        sortOfSorted main = new sortOfSorted();
        int [] arr1 = {-1,-2,-3,-4,-5,-6};
        int [] exp ={ -3,-4,-6,-5,-2,-1};
        main.sortOfSorted(arr1);
        // this is to see if showing correctly
        for(int i =0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " " );
        }


        assertArrayEquals(exp, arr1);
    }
    @Test
    // this test was to see if the code would work with less variables
    public void SortOfSorted5(){
        sortOfSorted main = new sortOfSorted();
        int [] arr1 = {1,2};
        int [] exp ={ 1,2};
        main.sortOfSorted(arr1);
        // this is to see if showing correctly
        for(int i =0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " " );
        }


        assertArrayEquals(exp, arr1);
    }

}
