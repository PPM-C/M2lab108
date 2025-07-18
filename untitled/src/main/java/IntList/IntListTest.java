package IntList;

public class IntListTest {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vector=new IntVector();

        for (int i = 0; i < 25; i++) {
            arrayList.add(i);
            vector.add(i*2);
        }
        System.out.println("Array (index 10):"+arrayList.get(10));
        System.out.println("Vector (index 20):"+vector.get(10));
    }
}
