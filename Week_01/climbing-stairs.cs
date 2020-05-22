public class Solution {
    Dictionary<int, int> dict = new Dictionary<int, int>();
    public int ClimbStairs(int n) {
        if(n == 1)
        {
            return 1;
        }
        if(n == 2)
        {
            return 2;
        }
        if(dict.ContainsKey(n))
        {
            return dict[n]; 
        }
        else
        {
            int result  = ClimbStairs(n - 1) + ClimbStairs(n - 2);
            dict.Add(n, result);
            return result;
        }    
        
    }
}