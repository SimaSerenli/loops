public class Main {

    public static void main(String[] args) {
        //for loop
        for(int i=0;i<20;i+=2){
            System.out.println(i+"");
        }
        System.out.println("for loop end");
        //while loop
        int i=1;
        while(i<15){
            System.out.println(i);
            i+=3;
        }
        System.out.println("while loop end");
        //do-while loop
        int j=1;
        do{
            System.out.println(j);
            j+=3;
        }while(j<15);
        System.out.println("do/while loop end");
    }
}
