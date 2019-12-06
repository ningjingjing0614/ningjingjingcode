package revise;


    public class test {
        public static void main(String[] args) {
            Prac5 myarray = new Prac5(3);
            myarray.add(1);
            myarray.add(2);
            myarray.add(3);
            myarray.add(4);
            myarray.add(4,10);
            myarray.add(5,30);
            //myarray.add(5,520);
            myarray.find(6);
            myarray.find(10);
            myarray.remove(2);
            //myarray.remove(11);
            myarray.set(2,9);
            myarray.set(7,9);
            //myarray.get(3);
            //myarray.get(6);
            //myarray.clear();
            myarray.contains(10);
            myarray.contains(11);
            myarray.size();
            myarray.print();
            //System.out.println(myarray.size());
        }
    }

