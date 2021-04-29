package Arrays;

/*
java.util.Arrays 是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常见的操作

public static String toString (数组)，将参数数组变成字符串(按照默认格式[元素1，元素2，元素3，..])
public static void sort(数组),按照默认升序从小到大对数组元素进行排序。

备注：
1.如果是数值，sort默认按照升序从小到大
2.如果是字符串，sort默认值按照字母升序
3.如果是自定义的类型，那么这个自定义的类需要有Comparable和Comparator
 */
import java.util.Arrays;
public class Arrayssss {
    public static void main(String[] args) {
        char[] array1 = {'a','b','c',};
        String str = new String();
        str = Arrays.toString(array1);
        System.out.println(str);
        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);

        System.out.println("=====================");
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]);
        }
        System.out.println();
        System.out.println("======================");
        System.out.println(Arrays.toString(array2));

    }
}
