
public class LineStepChassis implements ILineStep {

	public LineStepChassis() {
		System.out.println("Line for Chassis is ready");
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println("Part Chassis build.");
		return new Chassis();
	}

}
