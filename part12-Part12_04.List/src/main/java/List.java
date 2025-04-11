public class List<Type> {

    private Type[] data;
    private int firstFreeIndex;

    @SuppressWarnings("unchecked")
    public List() {

        this.data = (Type[]) new Object[1];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {

        if (this.firstFreeIndex == this.data.length) {
            this.grow();
        }

        this.data[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow() {

        int newSize = this.data.length + this.data.length / 2;
        Type[] newData = (Type[]) new Object[newSize];

        for (int i = 0; i < this.data.length; i++) {

            newData[i] = this.data[i];
        }

        this.data = newData;

    }

    public boolean contains(Type value) {

        return indexOfValue(value) != -1;
    }

    public void remove(Type value) {

        int index = indexOfValue(value);

        if (index != -1) {

            moveToTheLeft(index);
            this.firstFreeIndex--;
        }
    }

    public int indexOfValue(Type value) {

        for (int i = 0; i < this.firstFreeIndex; i++) {

            if (this.data[i] == value || this.data[i].equals(value)) {

                return i;
            }
        }

        return -1;
    }


    private void moveToTheLeft(int fromIndex) {

        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {

            this.data[i] = this.data[i+1];
        }
    }


    public Type value(int index) {

        if (index < 0 || index >= this.firstFreeIndex) {

            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        return this.data[index];
    }

    public int size() {

        return this.firstFreeIndex;
    }
}
