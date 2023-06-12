public class MirrorInvertedHalfPyramid {

        public static void main(String[] args) {
            int rows = 5; // Change this value to adjust the number of rows in the pyramid
            
            printMirrorLeftPyramid(rows, 1);
        }
        
        public static void printMirrorLeftPyramid(int totalRows, int currentRow) {
            if (currentRow > totalRows) {
                return;
            }
            
            printAsterisks(currentRow);
            System.out.println();
            printMirrorLeftPyramid(totalRows, currentRow + 1);
            printAsterisks(currentRow);
            System.out.println();
        }
        
        public static void printAsterisks(int count) {
            if (count > 0) {
                System.out.print("*");
                printAsterisks(count - 1);
            }
        }
    }

