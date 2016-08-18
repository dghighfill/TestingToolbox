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

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest extends Bank {

    private Bank bank;
    
    @Before
    public void setUp() throws Exception {
	bank = new Bank();
    }

    @Test
    public void testGetName() {
	bank.setName("Second National Bank");
	assertThat( bank.getName(), equalTo("First National Bank"));
    }

}

