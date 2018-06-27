
public class Car implements IProduct {

	IProductPart productPartBody;
	IProductPart productPartChassis;
	IProductPart productPartEngine;

	public Car() {
		// According to diagram product parts should be as composition, BUT we have
		// methods that conflict with this idea as they give link to object (this means
		// this is aggregation)
	}

	public void installFirstPart(IProductPart aProductPart) {
		this.productPartBody = aProductPart;
		System.out.println("First product part installed.");
	}

	public void installSecondPart(IProductPart aProductPart) {
		this.productPartChassis = aProductPart;
		System.out.println("Second product part installed.");
	}

	public void installThirdPart(IProductPart aProductPart) {
		this.productPartEngine = aProductPart;
		System.out.println("Third product part installed.");
	}

}
