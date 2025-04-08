public class remove_duplicate {
    
    
        public static void removeElement(int[] nums, int val) {
            int k=0;
            for(int i=0;i<nums.length;i++){
                
                if(nums[i]==val){
                    continue;
                
                }
                System.out.print(nums[i]+" ");
                }
        }
        public static void main(String[] args) {
            int nums[]={0,1,2,2,3,0,4,2};
            removeElement(nums,3);
        }
    }

