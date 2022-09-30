package JavaTask.Day10;
// import javax.swing.*;
// import java.awt.*;

// public class circle extends JFrame {
   
//   public circle(){
//         setTitle("Drawing a Circle");
//         setSize(500, 500);
//         setVisible(true);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);

//     }

//     @Override
//     public void paint(Graphics g) {
//         Graphics2D g2d = (Graphics2D) g;
//         g2d.drawOval(150, 150, 100, 100);

//     }

//     public static void main(String[] args) {

//        new circle();

//     }
// }

public class  circle{

public static void main(String[] args) {
    for (int i = 0; i <= 7; i++) {
        for (int j = 0; j <= 7; j++) {
            if ( (j == 0 && i >= 2 && i<=4) || (i == 0 && j >= 2 && j<=4)
                    || (i == 6 && j>=2 && j <= 4) || (j == 7 &&  i >= 2 && i<=4)  || (i==1 && j==1 ) || (i==5 && j==1 )) {
                System.out.print(" * ");
            } else if((i==1 && j==6)){
                System.out.print(" *");
            } else if(((i==5 && j==6))){
                System.out.print(" * ");
             } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}