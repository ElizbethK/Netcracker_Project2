package com.netcracker.homeworks.project2.chapter3;


/*---------- ch. 3, num. 4-----------\\
Implement a static of method of the IntSequence class that yields a sequence
        with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
        sequence with six values. Extra credit if you return an instance of an
        anonymous inner class.*/

/*---------- ch. 3, num. 5-----------\\
/*
Add a static method with the name constant of the IntSequence class that
yields an infinite constant sequence. For example, IntSequence.constant(1)
        yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
        lambda expression.
*/

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public interface IntSequence {
    int next();

    default boolean hasNext(){
        return true;
    }


    static IntSequence of(int... digits) {
        IntSequence sequence = new IntSequence() {
            int[] array = Arrays.copyOf(digits, digits.length);
            int nextIndex;

            @Override
            public int next() {
                if (nextIndex >= array.length) {
                    throw new NoSuchElementException();
                } else {
                    return array[nextIndex++];
                }
            }

            @Override
            public boolean hasNext() {
                return nextIndex < array.length;
            }
        };
        return sequence;
    }


    static IntSequence constant(int i){
        return new IntSequence() {

            @Override
            public int next() {
                return i;
            }
            @Override
            public boolean hasNext() {
                return true;
            }

        };
    }


}
