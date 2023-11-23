package com.petshop.aspects;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import com.petshop.annotations.OfferCreatedAnnotation;
import com.petshop.helpers.FieldFinder;

import petShopDemo.PetShopDemoFactory;
import petShopDemo.PetShopDemoPackage;

@Aspect
public class OfferCreatedAspect {

	@Pointcut("execution(* *..*(..)) && @annotation(com.petshop.annotations.OfferCreatedAnnotation)")
	void function() {}
	@Around("function()")
	public Object createNotification(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		System.out.println("Helloooo from the aspect!");
		Object[] args = thisJoinPoint.getArgs();
		Object ret = thisJoinPoint.proceed(args);
		Object obj = thisJoinPoint.getThis();
		Class<? extends Object> objectClass = obj.getClass();
	    MethodSignature signature = (MethodSignature) thisJoinPoint.getSignature();
	    Method method = signature.getMethod();
	    OfferCreatedAnnotation createOffer = method.getAnnotation(OfferCreatedAnnotation.class);
		if(createOffer == null)
		{
			System.out.println("There is no create offer annotation");
			return ret;
		}
		
		try 
		{
			String offerName = (String)FieldFinder.getFieldValue(createOffer.name() ,obj, objectClass);
			System.out.println("Offer name is " + offerName);
	        var instance = PetShopDemoPackage.eINSTANCE;
	        PetShopDemoFactory factory = PetShopDemoFactory.eINSTANCE;
	        //TODO
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return ret;
	}
}
