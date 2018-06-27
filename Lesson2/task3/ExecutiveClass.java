
public class ExecutiveClass {

	public static void main(String[] args) {
		System.out.println("--Process started.--");
		LineStepBody lineStepBody = new LineStepBody();
		LineStepChassis lineStepChassis = new LineStepChassis();
		LineStepEngine lineStepEngine = new LineStepEngine();

		AssemblyLine assembleLine = new AssemblyLine(lineStepBody, lineStepChassis, lineStepEngine);

		assembleLine.assembleProduct(new Car());
		System.out.println("--Process finished.--");

	}

}
