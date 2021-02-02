// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    int count;
    public int countArrangement(int n) {
        count=0;
        boolean[] track=new boolean[n+1];
        helper(track,1,n);
        return count;
    }
    
    public void helper(boolean[] track,int index,int n){
        //base case
        if(index>n){
            count=count+1;
            return;
        }
        
        //action
        for(int i=1;i<=n;i++){
            if(!track[i] && (i%index==0 || index%i==0)){
                track[i]=true;
                helper(track,index+1,n);
                track[i]=false;
            }
        }
    }
}