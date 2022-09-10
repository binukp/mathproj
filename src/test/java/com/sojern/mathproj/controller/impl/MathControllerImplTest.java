package com.sojern.mathproj.controller.impl;

import com.sojern.mathproj.model.MyList;
import com.sojern.mathproj.service.impl.MathServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
class MathControllerImplTest {

    @Mock
    Logger log;
    @InjectMocks
    MathControllerImpl mathControllerImpl;
    @InjectMocks
    private MathServiceImpl mathService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetMinimum() {
        mathControllerImpl.setMathService(mathService);
        ResponseEntity result = mathControllerImpl.getMinimum(Arrays.asList(6, 2, 1));
        Assertions.assertEquals(1, result.getBody());
    }

    @Test
    void testGetMaximum() {
        mathControllerImpl.setMathService(mathService);
        ResponseEntity result = mathControllerImpl.getMaximum(Arrays.asList(6, 2, 1));
        Assertions.assertEquals(6, result.getBody());
    }

    @Test
    void testGetAverage() {
        mathControllerImpl.setMathService(mathService);
        ResponseEntity result = mathControllerImpl.getAverage(Arrays.asList(3,2,1));
        Assertions.assertEquals(2.0, result.getBody());
    }

    @Test
    void testGetMedian() {
        mathControllerImpl.setMathService(mathService);
        ResponseEntity result = mathControllerImpl.getMedian(Arrays.asList(6, 2, 1));
        Assertions.assertEquals(2, result.getBody());
    }

    @Test
    void testGetPercentile() {
        mathControllerImpl.setMathService(mathService);
        MyList myList = new MyList();
        myList.setList(Arrays.asList(6, 2, 1));
        myList.setPercentile(1);
        ResponseEntity result = mathControllerImpl.getPercentile(myList);
        Assertions.assertEquals(1, result.getBody());
        myList.setPercentile(95);
        result = mathControllerImpl.getPercentile(myList);
        Assertions.assertEquals(6, result.getBody());
    }


}
