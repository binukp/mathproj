package com.sojern.mathproj.controller.impl;

import com.sojern.mathproj.controller.MathController;
import com.sojern.mathproj.model.MyList;
import com.sojern.mathproj.service.MathService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class MathControllerImpl implements MathController {

    private MathService mathService;

    @Override
    public ResponseEntity getMinimum(List<Integer> numberList) {
        if (isInValidList(numberList))
            return new ResponseEntity("null", HttpStatus.BAD_REQUEST);
        return new ResponseEntity(mathService.findMini(numberList), HttpStatus.OK);
    }

    @Override
    public ResponseEntity getMaximum(List<Integer> numberList) {
        if (isInValidList(numberList))
            return new ResponseEntity("null", HttpStatus.BAD_REQUEST);
        return new ResponseEntity(mathService.findMax(numberList), HttpStatus.OK);
    }

    @Override
    public ResponseEntity getAverage(List<Integer> numberList) {
        if (isInValidList(numberList))
            return new ResponseEntity("null", HttpStatus.BAD_REQUEST);
        return new ResponseEntity(mathService.findAvg(numberList), HttpStatus.OK);
    }

    @Override
    public ResponseEntity getMedian(List<Integer> numberList) {
        if (isInValidList(numberList))
            return new ResponseEntity("null", HttpStatus.BAD_REQUEST);
        return new ResponseEntity(mathService.findMedian(numberList), HttpStatus.OK);
    }

    @Override
    public ResponseEntity getPercentile(MyList myList) {
        if (isInValidList(myList.getList()))
            return new ResponseEntity("null", HttpStatus.BAD_REQUEST);
        if (isInValidPercentile(myList.getPercentile()))
            return new ResponseEntity("invalid Percentile", HttpStatus.BAD_REQUEST);
        return new ResponseEntity(mathService.findPercentile(myList.getList(), myList.getPercentile()), HttpStatus.OK);
    }

    @Autowired
    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    private boolean isInValidList(List<Integer> numberList) {
        return numberList == null || numberList.size() == 0;
    }

    private boolean isInValidPercentile(Integer percentile) {
        if (percentile == null) return true;
        return percentile.intValue() < 0 || percentile.intValue() > 100;
    }
}
