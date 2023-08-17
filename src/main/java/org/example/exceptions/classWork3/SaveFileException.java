package org.example.exceptions.classWork3;

import java.io.IOException;

public class SaveFileException extends IOException {
    public SaveFileException(String message, Throwable cause) {
        super(message, cause);
    }
}

