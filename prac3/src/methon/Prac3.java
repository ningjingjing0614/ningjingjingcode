package methon;

import java.util.Arrays;
//import java.util.Arrays;
//    public class Prac3 {
//        public static void main(String[] args) {
//            int[] num = {2,3,4,5,6};
            //int[] newNum = Arrays.copyOf(num, num.length<<1);
            //int[] newNum = Arrays.copyOf(num, num.length>>1);
            //System.out.println(Arrays.toString(newNum));
            //int[] newNum = new int[3];
            //System.arraycopy(num, 0, newNum, 0,2);
//        //{2,3,4,5,6}->{2,6,3,4,5}
//        int[] newNum = new int[5];
//        System.arraycopy(num,1, newNum,2, 3);
//        newNum[0] = num[0];
//        newNum[1] = 6;
//        System.out.println(Arrays.toString(newNum));
//        System.arraycopy(num, 1, num, 2, 3);
//        num[1] = 6;
//        System.out.println(Arrays.toString(num));
//        //{2,3,4,5,6}->{2,3,4,6,0}
//            System.arraycopy(num, 4, num, 3, 1);
//            num[4] = 0;
//            System.out.println(Arrays.toString(num));
//        }
//    }
public class Prac3{
        public static void main(String[] args) {
            Prac3 myarray = new Prac3(3);
            myarray.add(1);
            myarray.add(2);
            myarray.add(3);
            myarray.add(4);
            myarray.add(4,10);
            //myarray.add(5,520);
            myarray.print();
            System.out.println(myarray.size());
        }

    //具体存储元素数组
    private int[] num;
    //当前动态数组中存储的元素个数
    private int size;

    public Prac3(){
        num = new int[16];
    }

    public Prac3(int length){
        num = new int[length];
    }
    /**
     * 向动态数组中添加data元素，默认向动态数组末尾添加
     * @param data
     */
    public void add(int data){
        if (size == num.length){
            //此时动态数组保存的元素个数已经达到内部num长度最大值,需要扩容
            num = Arrays.copyOf(num, num.length << 1);
        }
        num[size ++] = data;
        //size ++;
    }
    /**
     * 像动态数组index指定位置添加data元素
     * @param index
     * @param data
     */
    public void add(int index, int data){
        //若恰好在尾部插入
        //若恰好在中间位置插入
        if (index < 0 || index >num.length){
            System.out.println("索引非法");
            return;
        }
        //若在有效位数尾部插入
        if (index == size){
            add(data);
        }
        //若在有效位数之外在数组长度之内
        if(index>size && index < num.length){
            num [index] = data;
            size ++;
        }
        //若在有效位数的中间插入
        else{
            //在中间位置插入{1,2,3,4,0}->{1,5,2,3,4}
            //强index位置以及之后的元素向后移动一位
            //首先判断内部数组还有没有空闲位置
            if (size == num.length){
                num = Arrays.copyOf(num ,num.length<<1);
            }
           System.arraycopy(num, index, num, index+1,size-index);
            num[index] = data;
            size ++;
        }
    }

    /**
     *在数组中查找是否有指定data元素，若有返回索引下标，没有返回-1
     * @param data
     * @return
     */
    public int find(int data){
        return -1;
    }

    /**
     * 在数组中查找是否有指定元素
     * @param data
     * @return
     */
    public boolean contains(int data){
        return false;
    }

    /**
     * 在数组中，删除第一个出现的指定内容
     * @param data
     * @return
     */
    public boolean remove(int data){
        return false;
    }

    /**
     * 修改指定索引内容
     * @param index 指定元素下标
     * @param data 修改后的内容
     * @return
     */
    public boolean set (int index, int data){
        return false;
    }

    /**
     *返回动态数组长度
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 打印动态数组内容
     */
    public void print(){
        for (int i = 0;i <=size; i++) {
            System.out.println(num[i] + "、");
        }
    }

    /**
     * 取得指定位置元素
     * @param index
     * @return
     */
    public int get (int index){
        return -1;
    }

    /**
     * 清空数组中所有元素
     */
    public void clear(){

    }
}

