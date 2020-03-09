package review;


import java.util.Arrays;

public class Prac54 {

    //具体存储元素数组
    private int[] num;
    //当前动态数组中存储的元素个数
    private int size;
    //private int i;

    public Prac5(){
        num = new int[16];
    }

    public Prac5(int length){
        num = new int[length];
    }
    /**
     * 向动态数组中添加data元素，默认向动态数组末尾添加
     * @param data
     */
    public void add(int data){
        //this.expansion();
        expansion();
//            if (size == num.length){
//                //此时动态数组保存的元素个数已经达到内部num长度最大值,需要扩容
//                num = Arrays.copyOf(num, num.length << 1);
//            }
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
        //不能用this.inspection(index);
        if (index < 0 || index >size){
            //只要index>size，则非法，因为数组无法取到数组长度的下标
            //{1，2，3，4，0，0}可以成为{1，2，3，4，data，0}不可以是{1，2，3，4，0，data}
            System.out.println("索引非法");
            return;
        }

        if (index == size){
            //若在有效长度位数尾部插入
            add(data);
        }
        //若在有效位数之外在数组长度之内
//        if(index>size+1 && index < num.length){
//            num [index] = data;
//            size ++;
//        }
        //若在有效位数的中间插入
        else{
            //在中间位置插入{1,2,3,4,0}->{1,5,2,3,4}
            //强index位置以及之后的元素向后移动一位
            //首先判断内部数组还有没有空闲位置
            this.expansion();
//                if (size == num.length){
//                    num = Arrays.copyOf(num ,num.length<<1);
//                }
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
        for (int i = 0; i < size; i++) {
            if (num[i] == data) {
                System.out.println("找到"+data+"元素下标位置是"+i);
                return i;
            }
        }
        System.out.println("本数组无"+data+"元素");
        return -1;
    }
//
    /**
     * 在数组中查找是否有指定元素
     * @param data
     * @return
     */
    public boolean contains(int data){
        for (int i = 0; i < size; i++) {
            if (num[i] == data) {
                System.out.println("找到了"+data+"元素"+true);
                return true;
            }
        }
        System.out.println("本数组无"+data+"元素");
        return false;
    }

    /**
     * 在数组中，删除第一个出现的指定内容
     * @param data
     * @return
     */
    public boolean remove(int data){
        for (int i = 0; i < size; i++) {
            if(num[i] == data){
//                    num[i] = 0;
                System.arraycopy(num, i+1, num, i, size-i-1);
                System.out.println("将第一个出现的"+data+"元素成功删除"+true);
                size--;
                return true;
            }
        }
        System.out.println("将第一个出现的"+data+"元素没有成功删除"+true);
        return false;
    }

    /**
     * 修改指定索引内容
     * @param index 指定元素下标
     * @param data 修改后的内容
     * @return
     */
    public boolean set (int index, int data){
        //for (int i = 0; i < size; i++) {
        if(inspection(index)){
            num[index] = data;
            System.out.println("将"+index+"下标位置的元素成功修改为"+data+true);
            return true;
        }
        //}
        System.out.println("将"+index+"下标位置的元素没有成功修改为"+data+false);
        return false;
    }

    /**
     *返回动态数组长度
     * @return
     */
    public int size(){
        System.out.println("此动态数组的有效长度为："+size);
        return size;
    }


    /**
     * 取得指定位置元素
     * @param index
     * @return
     */
    public int get (int index){
        if(inspection(index)) {
            System.out.println(index+"下标位置的元素为："+num[index]);
            return num[index];
        }
        return -1;
    }

    /**
     * 打印动态数组内容
     */
    public void print(){
        for (int i = 0;i <size; i++) {
            System.out.print(num[i] + "、");
        }
    }

    /**
     * 清空数组中所有元素
     */
    public void clear(){
        //jdk提供的方法，将数组所有元素都变成指定元素val
        Arrays.fill(num,0);
        System.out.println("成功将本数组中的元素全部清空为0");
    }

    /**
     * 内部数组的扩容方法
     * 此方法只在本内内部使用，所以用private封装
     */
    private void expansion(){
        if (size == num.length){
            num = Arrays.copyOf(num ,num.length<<1);
        }
    }
    private boolean inspection(int index){
        if (index <0 || index >=size){
            System.out.println("索引"+index+"位置非法!");
            return false;
        }
        return true;
    }

}

