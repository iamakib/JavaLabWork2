package E25;

public class ConstructsRectangle {
        public static void main(String[] args) {
           int area = 42;
           int height1, width1;

           height1 = 1;
           width1 = area/height1;

           System.out.println("Height1 : " + height1 );
           System.out.println("Width1  : "  + width1);

           int perimeter = 42;
           int height2, width2;

           height2 = perimeter/4;
           width2 = perimeter/2  - height2;

            System.out.println("Height2 : " + height2 );
            System.out.println("Width2  : "  + width2);

        }
    }

