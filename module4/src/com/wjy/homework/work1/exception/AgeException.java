package com.wjy.homework.work1.exception;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }


}
