

/*URL: https://leetcode.com/problems/contains-duplicate/
* Author: NeetCode
* Solution By: Yusuf AbdulAkeem
*/
package com.int3ll3kt.neetcodequestions.blind75;
import java.util.HashSet;
import java.util.Set;


public class ContainsDuplicateI {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> newSet = new HashSet<>();
            for (int num : nums) {
                if (!newSet.add(num)) {
                    return true;
                }
            }
            return false;
        }



    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 4, 5, 6};
        ContainsDuplicateI solution = new ContainsDuplicateI();
        System.out.println(solution.containsDuplicate(nums));

    }
}

