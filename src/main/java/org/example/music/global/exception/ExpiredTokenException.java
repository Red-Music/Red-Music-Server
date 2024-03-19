package org.example.music.global.exception;

import org.example.music.global.error.exception.ErrorCode;
import org.example.music.global.error.exception.GlobalException;

public class ExpiredTokenException extends GlobalException {
    public static final GlobalException EXCEPTION = new ExpiredTokenException();

    private  ExpiredTokenException(){
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
