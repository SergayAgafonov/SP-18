class AnimalThread extends Thread{
    String animal;
    int priority;
    AnimalThread(String name, int priority) {
        Thread animal = new Thread(this.animal = name);
        animal.setPriority(this.priority = priority);
    }
    @Override
    public void run(){
        int i;
        for (i = 1; i <= 21; i++){
            try{
                Thread.sleep((long)(Math.random() * 600));
                System.out.println(animal + " пробежал(-а) " + i + " метров");

            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println(animal + " финишировал(-а).");
    }
}

class main18{
    public static void main(String[] args){
        AnimalThread rabbit = new AnimalThread("Заяц", 1);
        AnimalThread turtle = new AnimalThread("Черепаха", 5);
        rabbit.start();
        turtle.start();
    }
}