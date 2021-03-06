package util;

/**
 * @author LiWei
 * @date 2020/06/02 10:31
 */
public class ArrayBox implements Box{
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elementData;
    private int size = 0;

    public ArrayBox() {
        elementData = new int[DEFAULT_CAPACITY];
    }

    public ArrayBox(int capacity) {
        elementData = new int[capacity];
    }

    // 判断index是否合法
    private void rangeCheck(int index) {
        if(index < 0 || index >= size){
            throw new BoxIndexOutOfBoundsException("Index:" + index + ", Size:" + size);
        }
    }

    // 确保旧数组足够的空间，不够则扩容
    private void ensureCapacityInternal(int minCapacity) {
        if(minCapacity - elementData.length > 0){
            this.grow(minCapacity);
        }
    }

    // 数组扩容
    private void grow(int minCapacity) {
        // 获取旧数组的长度
        int oldCapacity = elementData.length;
        // 以旧数组的长度的1.5倍进行扩容
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 若newCapacity还不够
        if(newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }
        elementData = this.copyOf(elementData, newCapacity);
    }

    // 负责创建一个新数组，将旧数组的元素全部移入新数组内
    private int[] copyOf(int[] oldAaary, int newCapacity) {
        // 创建一个新的数组
        int[] newArray = new int[newCapacity];
        System.arraycopy(oldAaary, 0, newArray, 0, oldAaary.length);
        /*for(int i = 0; i < oldAaary.length; ++i){
            newArray[i] = oldAaary[i];
        }*/
        return newArray;
    }

    // 往数组中添加元素
    @Override
    public boolean add(int element) {  // E 为在创建box对象时规定的类型
        this.ensureCapacityInternal(size + 1);
        elementData[size++] = element;
        return true;
    }

    // 获取数组中的一个元素
    @Override
    public int get(int index) {
        // 检测index是否合法
        this.rangeCheck(index);
        return elementData[index];
    }

    // 删除数组中的一个元素
    @Override
    public int remove(int index) {
        // 检测index是否合法
        this.rangeCheck(index);
        int oldValue = elementData[index];
        // 从index开始至size-1为止，将后面位置元素依次迁移覆盖
        if (size - 1 - index >= 0) {
            System.arraycopy(elementData, index + 1, elementData, index, size - 1 - index);
        }
        /*for(int i=index; i < size-1; i++) {
            // 从index开始至size-1为止，将后面位置元素依次迁移覆盖
            elementData[i] = elementData[i+1];
        }*/
        elementData[--size] = 0;  //末尾元素清空
        return oldValue;
    }

    @Override
    public int size() {
        return this.size;
    }
    public int lengthOfElementData() {
        return this.elementData.length;
    }
}
