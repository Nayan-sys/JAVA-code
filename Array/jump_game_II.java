public class jump_game_II {
    
        public int jump(int[] nums) {
            int jumps = 0, currentEnd = 0, farthest = 0;
    
            for (int i = 0; i < nums.length - 1; i++) {
                
                int reach = i + nums[i];
                if (reach > farthest) {
                    farthest = reach;
                }
    
                if (i == currentEnd) {
                    jumps++;
                    currentEnd = farthest;
    
                    
                    if (currentEnd >= nums.length - 1) {
                        break;
                    }
                }
            }
    
            return jumps;
        }
    }
    

