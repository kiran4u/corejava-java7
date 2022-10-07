/**
 * 
 */
package com.eazybytes.util;

/**
 * @author Kiran
 *
 */
public class CustomResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println(" From close method inside the CustomResource class");

	}

	public void readFromResource() {
		System.out.println(" Reading data... ");
	}

}
