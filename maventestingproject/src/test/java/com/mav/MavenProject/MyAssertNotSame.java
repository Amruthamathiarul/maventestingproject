package com.mav.MavenProject;

import static org.junit.Assert.assertNotSame;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyAssertNotSame {
	public String getPropValue(final String key) {
		Map<String, String> appProps = new HashMap<String, String>();
		appProps.put("key1", "value 1");
		appProps.put("key2", "value 2");
		appProps.put("key3", "value 3");
		return appProps.get(key);
	}

	@Test
	public void test() {
		MyAssertNotSame msnt = new MyAssertNotSame();
		assertNotSame(msnt.getPropValue("key1"), msnt.getPropValue("key2"));

	}

}
