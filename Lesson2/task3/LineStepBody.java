
public class LineStepBody implements ILineStep {

	public LineStepBody() {
		System.out.println("Line for Body is ready");
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println("Part Body build.");
		return new Body();
	}

}
