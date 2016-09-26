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

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() throws Exception {
	customer = new Customer();
    }
//
//    @Test
//    public void testGetName() {
//	fail("Not yet implemented");
//    }
//
//    @Test
//    public void testSetName() {
//	fail("Not yet implemented");
//    }
//
//    @Test
//    public void testGetBank() {
//	fail("Not yet implemented");
//    }
//
//    @Test
//    public void testSetBank() {
//	fail("Not yet implemented");
//    }
//
//    @Test
//    public void testGetAccounts() {
//	fail("Not yet implemented");
//    }
//
//    @Test
//    public void testAddAccount() {
//	fail("Not yet implemented");
//    }
//
//    @Test
//    public void testRemoveAccount() {
//	fail("Not yet implemented");
//    }
    
    @Test
    public void testIsCollectionContaining(){
	Account account = new Account();
	account.setAccountNumber(1L);
	customer.addAccount(account);;
	Account account2 = new Account();
	account2.setAccountNumber(2L);
	customer.addAccount(account2);
	assertThat( customer.getAccounts(), hasItem( account2 ) );
    }

}

