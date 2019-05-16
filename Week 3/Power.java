/*  Leetcode #50 
    Implement pow(x, n), which calculates x raised to the power n (x^n).
*/

//Passes 291/304 Test cases
public double myPow(double x, int n) {
    if (n == 0) {
        return 1;
    }
    if (n == 1) {
        return x; 
    }
    if (n > 1) {
        return x * myPow(x, n - 1); 
    }
    if (n == -1) {
        return 1 / x; 
    } 
    if (n < -1) {
        return 1 / x * myPow(x, n + 1); 
    }
    return 0.0; 
}

//Also passes 291/304 Test Cases
public double myPow(double x, int n) {
    if (n == 0) {
        return 1; 
    }
    if (n == 1) {
        return x;  
    }
    double[] arr = new double[Math.abs(n)];
    if (n > 1) {
        arr[0] = x; 
    } else {
        arr[0] = 1 / x; 
    }
    for (int i = 1; i < arr.length; i++) {
        if (n > 1) {
            arr[i] = x * arr[i - 1]; 
        } else {
            arr[i] = 1 / x * arr[i - 1]; 
        }
    }
    return arr[arr.length - 1]; 
}
