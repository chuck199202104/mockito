/*
 * Copyright (c) 2007 Mockito contributors 
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.exceptions;

import java.util.*;

public class VerificationError extends MockitoAssertionError {

    private static final long serialVersionUID = 1L;

    public VerificationError(String message) {
        super(message);
    }

    public VerificationError(String message, List<StackTraceElement> invocationStackTrace) {
        super(message, invocationStackTrace);
    }
}
