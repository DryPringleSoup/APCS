import java.util.Arrays;

public class Vector {
    private int[] entries;
    final int dim;

    public Vector(int... entries) {
        this.entries = entries;
        this.dim = entries.length;
    }
    
    // generates a zero vector with given dimension
    public Vector(int dim) {
        this.entries = new int[dim];
        this.dim = dim;
    }
    
    // generates a vector with random entries within a given range [start, end)
    public static Vector ranVec(int dim, int start, int end) {
        int[] nums = new int[dim];
        for (int i = 0; i < dim; i++) { nums[i] = (int) (Math.random()*(end-start+1))+start; }

        return new Vector(nums);
    }

    // string should be formatted like "a,b,c,...,z"
    public static Vector parse2Vec(String strVec) {
        if (strVec.equals("")) strVec = "0";
        String[] strNums = strVec.split(",");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(strNums[i]);
        
        return new Vector(nums);
    }

    public static int dotProd(Vector v, Vector w) {
        if (v.dim != w.dim) throw new IllegalArgumentException("Vector dimensions don't match");
        int dProd = 0;
        for (int i = 1; i <= v.dim; i++) dProd += v.getEntry(i)*w.getEntry(i);
        return dProd;
    }

    public static Vector hadProd(Vector v, Vector w) { // Hadamard Product
        if (v.dim != w.dim) throw new IllegalArgumentException("Vector dimensions don't match");
        Vector hProd = new Vector(v.dim);
        for (int i = 1; i <= v.dim; i++) hProd.setEntry(i, v.getEntry(i)*w.getEntry(i));
        return hProd;
    }

    public Vector sMult(int s) { // scalar multiplicatiom
        Vector v = new Vector(dim);
        for (int i = 1; i <= dim; i++) v.setEntry(i, entries[i-1]*s);
        return v;
    }

    public Vector vAdd(Vector w) { // vector addition
        Vector v = new Vector(dim);
        for (int i = 1; i <= dim; i++) v.setEntry(i, entries[i-1]+w.getEntry(i));
        return v;
    }

    // vector subtraction
    public Vector vSub(Vector w) { return this.vAdd(w.sMult(-1)); }

    // 1-based indexing because its the standard way to notate matrices and vectors
    public int getEntry(int row) { return entries[row-1]; }

    public void setEntry(int row, int num) { entries[row-1] = num; }

    public Vector copy() { return new Vector(entries.clone()); }

    public String toString() {
        String str = Arrays.toString(entries);
        // just changes the square brackets to parenthesises
        return "("+str.substring(1,str.length()-1)+")";
    }
    
    public void print() { System.out.println(this.toString()); }
}