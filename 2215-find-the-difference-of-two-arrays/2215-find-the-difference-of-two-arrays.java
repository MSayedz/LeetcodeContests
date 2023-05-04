class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = Arrays.stream(nums1)
            .boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2)
            .filter(n -> !s1.contains(n))
            .boxed().collect(Collectors.toSet());
        Arrays.stream(nums2).forEach(s1::remove);
        return Arrays.asList(new ArrayList<>(s1), new ArrayList<>(s2));
    }
}