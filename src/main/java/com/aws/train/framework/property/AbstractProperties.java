package com.aws.train.framework.property;

import java.lang.reflect.Field;

public abstract class AbstractProperties<T> {
	protected Class<T> t;

	public AbstractProperties(Class<T> t) {
		this.t = t;
	}

	public Object getValue(String key) {
		Object value = null;
		try {
			Field field = t.getDeclaredField(key);
			value = field.get(this);
		} catch (NoSuchFieldException | SecurityException e) {
			// Nothing to do
		} catch (IllegalArgumentException e) {
			// Nothing to do
		} catch (IllegalAccessException e) {
			// Nothing to do
		}
		return value;
	}
}
