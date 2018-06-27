
public class LineStepEngine implements ILineStep {

	public LineStepEngine() {
		System.out.println("Line for Engine is ready");
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println("Part Engine build.");
		return new Engine();
	}

}
