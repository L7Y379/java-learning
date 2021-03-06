package Quick_sort;
import java.util.Arrays;

/**
 * 对比不同的快速排序算法
 * 1.三者取中法实现快速排序
 * 2.第一个元素为枢纽的快速排序
 */
public class Quick_sort_contrast {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0,55,68,78,54,88,21,54,18,16,79,24,26,47,68,45,96,33,55,77,13,64,57,85,22,11,66,99,88,44};
        System.out.println("需要排序的数组为：" + Arrays.toString(arr1));
        long startTime1 = System.nanoTime();
        quickSort1(arr1, 0, arr1.length - 1);
        long endTime1= System.nanoTime();
        System.out.println("三者取中法实现快速排序的排序结果:" + Arrays.toString(arr1));
        System.out.println("三者取中法实现快速排序的算法耗时为：" + (endTime1 - startTime1) + "ns");

        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0,55,68,78,54,88,21,54,18,16,79,24,26,47,68,45,96,33,55,77,13,64,57,85,22,11,66,99,88,44};
        System.out.println("需要排序的数组为：" + Arrays.toString(arr2));
        long startTime2 = System.nanoTime();
        quicksort2(arr2, 0, arr2.length - 1);
        long endTime2= System.nanoTime();
        System.out.println("第一个元素为枢纽的排序结果:" + Arrays.toString(arr2));
        System.out.println("第一个元素为枢纽的排序算法耗时为：" + (endTime2 - startTime2) + "ns");
    }

    /**
     * @param arr
     * @param left  左指针
     * @param right 右指针
     *
     * quickSort1为三者取中法快速排序
     */
    public static void quickSort1(int[] arr, int left, int right) {
        if (left < right) {
            //获取枢纽值，并将其放在当前待处理序列末尾
            dealPivot(arr, left, right);
            //枢纽值被放在序列末尾
            int pivot = right - 1;
            //左指针
            int i = left;
            //右指针
            int j = right - 1;
            while (true) {//交换元素位置
                while (arr[++i] < arr[pivot]) {
                }
                while (j > left && arr[--j] > arr[pivot]) {
                }
                if (i < j) {
                    swap(arr, i, j);
                } else {
                    break;
                }
            }
            if (i < right) {//把枢纽放入“中间位置”
                swap(arr, i, right - 1);
            }
            quickSort1(arr, left, i - 1);
            quickSort1(arr, i + 1, right);
        }

    }

    /**
     * @param arr
     * @param left  左指针
     * @param right 右指针
     *
     * quickSort2为取第一个元素为枢纽快速排序
     */
    public static void quicksort2(int[] arr,int left,int right){
        if (right <= left) return;
        int i = left;
        int j = right + 1;
        int key = arr[left];
        while (true)
        {
            /*从左向右找比key大的值*/
            while (arr[++i] < key)
            {
                if (i == right){
                    break;
                }
            }
            /*从右向左找比key小的值*/
            while (arr[--j] > key)
            {
                if (j == left){
                    break;
                }
            }
            if (i >= j) break;
            /*交换i,j对应的值*/
            swap(arr, i, j);
        }
        /*中枢值与j对应值交换*/
        swap(arr, left, j);
        quicksort2(arr, left, j - 1);
        quicksort2(arr, j + 1, right);

    }

    /**
     * 处理枢纽值
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void dealPivot(int[] arr, int left, int right) {//dealPivot方法
        int mid = (left + right) / 2;
        if (arr[left] > arr[mid]) {
            swap(arr, left, mid);
        }
        if (arr[left] > arr[right]) {
            swap(arr, left, right);
        }
        if (arr[right] < arr[mid]) {
            swap(arr, right, mid);
        }
        swap(arr, right - 1, mid);
    }

    /**
     * 交换元素通用处理
     *
     * @param arr
     * @param a
     * @param b
     */
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
