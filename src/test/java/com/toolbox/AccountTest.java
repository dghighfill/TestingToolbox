/*
 * COPYRIGHT:
 *
 *   The computer systems, procedures, data bases and programs
 *   created and maintained by DST Systems, Inc., are proprietary
 *   in nature and as such are confidential.  Any unauthorized
 *   use or disclosure of such information may result in civil
 *   liabilities.
 *
 *   Copyright 2016 by DST Systems, Inc.
 *   All Rights Reserved.
 */
package com.toolbox;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() throws Exception {
	account = new Account();
    }

    @Test
    public void testGetAccountNumber() {
	assertEquals("test",  true, false);
    }

    @Test
    public void testSetAccountNumber() {
	fail("Not yet implemented");
    }

    @Test
    public void testDeposit() {
	fail("Not yet implemented");
    }

    @Test
    public void testWithdrawl() {
	fail("Not yet implemented");
    }

    @Test
    public void testGetBalnce() {
	fail("Not yet implemented");
    }

}

