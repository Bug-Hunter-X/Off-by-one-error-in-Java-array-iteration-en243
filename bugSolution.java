public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // Corrected loop condition: i < arr.length
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        System.out.println(arr[4]);
    }
}