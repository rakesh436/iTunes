package com.iTunes.Constants.ErrorMessages.SearchError;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SearchMessage {

    INVALID_VALUES(400,"Invalid value(s) for key(s): [mediaType]"),
    VALID(200,"Success");


    private final int ERROR_CODE;
    private final String ERROR_MESSAGE;

}
