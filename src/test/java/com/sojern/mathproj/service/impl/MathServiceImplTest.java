package com.sojern.mathproj.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.util.Arrays;
class MathServiceImplTest {
    @Mock
    Logger log;
    @InjectMocks
    MathServiceImpl mathServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindMini() {
        Integer result = mathServiceImpl.findMini(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(1, result);
        result = mathServiceImpl.findMini(Arrays.asList(5, 5, 334));
        Assertions.assertEquals(5, result);
        result = mathServiceImpl.findMini(Arrays.asList());
        Assertions.assertNull(result);
    }

    @Test
    void testFindMax() {
        Integer result = mathServiceImpl.findMax(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(3, result);
        result = mathServiceImpl.findMax(Arrays.asList(5, 5, 334));
        Assertions.assertEquals(334, result);
        result = mathServiceImpl.findMax(Arrays.asList());
        Assertions.assertNull(result);
    }

    @Test
    void testFindAvg() {
        Double result = mathServiceImpl.findAvg(Arrays.asList(3, 2, 1));
        Assertions.assertEquals(2., result);
        result = mathServiceImpl.findAvg(Arrays.asList(4,5));
        Assertions.assertEquals(4.5, result);
        result = mathServiceImpl.findAvg(Arrays.asList());
        Assertions.assertNull(result);
    }

    @Test
    void testFindMedian() {
        Integer result = mathServiceImpl.findMedian(Arrays.asList(3, 2, 1));
        Assertions.assertEquals(2, result);
        result = mathServiceImpl.findMedian(Arrays.asList(4,5));
        Assertions.assertEquals(4, result);
        result = mathServiceImpl.findMedian(Arrays.asList());
        Assertions.assertNull(result);
    }

    @Test
    void testFindPercentile() {
        Integer result = mathServiceImpl.findPercentile(Arrays.asList(5, 2, 3),3);
        Assertions.assertEquals(2, result);
        result = mathServiceImpl.findPercentile(Arrays.asList(5, 5, 334),3);
        Assertions.assertEquals(5, result);
        result = mathServiceImpl.findPercentile(Arrays.asList(4, 5, 8),95);
        Assertions.assertEquals(8, result);
        result = mathServiceImpl.findPercentile(Arrays.asList(),5);
        Assertions.assertNull(result);
    }
}

