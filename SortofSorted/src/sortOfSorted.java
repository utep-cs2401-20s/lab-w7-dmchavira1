public class sortOfSorted {
    public sortOfSorted() {
    }
        public void sortOfSorted(int []arr) {
            int start = 0;
            int finish = arr.length - 1;
            int count = 1;
            boolean right = true;
            int temp = 0;

            while (start <= finish) {
                if (count % 3 == 0) {
                    if (right) {
                        right = false;
                    } else {
                        right = true;
                    }
                    count = 1;
                }
                if (right) {
                    temp = arr[finish];
                    int temp2 = findMax(arr, start, finish);
                    arr[finish] = arr[temp2];
                    arr[temp2] = temp;
                    finish--;
                    count++;
                } else {
                    temp = arr[start];
                    int temp3 = findMax(arr, start, finish);
                    arr[start] = arr[temp3];
                    arr[temp3] = temp;
                    start++;
                    count++;
                }
            }
        }
        public int findMax(int[] array, int b , int e){
            int max = b;
            for(int i = (b+1);i<(e+1); i++){
                if(array[max] < array[i]){
                    max = i;
                }
            }
            return max;
                }


            }









