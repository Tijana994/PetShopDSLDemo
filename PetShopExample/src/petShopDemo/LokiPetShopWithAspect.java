package petShopDemo;

import com.petshop.annotations.OfferCreatedAnnotation;

public class LokiPetShopWithAspect {
	public String OfferName;
	
	@OfferCreatedAnnotation(name = "OfferName")
	public Offer createOfferWithNotification(String name)
	{
		var instance = PetShopDemoPackage.eINSTANCE;
        PetShopDemoFactory factory = PetShopDemoFactory.eINSTANCE;
		var offer = factory.createOffer();
		OfferName = name;
		return offer;
	}
}
