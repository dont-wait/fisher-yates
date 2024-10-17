public class Main {
    public static void main(String[] args) {
        char deck [] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        shuffle(deck);
        for(char i : deck)
            System.out.print(i + " ");
    }

    public static void shuffle(char[] arr) {
        for(int i = arr.length - 1; i > 0; i--) {
            int randomNum = (int)Math.floor(Math.random() * (i + 1));
            swap(arr, i, randomNum);
        }
    }
    static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}