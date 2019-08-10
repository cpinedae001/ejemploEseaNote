package com.guatex2.easynotes.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{
    private String resourceName;
    private String fielName;
    private Object fielValue;

    public ResourceNotFoundException(String resourceName, String fielName, Object fielValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fielName, fielName));
        this.resourceName = resourceName;
        this.fielName = fielName;
        this.fielValue = fielValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFielName() {
        return fielName;
    }

    public Object getFielValue() {
        return fielValue;
    }
}
