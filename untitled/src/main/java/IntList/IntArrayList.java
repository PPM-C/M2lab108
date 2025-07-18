package IntList;

public class IntArrayList implements IntList{
    private int [] data;
    private int size;

    public IntArrayList () {
        data=new int [10];
        size=0;
    }
    @Override
    public void add (int number) {
        if (size == data.length) {
            int newLength=data.length+ data.length/2;
            int[] newArray=new int[newLength];
            for (int i=0;i<data.length;i++) {
                newArray[i]=data[i];
            }
            data= newArray;
        }
        data [size]= number;
        size++;
    }
;
    @Override
    public int get (int id) {
        if (id<0||id>=size) {
            throw new IndexOutOfBoundsException("Index"+ id+ " out of bounds");
        }
        return data [id];
    }
}
