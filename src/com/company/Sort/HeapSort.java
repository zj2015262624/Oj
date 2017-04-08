package com.company.Sort;

/**
 * Created by zj on 2017/3/27 0027.
 */
public class HeapSort {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length <= 1) {//arr == null必须写在前边 防止空指针 判空
            return;
        }
        buildMaxHeap(arr);//构建最大堆

        for (int i = arr.length - 1; i>= 1; i--) {//将堆顶元素与堆尾元素交换 堆大小减1 沉降法调整最大堆 直到堆里只剩一个元素
            ArrayUtils.exchangeElement(arr, 0, i);
            maxHeap(arr, i, 0);
        }

    }

    public static void buildMaxHeap(int[] arr) {
        if (arr == null || arr.length <= 1) {//arr == null必须写在前边 防止空指针 判空
            return;
        }
        int half = arr.length / 2;
        for (int i = half; i >= 0; i--) {//对非叶子结点进行调整最大堆 从右往左 从下往上 开始调整 直到堆顶元素
            maxHeap(arr, arr.length, i);//从最后的一个非叶子节点向上开始排,避免迭代没有意义的叶子节点
        }
    }

    public static void maxHeap(int[] arr, int heapSize, int index) {
        int left = 2 * index + 1;//某节点的左节点
        int right = 2 * index + 2;//某节点的右节点
        int largest = index;//记录最大的节点索引
        if (left < heapSize && arr[left] > arr[index]) {//左子节点大于根节点 将左节点作为最大节点
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[index]) {//右子节点大于根节点 将右节点作为最大节点
            largest = right;
        }
        if (index != largest) {//如果最大节点不是原来赋予的根节点了 就交换最大节点索引与与根节点索引处的元素
            ArrayUtils.exchangeElement(arr, index, largest);
        }
        maxHeap(arr, arr.length, largest);//交换后可能违背最大堆原则 进行沉降法调整交换索引处的的子堆
    }
}
