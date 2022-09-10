package com.sojern.mathproj.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor

public class MyList {
    private List<Integer> list;
    private Integer percentile;
}


