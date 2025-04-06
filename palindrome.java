public class palindrome {
    
        public boolean isPalindrome(int x) {
            int r=0;
            int k=x;
            int i=0;
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            while(x>0){
                int digit=x%10;
                r=(r*10)+digit;
                x=x/10;
                i++;
            }
            if(r==k){
                return true;
            }else{
                return false;
            }
            
        }
    }

