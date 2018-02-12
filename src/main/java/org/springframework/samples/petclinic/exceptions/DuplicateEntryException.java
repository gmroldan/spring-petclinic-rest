package org.springframework.samples.petclinic.exceptions;

public class DuplicateEntryException extends Exception {

    /**
     * Class constructor.
     *
     * @param message
     */
    public DuplicateEntryException(String message) {
        super(message);
    }
}
