/*
 * Copyright (C) 2011 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.direct.services.project.milestone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.topcoder.util.errorhandling.BaseRuntimeException;
import com.topcoder.util.errorhandling.ExceptionData;

/**
 * <p>
 * Unit tests for class <code>ProjectMilestoneManagementConfigurationException</code>.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class ProjectMilestoneManagementConfigurationExceptionTest {
    /**
     * <p>
     * Represents the <code>Throwable</code> instance used to test against.
     * </p>
     */
    private Throwable throwable;

    /**
     * <p>
     * Represents the <code>ExceptionData</code> instance used to test against.
     * </p>
     */
    private ExceptionData data;

    /**
     * Creates a test suite for unit tests in this test case.
     *
     * @return a Test suite for this test case.
     */
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ProjectMilestoneManagementConfigurationExceptionTest.class);
    }

    /**
     * <p>
     * Set up the test environment.
     * </p>
     */
    @Before
    public void setUp() {
        throwable = new NullPointerException();
        data = new ExceptionData();
        data.setApplicationCode("AppCode");
    }

    /**
     * <p>
     * Tear down the test environment.
     * </p>
     */
    @After
    public void tearDown() {
        throwable = null;
        data = null;
    }

    /**
     * <p>
     * Inheritance test, verifies <code>ProjectMilestoneManagementConfigurationException</code> subclasses should
     * be correct.
     * </p>
     */
    @SuppressWarnings("cast")
    @Test
    public void testInheritance() {
        assertTrue("The instance's subclass is not correct.",
            new ProjectMilestoneManagementConfigurationException("test") instanceof BaseRuntimeException);
    }

    /**
     * <p>
     * Accuracy test for the constructor <code>ProjectMilestoneManagementConfigurationException(String)</code>.<br>
     * Instance should be created successfully.
     * </p>
     */
    @Test
    public void testCtor() {
        ProjectMilestoneManagementConfigurationException exception =
            new ProjectMilestoneManagementConfigurationException("test");
        assertNotNull("Instance should be created", exception);
        assertEquals("Return value should be 'test'", "test", exception.getMessage());
    }

    /**
     * <p>
     * Accuracy test for the constructor
     * <code>ProjectMilestoneManagementConfigurationException(String, Throwable)</code>.<br>
     * Instance should be created successfully.
     * </p>
     */
    @Test
    public void testCtor2() {
        ProjectMilestoneManagementConfigurationException exception =
            new ProjectMilestoneManagementConfigurationException("test", throwable);
        assertNotNull("Instance should be created", exception);
        assertEquals("Return value should be 'test'", "test", exception.getMessage());
        assertEquals("Cause should be set correctly", throwable, exception.getCause());
    }

    /**
     * <p>
     * Accuracy test for the constructor
     * <code>ProjectMilestoneManagementConfigurationException(String, ExceptionData)</code>.<br>
     * Instance should be created successfully.
     * </p>
     */
    @Test
    public void testCtor3() {
        ProjectMilestoneManagementConfigurationException exception =
            new ProjectMilestoneManagementConfigurationException("test", data);
        assertNotNull("Instance should be created", exception);
        assertEquals("Return value should be 'test'", "test", exception.getMessage());
        assertEquals("Cause should be set correctly", "AppCode", exception.getApplicationCode());
    }

    /**
     * <p>
     * Accuracy test for the constructor
     * <code>ProjectMilestoneManagementConfigurationException(String, Throwable, ExceptionData)</code>.<br>
     * Instance should be created successfully.
     * </p>
     */
    @Test
    public void testCtor4() {
        ProjectMilestoneManagementConfigurationException exception =
            new ProjectMilestoneManagementConfigurationException("test", throwable, data);
        assertNotNull("Instance should be created", exception);
        assertEquals("Return value should be 'test'", "test", exception.getMessage());
        assertEquals("Cause should be set correctly", throwable, exception.getCause());
        assertEquals("Cause should be set correctly", "AppCode", exception.getApplicationCode());
    }

}
