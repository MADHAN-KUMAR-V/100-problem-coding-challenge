class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int max=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,i);
            }
        }
        for(int i=0;i<size;i++){
            if(map.get(a[i])>size/2){
                max=i;
            }
        }
        return max;
    }
}
