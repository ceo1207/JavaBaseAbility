package crazy;

/**
 * Created by oneBite on 2018/9/18.
 */
public class First {
    public static void main(String[] args)
    {
        // 静态初始化
        int[] array1 = new int[]{1,2,3};
        int[] array2 = {1,2,3};
        // 动态初始化
        int[] array3 = new int[10];

        String[] array = {"12","23"};
        // 编译器会做优化， 效果同上
        String[] array4 = new String[]{"12","23"};
        String[] array5 = new String[3];
        array5[0] = new String("12");
        String s1 = "12";
        String s2 = new String("12");
        System.out.println(s2==s1);
        System.out.println(array[0]==s1);
        System.out.println(array4[0]==s1);
        System.out.println(array5[0]==s1);

        // 在栈中存储的变量  是自带类型的？  如何查找到相应的field 和 method

        //float f1 = 12.2;
        float f1 = 12.2f;
        float f2;
        // wrong   不能使用未初始化的元素 System.out.println(f2);





    }
}


/*
jvm Java HotSpot

java 数组如何实现length的获取

引用类型在栈中保存了什么内容

对象头

http://www.valleytalk.org/wp-content/uploads/2011/05/Java_Program_in_Action_20110727.pdf

 */