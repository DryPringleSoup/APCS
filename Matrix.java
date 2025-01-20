public class Matrix {
    private Vector[] rowVecs;
    final int rows;
    final int cols; 

    public Matrix(Vector... vecs) {
        for (Vector v : vecs) {
            if (vecs[0].dim != v.dim) throw new IllegalArgumentException("non-uniform row vector dimensions");
        }

        this.rowVecs = vecs;
        this.rows = vecs.length;
        this.cols = vecs[0].dim;
    }
    
    // generates a zero matrix with a given number of rows and columns
    public Matrix(int rows, int cols) {
        Vector[] vecs = new Vector[rows];
        for (int i = 0; i < rows; i++) vecs[i] = new Vector(cols);
        this.rowVecs = vecs;
        this.rows = rows;
        this.cols = cols;
    }
    
    // generates a identity matrix with a given dimension
    public Matrix(int dim) {
        Vector[] vecs = new Vector[dim];
        for (int i = 0; i < dim; i++) { 
            // puts a one on the matrix's down diagonal
            vecs[i] = new Vector(dim);
            vecs[i].setEntry(i+1, 1);
        }
        this.rowVecs = vecs;
        this.rows = dim;
        this.cols = dim;
    }

    // generates a vector with random entries within a given range [start, end)
    public static Matrix ranMat(int rows, int cols, int start, int end) {
        Vector[] vecs = new Vector[rows];
        for (int i = 0; i < rows; i++) vecs[i] = Vector.ranVec(cols, start, end);
        return new Matrix(vecs);
    }

    public static Matrix arr2Mat(int[]... arrs) {
        Vector[] vecs = new Vector[arrs.length];
        for (int i = 0; i < arrs.length; i++) vecs[i] = new Vector(arrs[i]);
        return new Matrix(vecs);
    }

    // string should be formatted like "a,b,c;d,e,f;...;x,y,z"
    public static Matrix parse2Mat(String strMat) {
        if (strMat.equals("")) strMat = "0";
        String[] strVecs = strMat.split(";");
        Vector[] vecs = new Vector[strVecs.length];
        for (int i = 0; i < vecs.length; i++) vecs[i] = Vector.parse2Vec(strVecs[i]);
        
        return new Matrix(vecs);
    }

    public Matrix transpose() {
        Vector[] vecs = new Vector[cols];
        for (int i = 1; i <= cols; i++) vecs[i] = this.getCol(i);
        return new Matrix(vecs);
    }

    public Matrix sMult(int s) { // scalar multiplicatiom
        Matrix M = new Matrix(rows, cols);
        for (int i = 1; i <= rows; i++) M.setRow(i, this.getRow(i).sMult(s));
        return M;
    }

    public Matrix mAdd(Matrix M) { // matrix addition
        if (rows != M.rows && cols != M.cols) throw new IllegalArgumentException("Can't add matricies with different dimensions");
        Matrix X = new Matrix(rows, cols);
        for (int i = 1; i <= rows; i++) X.setRow(i, this.getRow(i).vAdd(M.getRow(i)));
        return X;
    }

    // matrix subtraction
    public Matrix mSub(Matrix M) { return this.mAdd(M.sMult(-1)); }

    public Matrix mMult(Matrix M) { // matrix multiplication
        // if matrices A and B can be multiplied then the # of colums in A is the same as the # of rows in B
        if (cols != M.rows) throw new IllegalArgumentException("Matrices are incompatible for multiplication");
        Matrix X = new Matrix(rows, M.cols);
        // if AB = X then the entry (i,j) of X is the dot product of the i-th row of A and the j-th column of B
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= M.cols; j++) X.setEntry(i, j, Vector.dotProd(this.getRow(i), M.getCol(j)));
        }
        return X;
    }

    // 1-based indexing because its the standard way to notate matrices and vectors
    public int getEntry(int row, int col) { return rowVecs[row-1].getEntry(col); }

    public Vector getRow(int row) { return rowVecs[row-1]; }

    public Vector getCol(int col) {
        int[] nums = new int[rows];
        // say n = col, then this gets the n-th entry of each row to form the column
        for (int i = 0; i < rows; i++) nums[i] = rowVecs[i].getEntry(col);
        return new Vector(nums);
    }

    public void setEntry(int row, int col, int num) { rowVecs[row-1].setEntry(col,num); }

    public void setRow(int row, Vector v) {
        if (v.dim == cols) rowVecs[row-1] = v.copy();
        else throw new IllegalArgumentException("non-uniforn row vector dimensions");
        // throws error if v doesn't have the same row length as the matrix
    }

    public void setCol(int col, Vector v) {
        if (v.dim == rows) {
            // say n = col, then this sets the n-th entry of each row to form the column
            for (int i = 0; i < rows; i++) rowVecs[i].setEntry(col, v.getEntry(i+1));
        }
        else throw new IllegalArgumentException("non-uniforn column vector dimensions");
        // throws error if v doesn't have the same column height as the matrix
    }

    public Matrix copy() { 
        Vector[] vecs = new Vector[rows];
        // generates a copy of all the row vectors and makes a new matrix out of them
        for (int i = 0; i < rows; i++) vecs[i] = rowVecs[i].copy();
        return new Matrix(vecs);
    }

    public String toString() {
        String[] strVecs = new String[rows];
        // converts all vectors into their string representations
        for (int i = 0; i < rows; i++) strVecs[i] = rowVecs[i].toString();
        // since "(" gets added to the start all the strings get joined by a newline and a space to still appear as a block
        return "("+String.join("\n ", strVecs)+")";
    }

    public void print() { System.out.println(this.toString()); }
}