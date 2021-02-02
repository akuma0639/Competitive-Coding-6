
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Logger {

    /** Initialize your data structure here. */
    HashMap<String,Integer> hash;
    public Logger() {
        hash=new HashMap<String,Integer>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(hash.containsKey(message)){
            //System.out.println(hash.get(message)+10);
            if(timestamp>=hash.get(message)+10){
                 hash.put(message,timestamp);
                return true;
            }else{
                return false;
            }
        }else{
            hash.put(message,timestamp);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
