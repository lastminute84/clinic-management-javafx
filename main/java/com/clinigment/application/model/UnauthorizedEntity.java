
package com.clinigment.application.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author csaba
 */

@XmlRootElement
@XmlType
@XmlAccessorType
public class UnauthorizedEntity {
    
    private int errorCode;
    private String message;
    
    public UnauthorizedEntity() {
        this.message = "Unauthorized";
        this.errorCode = 401;
    }
    
    public UnauthorizedEntity(String message) {
        this.message = message;
        this.errorCode = 401;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   
    
    
}
