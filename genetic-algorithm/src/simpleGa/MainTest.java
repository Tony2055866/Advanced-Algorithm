package simpleGa;

public class MainTest {
	public static void main(String[] args) {

		// 选择一个期望的基因序列。这个是由自己任意定
		FitnessCalc
				.setSolution("1111000000000000000000000000000000000000000000000000000000001111");

		// 初始化一个种群
		Population myPop = new Population(50, true);

		// 不段迭代，进行进化操作。 直到找到期望的基因序列
		int generationCount = 0;
		while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
			generationCount++;
			System.out.println("Generation: " + generationCount + " Fittest: "
					+ myPop.getFittest().getFitness());
			myPop = Algorithm.evolvePopulation(myPop);
		}
		System.out.println("Solution found!");
		System.out.println("Generation: " + generationCount);
		System.out.println("Final Fittest Genes:");
		System.out.println(myPop.getFittest());

	}
}
