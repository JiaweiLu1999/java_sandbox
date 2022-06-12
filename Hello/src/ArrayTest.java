public class ArrayTest {
    public static void main(String[] args) {
        MyTools myTools = new MyTools();
        int[] arr = {10, 9, 3, -1, 0, 2, -5};
        myTools.bubble(arr);
        System.out.println("== arr after sort ==");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class MyTools {
    public void bubble (int[] arr) {
        // Bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
