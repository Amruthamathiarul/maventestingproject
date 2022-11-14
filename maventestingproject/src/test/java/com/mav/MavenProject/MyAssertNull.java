package com.mav.MavenProject;

import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyAssertNull {
	public String getPropValue(final String key) {
		Map<String, String> appProps = new HashMap<String, String>();
		appProps.put("key1", null);
		appProps.put("key2", "value 2");
		appProps.put("key3", "value 3");
		return appProps.get(key);
	}

	@Test
	public void test() {
		MyAssertNull msnt = new MyAssertNull();
		assertNull(msnt.getPropValue("key1"));
	}

}
