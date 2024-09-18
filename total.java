public class total{
    public static void main(String args[]){
        double t=0.0,av;
        for(int i=1;i<args.length;i++){
            t+=Double.parseDouble(args[i]);
        }
        System.out.println("Name is "+args[0]);
        System.out.println("total marks "+t);
        av=t/3;
        System.out.println("average marks: "+av);
    } 
}