public class MirrorLeftPyramid {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the number of rows in the pyramid
        
        printMirrorLeftPyramid(rows, 1);
    }
    
    public static void printMirrorLeftPyramid(int totalRows, int currentRow) {
        if (currentRow > totalRows) {
            return;
        }
        
        printSpaces(totalRows - currentRow);
        printAsterisks(currentRow);
        System.out.println();
        
        printMirrorLeftPyramid(totalRows, currentRow + 1);
    }
    
    public static void printSpaces(int count) {
        if (count > 0) {
            System.out.print(" ");
            printSpaces(count - 1);
        }
    }
    
    public static void printAsterisks(int count) {
        if (count > 0) {
            System.out.print("*");
            printAsterisks(count - 1);
        }
    }
}

