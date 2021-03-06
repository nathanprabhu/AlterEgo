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

package edu.mit.jwi.item;

/**
 * Objects that implement this interface represent a possible type of pointer
 * between items in the dictionary.
 * 
 * @author Mark A. Finlayson
 * @version 2.1.5, Nov. 16, 2007
 * @since 1.5.0
 */
public interface IPointer {

	/**
	 * The symbol in the Wordnet data files that is used to indicate this
	 * pointer type.
	 */
	public String getSymbol();

	/**
	 * Returns a user-friendly name of this pointer type for identification
	 * purposes.
	 */
	public String getName();

}
