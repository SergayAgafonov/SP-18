public class ChickenOrEgg extends Thread{
    String name;
    int priority;

    public ChickenOrEgg (String name, int priority) {

        this.name = name;
        this.priority = priority;
    }
    @Override
    public  void run() {
        Thread.currentThread().setName(name);
        Thread.currentThread().setPriority(priority);
        for(int i = 1;i <= 10; i ++){
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ChickenOrEgg egg = new ChickenOrEgg("Яйцо", 5);
        ChickenOrEgg chicken = new ChickenOrEgg("Курица", 5);

        egg.start();
        chicken.start();
        while(true){
            egg.isAlive();
            chicken.isAlive();
            if(egg.isAlive() == false){
                System.out.println("Победила курица. Спор окончен.");
                break;
            }
            else if (chicken.isAlive() == false){
                System.out.println("Победило яйцо. Спор окончен.");
                break;
            }
        }
    }
}