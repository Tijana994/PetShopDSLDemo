package petShopDemo;
import com.petshop.annotations.OfferCreatedAnnotation;

public class LokiPetShop {
	
	public String OfferName;
	
	@OfferCreatedAnnotation(name = "OfferName")
	public Offer createOfferWithNotification(String name)
	{
		var offer = createOffer(name);
		OfferName = name;
		return offer;
	}
	
	public Offer createOffer(String name)
	{
		var instance = PetShopDemoPackage.eINSTANCE;
        PetShopDemoFactory factory = PetShopDemoFactory.eINSTANCE;
		var offer = factory.createOffer();
		OfferName = name;
		return offer;
	}

}
