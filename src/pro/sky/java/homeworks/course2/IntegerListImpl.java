package pro.sky.java.homeworks.course2;

import java.util.Arrays;
import java.util.Objects;

public class IntegerListImpl implements IntegerList {
    private final Integer[] integerList;
    private int size = 0;

    public IntegerListImpl(int length) {
        integerList = new Integer[length];
    }

    @Override
    public Integer add(Integer item) {
        if (size >= integerList.length) {
            throw new ArrayIndexOutOfBoundsException("Массив заполнен");
        }
        integerList[size] = item;
        size++;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        if (index >= integerList.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Ячейки " + index + " в массиве нет");
        }
        if (integerList[index - 1] == null) {
            throw new ArrayIndexOutOfBoundsException(index + " выходит за пределы фактического\n" +
                    "    // количества элементов");
        }
        if (integerList[integerList.length - 1] != null) {
            throw new ArrayIndexOutOfBoundsException("Массив заполнен, добавление нового элемента невозможно");
        } else if (integerList[integerList.length - 1] == null && integerList[index] != null) {
            System.arraycopy(integerList, index, integerList, index + 1, integerList.length - 1 - (index + 1));
            integerList[index] = item;
            size++;
            return item;
        }
        integerList[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        if (index >= integerList.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Ячейки " + index + " в массиве нет");
        }
        if (integerList[index - 1] == null) {
            throw new ArrayIndexOutOfBoundsException(index + " выходит за пределы фактического\n" +
                    "    // количества элементов");
        }
        integerList[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer removeItem(Integer item) {
        for (int j = 0; j < integerList.length; j++) {
            if (item.equals(integerList[j])) {
                integerList[j] = null;
                System.arraycopy(integerList, j + 1, integerList, j, integerList.length - 1 - j);
                size--;
                return item;
            }
        }
        throw new NullPointerException(item + " не найдено");
    }

    @Override
    public Integer removeByIndex(int index) {
        if (index >= integerList.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Ячейки " + index + " в массиве нет");
        }
        if (integerList[index] == null) {
            throw new NullPointerException("Ячейка пуста");
        }
        Integer removedIntegerByIndex = integerList[index];
        integerList[index] = null;
        System.arraycopy(integerList, index + 1, integerList, index, integerList.length - 1 - index);
        size--;
        return removedIntegerByIndex;
    }

    @Override
    public int indexOf(Integer item) {
        for (int k = 0; k < integerList.length; k++) {
            if (integerList[k].equals(item)) {
                return k;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int k = integerList.length - 1; k >= 0; k--) {
            if (integerList[k] == null) {
                continue;
            }
            if (integerList[k].equals(item)) {
                return k;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        if (index >= integerList.length || index <= 0) {
            throw new ArrayIndexOutOfBoundsException("Ячейки " + index + " в массиве нет");
        }
        return integerList[index];
    }

    @Override
    public int hashCode() {
//        int result = Objects.hash(size);
//        result = 31 * result + Arrays.hashCode(integerList);
//        return result;

        return Arrays.hashCode(integerList);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (Integer s : integerList) {
            if (s != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        Arrays.fill(integerList, null);
    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(integerList, integerList.length);

//        return Arrays.stream(integerList)
//                .filter(e -> e != null)
//                .toArray(Integer[]::new);
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (otherList == null) {
            throw new NullPointerException("Передано null");
        }
        IntegerListImpl that = (IntegerListImpl) otherList;
        return Arrays.equals(integerList, that.integerList);
    }

    @Override
    public boolean contains(Integer item) {
        sortInsertion(integerList);
        return searchBinary(integerList, item);
    }

    private void sortInsertion(Integer[] arr) {
        Integer[] newIntArray = Arrays.stream(integerList)
                .filter(e -> e != null)
                .toArray(Integer[]::new);
        for (int i = 1; i < newIntArray.length; i++) {
            int temp = newIntArray[i];
            int j = i;
            while (j > 0 && newIntArray[j - 1] >= temp) {
                newIntArray[j] = newIntArray[j - 1];
                j--;
            }
            newIntArray[j] = temp;
        }
    }

    private boolean searchBinary(Integer[] arr, int element) {
        Integer[] newIntArray = Arrays.stream(integerList)
                .filter(e -> e != null)
                .toArray(Integer[]::new);
        int min = 0;
        int max = newIntArray.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == newIntArray[mid]) {
                return true;
            }

            if (element < newIntArray[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
}
