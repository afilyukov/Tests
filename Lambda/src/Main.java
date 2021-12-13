public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
      ProcessToInts<Integer, Integer> sumFunction = new ProcessToInts<Integer, Integer>() { //anonim
         @Override
          public int doSomethingWithInts(Integer i1, Integer i2) {
              System.out.println(i1 +i2);
               return i1 +i2;
           }
       };
       ProcessToInts<Integer, Integer> multFunction = new ProcessToInts<Integer, Integer>() { //anonim
           @Override
           public int doSomethingWithInts(Integer integer1, Integer integer2) {
               System.out.println(integer1*integer2);
               return integer1*integer2;
           }
       };
        new Main().processTwoNumbers(a, b, sumFunction);
        new Main().processTwoNumbers(a, b, multFunction);


//        Lambdas!!
        new Main().processTwoNumbers(a,b, (i1, i2) -> {
            System.out.println(i1+i2);
            return i1+i2;});

        new Main().processTwoNumbers(a,b, (i1, i2) -> {
            System.out.println(i1*i2);
            return i1+i2;});
    }

    private int sum(int a, int b){
        return a+b;
    }

    private int mult(int a, int b){
        return a*b;
    }

    public void processTwoNumbers(int a, int b, ProcessToInts<Integer,Integer> function){
        function.doSomethingWithInts(a,b);
    }
}
