package com.petshop.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.petshop.helpers.Constants;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OfferCreatedAnnotation {
	String name() default Constants.Empty;
}
