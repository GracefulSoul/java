package exception;

public class FileException extends RuntimeException {

	private static final long serialVersionUID = -7903712172617310856L;

	public FileException(String message) {
		super(message);
	}

	public FileException(Throwable cause) {
		super(cause);
	}

	public FileException(String message, Throwable cause) {
		super(message, cause);
	}

}
