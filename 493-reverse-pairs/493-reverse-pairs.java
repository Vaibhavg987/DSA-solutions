class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int[] arr,int left,int right){
        if(left>=right) return 0;
        int mid = left + (right-left)/2;
        int inv = mergeSort(arr,left,mid);
        inv+=mergeSort(arr,mid+1,right);
        inv+=merge(arr,left,mid,right);
        
        return inv;
    }
    public int merge(int[] arr,int left,int mid,int right){
        int inv=0;
        int j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && arr[i] > 2*(long)arr[j])
                j++;
            inv+=(j-(mid+1));
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int i=left,k=mid+1;
        while(i<=mid && k<=right){
            if(arr[i]<=arr[k]){
                temp.add(arr[i++]);
            }else{
                temp.add(arr[k++]);
            }
        }
        while(i<=mid){
            temp.add(arr[i++]);
        }
        while(k<=right){
            temp.add(arr[k++]);
        }
        for(int m=left;m<=right;m++){
            arr[m] = temp.get(m-left);
        }
        return inv;
    }
}