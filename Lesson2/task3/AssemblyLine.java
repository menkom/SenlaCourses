
public class AssemblyLine implements IAssemblyLine {

	ILineStep lineStepBody;
	ILineStep lineStepChassis;
	ILineStep lineStepEngine;

	@Override
	public IProduct assembleProduct(IProduct aProduct) {
		System.out.println("Installation process started.");

		if (lineStepBody != null) {
			aProduct.installFirstPart(lineStepBody.buildProductPart());
		}

		if (lineStepChassis != null) {
			aProduct.installSecondPart(lineStepChassis.buildProductPart());
		}

		if (lineStepEngine != null) {
			aProduct.installThirdPart(lineStepEngine.buildProductPart());
		}
		System.out.println("Installation process finished.");

		return aProduct;
	}

	public AssemblyLine(ILineStep lineStepBody, ILineStep lineStepChassis, ILineStep lineStepEngine) {
		this.lineStepBody = lineStepBody;
		this.lineStepChassis = lineStepChassis;
		this.lineStepEngine = lineStepEngine;
		System.out.println("Assemble line powered on.");
	}

}
