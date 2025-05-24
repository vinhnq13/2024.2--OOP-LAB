package hust.soict.hedspi.aims.exception;

/**
 * PlayerException is a custom exception that is thrown
 * when an error occurs during media playback.
 */
public class PlayerException extends Exception {

    /**
     * Constructs a new PlayerException with the specified detail message.
     *
     * @param message the detail message describing the error.
     */
    public PlayerException(String message) {
        super(message);
    }
}
