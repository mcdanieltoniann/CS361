public class innermostoutermost {
    public static int evaluation(int a, int b) {
        if (a == 0){
            return 0;
        }
        else {
            return evaluation(a - 1, evaluation(a, b));
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluation(1,1));
        
    }
}