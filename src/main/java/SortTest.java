import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class SortTest implements Comparator, Cloneable{
    @Override
    public Object clone()
    {
        Object tmp = null;
        try {
             tmp = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tmp;
    }
    public static void gbSort(int[] a, int low, int high)
    {
        if(low>=high)
            return;
        gbSort(a,low,(low+high)/2);
        gbSort(a,(low+high)/2+1,high);
        merge(a,low,high);

    }

    public static void merge(int[] a,int low, int high)
    {
        int i1 = low, tmp = (low+high)/2;
        int i2 = tmp+1, index = 0;
        int[] buffer = new int[high-low+1];
        while(i1<=tmp&&i2<=high)
        {
            if(a[i1]>=a[i2])
            {
                buffer[index] = a[i2];
                i2++;
                index++;
            }
            else
            {
                buffer[index] = a[i1];
                i1++;
                index++;
            }
        }

        while(i1<=tmp)
        {
            buffer[index] = a[i1];
            index++;
            i1++;
        }
        while(i2<=high)
        {
            buffer[index] = a[i2];
            i2++;
            index++;
        }

        // 把新数组中的数覆盖nums数组
        for(i1=0;i1<buffer.length;i1++){
            a[i1+low] = buffer[i1];
        }



    }


    public static void sort(int[] a, int low, int high)
    {
        if(low>high)
        {
            return;
        }
        // 是low 不是low+1  应对只有两个元素的情况
        int i = low;
        int j = high;
        while(true)
        {
            //顺序很重要，最后一个定位的，要比基准点小，这样正好做替换
            while(j>i&a[j]>a[low])
            {
                j--;
            }
            // 要找大的，所以条件是<=
            while (j<i&a[i]<=a[low])
            {
                i++;
            }
            if (i<j)
            {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }else
            {
                break;
            }
        }
        int tmp = a[j];
        a[j] = a[low];
        a[low] = tmp;
        sort(a,low,j-1);
        sort(a,j+1,high);

    }
    public static void main(String[] args)
    {
        int[] a = new int[]{1,23,2,4,233};
        gbSort(a, 0, 4);
        for(int i1:a)
        {
            System.out.println(i1);
        }
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}
