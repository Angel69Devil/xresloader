package com.owent.xresloader.data.src;

/**
 * Created by ŷ��� on 2015/5/11.
 */
public class DataContainer<T> {
    public boolean valid = false;
    public T value;

    public DataContainer() {}

    public DataContainer<T> setDefault(T v) {
        value = v;

        return this;
    }

    public DataContainer<T> set(T v) {
        value = v;

        // ���ַ���Ҳ��Ϊ��δ������
        if (v instanceof String) {
            valid = false == ((String) v).isEmpty();
        } else {
            valid = true;
        }

        return this;
    }

    public T get() {
        return value;
    }
}
