public class MatrixCalc {
    public static void main(String[] args) {
        Matrix A = Matrix.ranMat(3, 3, 1, 100);
        Matrix B = Matrix.ranMat(3, 3, 1, 100);
        
        outputMat("A:", A);
        outputMat("B:", B);
        outputMat("A+B:", A.mAdd(B));
        outputMat("A-B:", A.mSub(B));
        outputMat("AB:", A.mMult(B));
    }

    public static void outputMat(String str, Matrix M) { System.out.println(str); M.print(); System.out.println(); }
}
