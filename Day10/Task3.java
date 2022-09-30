package JavaTask.Day10;

public class Task3 {
    public static void main(String[] args) {
        String str= "my name is dev";

        String a[] = str.split(" ");

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
