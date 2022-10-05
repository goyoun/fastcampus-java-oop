package com.fastcampus.service;

import com.fastcampus.logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

  private SortService sut = new SortService(new JavaSort<String>());

  @Test
  @DisplayName("")
  void SortServiceTest() {

            //Given

            //When
            List<String> actual = sut.doSort(List.of("3", "2", "1"));

            //Then
          assertEquals(List.of("1", "2", "3") actual);


          }


}