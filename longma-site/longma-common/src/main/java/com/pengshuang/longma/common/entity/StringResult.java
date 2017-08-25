package com.pengshuang.longma.common.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StringResult extends Result<String> {

    public StringResult(boolean success, String result) {
        super(success, result);
    }
}
