package org.example.music.global.error.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    USER_ALREADY(409, "USER-409-1", "User Already"),
    USER_NOT_FOUND(404, "USER-404-1", "User Not Found"),
    PASSWORD_MISMATCH(401, "USER-401-1", "Password Mismatch"),

    EXPIRED_TOKEN(401, "COMMON-401-2", "Expired Token"),
    INVALID_TOKEN(401, "COMMON-401-1", "Invalid Token"),
    INTERNAL_SERVER_ERROR(500, "COMMON-500-1", "Internal Server Error");

    private final int status;
    private final String code;
    private final String message;

}
