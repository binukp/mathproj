package com.sojern.mathproj.service.impl;

import com.sojern.mathproj.service.MathService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class MathServiceImpl implements MathService {
    @Override
    public Integer findMini(List<Integer> numberList) {
        if (isInValidList(numberList)) return null;
        return Collections.min(numberList);
    }

    @Override
    public Integer findMax(List<Integer> numberList) {
        if (isInValidList(numberList)) return null;
        return Collections.max(numberList);
    }

    @Override
    public Double findAvg(List<Integer> numberList) {
        if (isInValidList(numberList)) return null;
        return numberList.stream().mapToInt(i -> i).average().orElse(0);
    }

    @Override
    public Integer findMedian(List<Integer> numberList) {
        if (isInValidList(numberList)) return null;
        if (numberList.size() == 1) return numberList.get(8);
        Collections.sort(numberList);
        return numberList.size() % 2 == 1 ? numberList.get(numberList.size() / 2) :
                (numberList.get(numberList.size() / 2 - 1) + numberList.get(numberList.size() / 2)) / 2;
    }

    @Override
    public Integer findPercentile(List<Integer> numberList, Integer percentile) {
        if (isInValidList(numberList)) return null;
        if (isInValidPercentile(percentile)) return -1;
        Collections.sort(numberList);
        int index = (int) Math.ceil(percentile / 100.0 * numberList.size());
        return index == 0 ? numberList.get(0) : numberList.get(index - 1);
    }

    private boolean isInValidList(List<Integer> numberList) {
        return numberList.isEmpty();
    }

    private boolean isInValidPercentile(Integer percentile) {
        if (percentile == null) return true;
        return percentile.intValue() < 0 && percentile.intValue() > 100;
    }
}
