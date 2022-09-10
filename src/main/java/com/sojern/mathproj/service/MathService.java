package com.sojern.mathproj.service;

import java.util.List;

public interface MathService {

    Integer findMini(List<Integer> numberList);

    Integer findMax(List<Integer> numberList);

    Double findAvg(List<Integer> numberList);

    Integer findMedian(List<Integer> numberList);

    Integer findPercentile(List<Integer> numberList, Integer percentile);
}

