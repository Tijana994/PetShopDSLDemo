package petShopDemo;
import com.petshop.annotations.OfferCreatedAnnotation;

public class LokiPetShop {
	
	public String OfferName;
	
	@OfferCreatedAnnotation(name = "OfferName")
	public void createOffer(String name)
	{
		OfferName = name;
	}

}
