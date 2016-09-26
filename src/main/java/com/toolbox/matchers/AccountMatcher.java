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
package com.toolbox.matchers;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class AccountMatcher<Account> extends BaseMatcher<Account> {

    public boolean matches(Object item) {
	Account account = (Account)item;
	return false;
    }

    public void describeTo(Description description) {
	description.appendText( "Account doesn't match");
    }

}

