class palindrome {
    public boolean isPalindrome(int x) {
        
        if(x<0)
        return false;
        
        int divisor=1;
        while(x/divisor >=10){
            divisor *=10;
        }
        
        while(x!=0){
            
            int first=x/divisor;
            int last=x%10;
            
            if(first != last){
                return false;
            }
            
            x=(x%divisor)/10;
            
            divisor /= 100;
        }
            
        return true;
            
        }
    }

