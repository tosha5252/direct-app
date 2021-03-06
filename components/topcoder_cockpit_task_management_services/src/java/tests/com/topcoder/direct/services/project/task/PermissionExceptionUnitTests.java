/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.direct.services.project.task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.JUnit4TestAdapter;

/**
 * <p>
 * Unit tests for <code>{@link PermissionException}</code> class.
 * </p>
 *
 * @author sparemax
 * @version 1.0
 */
public class PermissionExceptionUnitTests {
    /**
     * <p>
     * Represents a detail message.
     * </p>
     */
    private static final String DETAIL_MESSAGE = "detail";

    /**
     * <p>
     * Represents an error cause.
     * </p>
     */
    private static final Throwable CAUSE = new Exception("UnitTests");

    /**
     * <p>
     * Adapter for earlier versions of JUnit.
     * </p>
     *
     * @return a test suite.
     */
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PermissionExceptionUnitTests.class);
    }

    /**
     * <p>
     * <code>PermissionException</code> should be subclass of <code>TaskManagementException</code>.
     * </p>
     */
    @Test
    public void testInheritance() {
        assertTrue("PermissionException should be subclass of TaskManagementException.",
            PermissionException.class.getSuperclass() == TaskManagementException.class);
    }

    /**
     * <p>
     * Tests accuracy of <code>PermissionException()</code> constructor.<br>
     * Instance should be correctly created.
     * </p>
     */
    @Test
    public void testCtor1() {
        PermissionException exception = new PermissionException();

        // Verify the error message
        assertNull("TaskManagementException message should be null.", exception.getMessage());
        // Verify the error cause
        assertNull("Error cause should be null.", exception.getCause());
    }

    /**
     * <p>
     * Tests accuracy of <code>PermissionException(String)</code> constructor.<br>
     * Instance should be correctly created.
     * </p>
     */
    @Test
    public void testCtor2() {
        PermissionException exception =
            new PermissionException(DETAIL_MESSAGE);

        // Verify the error message
        assertEquals("TaskManagementException message should be correct.", DETAIL_MESSAGE, exception.getMessage());
    }

    /**
     * <p>
     * Tests accuracy of <code>PermissionException(Throwable)</code> constructor.<br>
     * Instance should be correctly created.
     * </p>
     */
    @Test
    public void testCtor3() {
        PermissionException exception = new PermissionException(CAUSE);

        // Verify the error cause
        assertSame("Error cause should be correct.", CAUSE, exception.getCause());
    }

    /**
     * <p>
     * Tests accuracy of <code>PermissionException(String, Throwable)</code> constructor.<br>
     * Instance should be correctly created.
     * </p>
     */
    @Test
    public void testCtor4() {
        PermissionException exception =
            new PermissionException(DETAIL_MESSAGE, CAUSE);

        // Verify the error message
        assertEquals("Error message should be correct.", DETAIL_MESSAGE, exception.getMessage());
        // Verify the error cause
        assertSame("Error cause should be correct.", CAUSE, exception.getCause());
    }
}
