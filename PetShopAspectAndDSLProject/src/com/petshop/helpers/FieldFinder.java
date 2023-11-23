package com.petshop.helpers;

import java.lang.reflect.Field;

public class FieldFinder {
	public static Object getFieldValue(String fieldName, Object annotationObject, Class<? extends Object> c)
	{
		try 
		{
			if(fieldName.equals(Constants.Empty))
			{
				System.out.println("Parameter name is empty");
				return null;
			}
			Field field = c.getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(annotationObject);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return null;
	}
}
