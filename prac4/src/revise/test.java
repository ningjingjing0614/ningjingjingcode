package revise;

public class test {
    public static void main(String[] args) {
            Prac4 myarray = new Prac4(3);
            myarray.add(1);
            myarray.add(2);
            myarray.add(3);
            myarray.add(4);
            myarray.add(5,10);
            myarray.add(4,30);
            //myarray.add(5,520);
            myarray.find(6);
            myarray.print();
            //System.out.println(myarray.size());
    }
}
