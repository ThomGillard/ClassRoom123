package Template.exceptions;

import lombok.Getter;

@Getter
public class Exception extends RuntimeException {
    private final Object innerData;
    public Exception(Object innerData) {
        super("exception description");
        this.innerData = innerData;
    }

}
