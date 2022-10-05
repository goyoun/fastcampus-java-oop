package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSortTest {
      @Test
      @DisplayName("")
          void JavaSortTest() {
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> actual = javaSort.sort(List.of(3,2,4,5,1));

        //then
        assertEquals(List.of(1,2,3,4,5), actual);

          }


}