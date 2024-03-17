class Solution {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int maxPrime=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j || i+j== nums.length-1){
                    if(isPrime(nums[i][j])) {
                        if(maxPrime<nums[i][j]) maxPrime=nums[i][j];
                        flag=true;
                    }
                }
            }
        }
        return (flag==true ? maxPrime : 0) ;
    }
}