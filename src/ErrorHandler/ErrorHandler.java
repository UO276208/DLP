package ErrorHandler;

import AST.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static ErrorHandler instance;

    private List<ErrorType> errors;

    private ErrorHandler() {
        errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    public boolean hasErrors(){
        return errors.size() > 0;
    }

    public void showErrors(PrintStream stream){
        stream.println(errors);
    }

    public void addError(ErrorType error){
        errors.add(error);
    }
}
