package simpleGa;

public class FitnessCalc {

    static byte[] solution = new byte[64];

    /* Public methods */
    // 设置候选结果为一个 byte array
    public static void setSolution(byte[] newSolution) {
        solution = newSolution;
    }

    // 就是把01 字符串转换为 01数组， 放在 solution中
    static void setSolution(String newSolution) {
        solution = new byte[newSolution.length()];
        // Loop through each character of our string and save it in our byte 
        for (int i = 0; i < newSolution.length(); i++) {
            String character = newSolution.substring(i, i + 1);
            if (character.contains("0") || character.contains("1")) {
                solution[i] = Byte.parseByte(character);
            } else {
                solution[i] = 0;
            }
        }
    }

    // 通过和solution比较 ，计算个体的适应值
    static int getFitness(Individual individual) {
        int fitness = 0;
        for (int i = 0; i < individual.size() && i < solution.length; i++) {
            if (individual.getGene(i) == solution[i]) {
                fitness++;
            }
        }
        return fitness;
    }
    
    //最优的适应值，即为基因序列的长度
    static int getMaxFitness() {
        int maxFitness = solution.length;
        return maxFitness;
    }
}