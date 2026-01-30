public class Solution {
    public IList<IList<int>> CombinationSum2(int[] candidates, int target) {
        List<IList<int>> list = new List<IList<int>>();
        Array.Sort(candidates);
        CombinationSum(candidates, target, 0, list, new List<int>());
        return list;
    }

    private void CombinationSum(int[] nums, int target, int start, IList<IList<int>> list, List<int> prefix)
    {
        if(target == 0)
        {
            list.Add(new List<int>(prefix));
            return;
        }
        if(start>=nums.Length)
        {
            return;
        }
        for(int i = start; i<nums.Length; i++ )
        {
            if(target - nums[i] < 0)
            {
                return;
            }
            prefix.Add(nums[i]);
            CombinationSum(nums, target - nums[i], i+1, list, prefix);
            prefix.RemoveAt(prefix.Count-1);

            while(i<nums.Length-1 && nums[i] == nums[i+1])
            {
                i++;
            }
        }
    }
}