package com.company.chain;

public abstract class AbstractValidator {
    protected AbstractValidator nextValidator;

    public abstract boolean validate(String password);
}
