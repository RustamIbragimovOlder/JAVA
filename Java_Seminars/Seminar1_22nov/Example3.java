// Дан массив nums = [3, 2, 2, 3] и число val = 3. 
// Если в массиве есть числа, равные заданному,
// нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

public class Example3 {
    public static void main(String[] args) {
        
        int[] arr = new int[] {3, 2, 2, 3};
        int val = 3;
        int temp = 0;
        int count = 0;

        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i] == val) {
                temp = arr[arr.length - 1];
                arr[arr.length - 1] = val;
                arr[i] = temp;
                count ++;
                }
            }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
