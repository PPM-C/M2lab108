package IntList;

public class IntVector implements IntList {
    private int[] data;
    private int size;

    public IntVector (){
        data=new int[20];
        size=0;
    }
    @Override
    public void add (int number) {
        if (size==data.length){
            //Duplicate
            int [] newArray = new int [data.length*2];
            for (int i=0 ; i<data.length ; i++){
                newArray[i]=data[i];
            }
            data=newArray;
        }
        data[size]=number;
        size++;
    }
    @Override
    public int get (int id) {
        if (id <0 || id >= size){
            throw new IndexOutOfBoundsException("Index"+ id+ " out of bounds");
        }
        return data [id];
    }
}
