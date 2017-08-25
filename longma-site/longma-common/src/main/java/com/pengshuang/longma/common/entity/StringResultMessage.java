package com.pengshuang.longma.common.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StringResultMessage extends ResultMessage<String> {

    public StringResultMessage(boolean success, String result) {
        super(success, result);
    }
}
