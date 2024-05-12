class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        int res=-1;
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],i);
            }
           
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])>1){
                res=i+1;
                break;
            }
        }
        return res;
    }
}
