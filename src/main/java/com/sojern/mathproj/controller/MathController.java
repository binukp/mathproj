package com.sojern.mathproj.controller;

import com.sojern.mathproj.model.MyList;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MathController {

    @GetMapping(value = "/min", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getMinimum(@RequestBody List<Integer> numberList);

    @GetMapping(value = "/max", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getMaximum(@RequestBody List<Integer> numberList);

    @GetMapping(value = "/avg", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getAverage(@RequestBody List<Integer> numberList);

    @GetMapping(value = "/median", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getMedian(@RequestBody List<Integer> numberList);

    @GetMapping(value = "/percentile", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getPercentile(@RequestBody MyList myList);
}
