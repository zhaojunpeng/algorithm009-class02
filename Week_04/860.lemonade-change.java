class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills == null || bills.length <= 0){
            return false;
        }
        int s5 = 0, s10 = 0;
        for(int bill : bills){
            switch(bill){
                case 5:{
                    s5++;
                    continue;
                }
                case 10:{
                    if(s5 > 0){
                        s5--;
                        s10++;
                        continue;
                    }
                    return false;
                }
                case 20:{
                    if(s5 > 0 && s10 > 0)
                    {
                        s5--;
                        s10--;
                        continue;
                    }
                    if(s5 >= 3){
                        s5 -= 3;
                        continue;
                    }
                    return false;
                }
                default:
                    return false;
            }
        }
        return true;
    }
}