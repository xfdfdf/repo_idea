package com.wjy.package5;

import java.io.Serializable;

@MyAnnotation
public class Student<T,E> extends Person implements Comparable<Object>, Serializable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
