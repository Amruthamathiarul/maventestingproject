package com.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.nio.channels.NetworkChannel;
import java.sql.DatabaseMetaData;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ApplicationTest {
	@InjectMocks
	MainClass mainClass;

	@Mock
	DatabaseDAO dependentClassOne;

	@Mock
	NetworkDAO dependentClassTwo;

	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void validateTest() {

		when(dependentClassOne.save("sdfffg")).thenReturn(true);
		when(dependentClassTwo.save("sdfffg")).thenReturn(true);

		boolean saved = mainClass.save("D://test.txt");
		assertEquals(true, saved);

	}

}
