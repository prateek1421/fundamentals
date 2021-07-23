public class Test {

    public void print(Integer obj){
        System.out.println("Print Object");
    }
    public void print(int str){
        System.out.println("Print String");
    }

    public static void main(String args[]){
        Test t = new Test();
        t.print(5);
    }
}
