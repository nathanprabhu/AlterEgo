/********************************************************************************
 * MIT Java Wordnet Interface (JWI) 
 * Copyright (c) 2007-2008 Massachusetts Institute of Technology
 *
 * This is the non-commercial version of JWI.  This version may *not* be used
 * for commercial purposes.
 * 
 * This program and the accompanying materials are made available by the MIT
 * Technology Licensing Office under the terms of the MIT Java Wordnet Interface 
 * Non-Commercial License.  The MIT Technology Licensing Office can be reached 
 * at 617-253-6966 for further inquiry.
 *******************************************************************************/

package edu.mit.jwi;

/**
 * Indicates that the dictionary was not open when data was requested of it.
 * 
 * @author Mark A. Finlayson
 * @version 2.1.5, Nov. 16, 2007
 * @since 1.5.0
 */
public class DictionaryClosedException extends RuntimeException {

	private static final long serialVersionUID = 6869205531915273454L;

	/**
	 * Constructs a new exception with <code>null</code> as its detail
	 * message. The cause is not initialized, and may subsequently be
	 * initialized by a call to {@link #initCause}.
	 */
	public DictionaryClosedException() {
		super();
	}

	/**
	 * Constructs a new exception with the specified detail message. The cause
	 * is not initialized, and may subsequently be initialized by a call to
	 * {@link #initCause}.
	 * 
	 * @param message
	 *            the detail message. The detail message is saved for later
	 *            retrieval by the {@link #getMessage()} method.
	 */
	public DictionaryClosedException(String message) {
		super(message);
	}

	/**
	 * Constructs a new exception with the specified detail message and cause.
	 * <p>
	 * Note that the detail message associated with <code>cause</code> is
	 * <i>not</i> automatically incorporated in this runtime exception's detail
	 * message.
	 * 
	 * @param message
	 *            the detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method).
	 * @param cause
	 *            the cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A {@code null} value is
	 *            permitted, and indicates that the cause is nonexistent or
	 *            unknown.)
	 * @since 1.4
	 */
	public DictionaryClosedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new exception with the specified cause and a detail message
	 * of {@code (cause==null ? null : cause.toString())} (which typically
	 * contains the class and detail message of {@code cause}). This
	 * constructor is useful for runtime exceptions that are little more than
	 * wrappers for other throwables.
	 * 
	 * @param cause
	 *            the cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A {@code null} value is
	 *            permitted, and indicates that the cause is nonexistent or
	 *            unknown.)
	 * @since 1.4
	 */
	public DictionaryClosedException(Throwable cause) {
		super(cause);
	}
}
