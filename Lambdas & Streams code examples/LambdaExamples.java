package RelationShipBetweenLamdasAndStreams;

interface GreetingService {
    void greet(String message);
}

/*class LambdaExamples implements  GreetingService {
    @Override
   public void greet(String message) {
      System.out.println ("Hello, " + message)
       }*/


class Main {

    public static void main(String[] args) {
         /*lambdaExamples lambdaExamples = new LambdaExamples();
        lambdaExamples.greet("World");*/

        GreetingService greetingService = message -> System.out.println("Hello, " + message);
        greetingService.greet("World");

    }
}


