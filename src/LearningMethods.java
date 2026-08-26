public class LearningMethods {
    public int simpleAddition(int a, int b) {
        int sum = a + b;
        return sum;
    }

//    public void main(String[] args) {
//        int sum = simpleAddition(3,4);  *** To make this work you need to create an instance
//        System.out.println(sum);             so java has something stored in memory
//    }
//}

       public static void main(String[] args) {
        LearningMethods instance  = new LearningMethods(); // Create an instance that can be used
        int sum = instance.simpleAddition(3,4);
        System.out.println(sum);
    }
}
