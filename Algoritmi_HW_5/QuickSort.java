public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // Выбираем последний элемент в качестве опорного
        int i = left - 1; // Индекс для элементов, меньших опорного

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                // Меняем элементы местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Помещаем опорный элемент на свое место
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1; // Возвращаем индекс опорного элемента
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Исходный массив:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        quickSort(arr, 0, n - 1);

        System.out.println("\nОтсортированный массив:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}