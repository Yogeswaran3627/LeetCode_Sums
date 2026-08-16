class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        Set<Integer> m = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for (int x : nums)
        {
            if (m.contains(x)) l.add(x);
            else m.add(x);
        }
        return l;
    }
}