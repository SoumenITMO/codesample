package com.samasa.hspms.common.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value= RetentionPolicy.RUNTIME)
public @interface SortOn {
	String by();
}
