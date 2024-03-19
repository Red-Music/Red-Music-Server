package org.example.music.global.exception;

import org.example.music.global.error.exception.ErrorCode;
import org.example.music.global.error.exception.GlobalException;

public class InvalidTokenException extends GlobalException {
    public static final GlobalException EXCEPTION = new InvalidTokenException();

    private InvalidTokenException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}
