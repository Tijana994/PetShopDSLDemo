package petShopDemo;

public class LokiPetShop {
	
	public Offer createOffer(String name)
	{
		var instance = PetShopDemoPackage.eINSTANCE;
        PetShopDemoFactory factory = PetShopDemoFactory.eINSTANCE;
		var offer = factory.createOffer();
		return offer;
	}

}
