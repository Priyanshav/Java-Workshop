class Multi extends Thread{
    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println("Value is " +i);
        }
    }

    public static void main(String[] args){
        Multi t1 = new Multi();
        t1.start();
    }
}