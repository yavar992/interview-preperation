package interviewprep.ConceptsThatNotCoveredYet;

public class PatternQuestion {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        solidrectangle(4);
        reverse_half_pyramid(5);
        invert_half_pyramid(5);
        invert_half(5);
        hollow_rectangle(4,5);
        adding_numberPattern(5);
        innerLoopIncrement(5);
        reevrse_halfnumber_pyramid(5);
        reverseHalfPyramid(5);
        halfpyramidinfromof0and1(5);
        halfPyramidInFormatOf0And1(5);
        rectangle(5);
        square(5);
        decrrasinghalfpyramid(5);
        reverseNumberOrderHalfPyramid(5);
        reverse_number_half_reverse_pyramid(5);
        reverseHalfNumberPyramid(5);
        vertical_count(5);
        verticalIncrement(6);
        horizontalIncrementPyramid(5);
        singleNumber(5);
        singleReverseNumber(5);
        binaryNumberSquare(5);
        binaryNumber(5);
        rhombus(5);
        rightRhombus(5);
        practice(5);
        practice2(5);
        pyramid(5);
        pyramidByTriangle(5);
        sameNumberPyramid(5);
        palindromePyramid(5);
        palindromePyramidPattern(5);
        pascalTriangle(5);
        diamond(5);
        diamondPyramid(5);
        diamondStarPatter(5);
        pascal_traingle(5);
        hollow_rhombus(5);
        reverse_halfpyrmid(5);
    }

    //1
    //1 2
    //1 2 3
    //1 2 3 4
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Rectangle
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void solidrectangle(int n){
        for (int row = 1; row <=n; row++) {
            for (int cols=1;cols<=n+1; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void reverse_half_pyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void invert_half_pyramid(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols =1; cols<=n-row; cols++){
                System.out.print(" ");
            }

            for (int cols = 1; cols <=row; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //invert_half
    public static void invert_half(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //HOLLOW RECTANGLE
    public static void hollow_rectangle(int rows , int cols){
        int n =rows;
        int m = cols;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void adding_numberPattern(int n){
        int ans = 1;
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(cols+ " ");
                ans++;
            }
            System.out.println();
        }
    }
    public static void innerLoopIncrement(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void reevrse_halfnumber_pyramid(int n){
        for (int row = 1; row <=n ; row++) {
            for (int cols =1; cols<=n-row+1; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    public static  void reverseHalfPyramid(int n){
        for (int i = n; i>=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void halfpyramidinfromof0and1(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                int sum = rows+cols;
                if (sum%2==0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void halfPyramidInFormatOf0And1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                int sum = i+j;
                if (sum%2==0){
                    System.out.print(1 + " ");
                }else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
    static void rectangle(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 0; cols <n+1 ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void square(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("SQUARE  " );
            }
            System.out.println();
        }
    }

    static void decrrasinghalfpyramid(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = rows; cols >=1 ; cols--) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    public static void reverseNumberOrderHalfPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j>=1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void reverse_number_half_reverse_pyramid(int n){
        for (int rows = n; rows >=1 ; rows--) {
            for (int cols = rows; cols>=1 ; cols--) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    public static void reverseHalfNumberPyramid(int n){
        for (int i = n; i>=1 ; i--) {
            for (int j = i; j>=1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void vertical_count(int n){
        for (int rows = 1; rows <=n ; rows++) {
            int ans =rows;
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(ans+" ");
                ans =ans+n-cols;
            }
            System.out.println();
        }
    }

    public static void verticalIncrement(int n){
        for (int i = 1; i <=n ; i++) {
            int ans = i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(ans + " ");
                ans = ans + n -j;
            }
            System.out.println();
        }
    }
    // horizontal no count
    static void horizontalIncrementPyramid(int n){
        int ans =0;
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows; cols++) {
                ans = ans+1;
                System.out.print(ans+ " ");
            }
            System.out.println();
        }
    }
    static void singleNumber(int n){
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(cols+ " ");
            }
            System.out.println();
        }
    }

    public static void singleReverseNumber(int n){
        for (int i = 1; i<=n; i++) {
            for (int j = n; j>=i ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void increment_number(int n){
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows+ " ");
            }
            System.out.println();
        }
    }

    static void binaryNumber(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols =1; cols <=n ; cols++) {
                int sum  = rows+cols;
                if (sum%2==0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void binaryNumberSquare(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                int sum = i+j;
                if (sum%2==0){
                    System.out.print(1 + " ");
                }else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    static void rhombus(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=n-rows ; cols++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols <=n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightRhombus(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols < rows; cols++) {
                System.out.print("   "); // Three spaces for each space
            }
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void practice(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    *
//   **
//  ***
// ****
//*****

    public static void  practice2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pyramid(int n){
        //outer loop
        for (int rows = 1; rows <=n ; rows++) {
            //print spaces
            for (int space = 1; space <n-rows ; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
    public static void sameNumberPyramid(int n){
        //outer loop
        for (int i = 1; i <=n ; i++) {
            //print space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static void pyramidByTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void palindromePyramid(int n){
        /// outer loop
        for (int rows = 1; rows <=n ; rows++) {
            ///print space
            for (int space = 1; space <=n-rows ; space++) {
                System.out.print(" ");
            }
            // for i to 1
            for (int cols = rows; cols>=1 ; cols--) {
                System.out.print(cols);
            }
            // for 2 to i
            for (int cols = 2; cols <=rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    public static void palindromePyramidPattern(int n){
        //outer loop
        for (int i = 1; i <=n ; i++) {
            //innr loop for space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //inner loop for star printing
            for (int j = i; j>=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pascalTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i =1; i<=n ; i++) {
            //space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <2*n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPyramid (int n) {
        //outer loop
        for (int rows = 1; rows <= n; rows++) {
            //print spaces
            for (int space = 1; space < n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
        //inverted half
        for (int rows = n; rows >=1 ; rows--) {
            //print spaces
            for (int space = 1; space <n-rows ; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }

    public static void diamondStarPatter(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //invert half here
        for (int i = 5; i>=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
    //diamond number problems

    //pascal traingle
    static void pascal_traingle(int n){
        for (int i = 1; i <=n ; i++) {
            //space
            int ans=1;
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(ans+ " ");
                ans = ans+i;
            }
            System.out.println();
        }
    }

    static void hollow_rhombus(int n){
        for (int i =1; i <=n ; i++) {
            //for space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            // for the firdt and last row
            if (i==1 || i==n)
                for (int j = 1; j <=n ; j++) {
                    System.out.print("* ");
                }
            else{
                for (int k = 1; k <=n ; k++) {
                    if (k==1 || k==n){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }

            }

            System.out.println();
        }
    }

    static void reverse_halfpyrmid(int n){
        // i to n
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for n-i to 1
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}