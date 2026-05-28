package com.example.dsa_practice.utility;

public class Combinatorics {

    public static final int MOD = (int)1e9+7;

    public int findCombination(int n, int r){
        if(r > n) return 0;
        r = Math.min(r, n-r);
        long result = 1;
        for(int i = 1; i <= r; i++){
            result = (result * (n - i + 1))% MOD;
            result = (result * power(i, MOD - 2))%MOD;
        }
        return (int)result;
    }
    public long power(int base, int exponent){
        if(exponent == 0) return 1;
        long half = power(base, exponent/2);
        long result = (half * half)%MOD;
        if(exponent % 2 == 1){
            result = (result * base)%MOD;
        }
        return result;
    }
}
