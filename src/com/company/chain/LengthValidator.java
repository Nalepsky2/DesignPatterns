package com.company.chain;

public class LengthValidator extends AbstractValidator{

    public LengthValidator(AbstractValidator validator) {
        this.nextValidator = validator;
    }

    @Override
    public boolean validate(String password) {
        if(password.length() < 8) {
            return false;
        }
        else if (nextValidator != null) {
            return nextValidator.validate(password);
        }

        return true;
    }
}
