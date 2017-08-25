package com.pengshuang.longma.backend.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultView<T> {

    private boolean success;
    private T       result;
}
