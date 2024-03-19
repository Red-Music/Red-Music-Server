package org.example.music.global.exception;

import org.example.music.global.error.exception.ErrorCode;
import org.example.music.global.error.exception.GlobalException;

public class InternerServerException extends GlobalException {

    public static final GlobalException EXCEPTION = new InternerServerException();

    private InternerServerException() {
        super(ErrorCode.INTERNAL_SERVER_ERROR);
    }
}