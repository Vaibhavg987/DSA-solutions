class Solution {
    public static List<List<Integer>> sum4(int[] nums,int target){
        List<List<Integer>> l = new ArrayList<>();
        int n=nums.length;
		///The three loop costs O(n^3) and binary search costs O(logn)
        for(int i=0;i<n-3;i++){
            int a = nums[i];
            for(int j=i+1;j<n-2;j++){
                int b = nums[j];
                for(int k=j+1;k<n-1;k++){
                    List<Integer> l1 = new ArrayList<Integer>();
                    int c= nums[k];
                    int x=target-(a+b+c);
                    if(binarySearch(nums,k+1,n-1,x)){
                        l1.add(a);
                        l1.add(b);
                        l1.add(c);
                        l1.add(x);
						///checking whether the list contains Duplicates
                        if(l.contains(l1)) continue;
                        else l.add(new ArrayList<Integer>(l1));;
                        // System.out.println(a+" "+b+" "+c+" "+x);
                    }
                }
            }
        }
        return l;
    }
    public static boolean binarySearch(int[] nums,int low,int high,int Element){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==Element){
                return true;
            } 
            else if(Element>nums[mid]){
                low=mid+1;
            }
            else if(Element<nums[mid]){
                high=mid-1;
            }
        }
        // System.out.println(Element+" "+nums[mid]);
        return false;
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
		///sorting costs o(nlogn)
        return sum4(nums,target);
    }
}