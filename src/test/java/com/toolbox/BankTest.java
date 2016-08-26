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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Arrays;

import org.hamcrest.beans.PropertyUtil;
import org.junit.Before;
import org.junit.Test;

public class BankTest extends Bank {

    private Bank bank;
    
    @Before
    public void setUp() throws Exception {
	bank = new Bank();
    }
    
    // String Matchers
    @Test
    public void testToString(){
	bank.setName("Second National Bank");
	assertThat( bank.toString(), equalTo("Bank [name=Second National Bank]"));
    }
    
    @Test
    public void testIsEmptyString(){
	assertThat( bank.getName(), isEmptyOrNullString() );
	bank.setName("");
	assertThat( bank.getName(), isEmptyString() );
    }
    
    @Test
    public void testIsEqualIgnoringCase(){
	bank.setName("foo");
	assertThat( bank.getName(), equalToIgnoringCase( "FOO") );
	assertThat( bank.getName(), equalToIgnoringCase( "Foo") );
	assertThat( bank.getName(), equalToIgnoringCase( "foo") );
    }

    @Test
    public void testIsEqualToIgnoringWhiteSpace(){
	bank.setName("Second National Bank     ");
	assertThat( bank.getName(), equalToIgnoringWhiteSpace("     Second National Bank"));
	bank.setName("Second\tNational\tBank");
	assertThat( bank.getName(), equalToIgnoringWhiteSpace("Second National Bank"));
    }
    
    @Test
    public void testStringContainsInOrder(){
	bank.setName("Second National Bank");
	// You don't have to compare them all but the strings that you list must be in order.
	assertThat( bank.getName(), stringContainsInOrder(Arrays.asList("National", "Bank")));
    }
    @Test
    public void testGetName() {
	bank.setName("Second National Bank");
	assertThat( bank.getName(), equalTo("Second National Bank"));
    }
    
    @Test
    public void testContainsString(){
	bank.setName("Second National Bank");
	assertThat( bank.getName(), containsString( "tion") );
    }
    
    @Test
    public void testStartsWith(){
	bank.setName("Second National Bank");
	assertThat( bank.getName(), startsWith( "Second") );
    }
    
    @Test
    public void testEndsWith(){
	bank.setName("Second National Bank");
	assertThat( bank.getName(), endsWith( "Bank") );
    }

    // Object Matchers
    @Test
    public void testHasToString(){
	bank.setName("Second National Bank");
	// Call the bank.toString and the we compare Strings.
	assertThat( bank, hasToString("Bank [name=Second National Bank]"));
	// is the same as the other API for hasToString
	assertThat( bank, hasToString(equalTo("Bank [name=Second National Bank]")));
    }
    
    @Test
    public void testTypeCompatibleWith(){
	bank.setName("Second National Bank");
	assertThat( bank.getName().getClass(), typeCompatibleWith( String.class ) );
	assertThat( ArrayList.class, typeCompatibleWith( List.class ));
    }
    
    // Bean Matchers
    @Test
    public void testHasProperty(){
	bank.setName("Second National Bank");
	assertThat( bank, hasProperty( "name" ) );
    }
    
    @Test
    public void testHasPropertyWithValue(){
	bank.setName("Second National Bank");
	assertThat( bank, hasProperty( "name", equalTo("Second National Bank") ));
    }
    
    @Test
    public void testGetPropertyDescriptor() throws Throwable{
	PropertyDescriptor prop = PropertyUtil.getPropertyDescriptor("name", bank);
	prop.setValue("name", "Second National Bank");
	assertThat( prop.getValue("name").toString(), equalTo("Second National Bank") );
    }
    // TODO Still have more matchers in org.hamcrest.beans package to test.
    // Useless Matchers
    @Test
    public void testIsAnything(){
	bank.setName("First National Bank");
	assertThat( bank, anything() );
	// You'll never see this description.
	assertThat( bank, anything("the bank's name"));
    }
}


