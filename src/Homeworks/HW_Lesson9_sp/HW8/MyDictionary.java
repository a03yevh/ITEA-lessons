package Homeworks.HW_Lesson9_sp.HW8;

public class MyDictionary {
    private String[] keys;
    private String[] values;
    private int count;

    public MyDictionary() {
        keys = new String[10];
        values = new String[10];
        count = 0;
    }

    public void add(String key, String value) {
        if (count >= keys.length) {
            int newSize = keys.length * 2;
            String[] newKeys = new String[newSize];
            String[] newValues = new String[newSize];
            System.arraycopy(keys, 0, newKeys, 0, keys.length);
            System.arraycopy(values, 0, newValues, 0, values.length);
            keys = newKeys;
            values = newValues;
        }

        keys[count] = key;
        values[count] = value;
        count++;
    }

    public String getValue(int index) {
        if (index >= 0 && index < count) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index -> " + index);
        }
    }

    public int getCount() {
        return count;
    }
}