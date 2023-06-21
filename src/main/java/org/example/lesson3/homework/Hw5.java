package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutations(nums);
        System.out.println(result);

    }

    /**
     * @apiNote при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
     * @param nums Входной массив
     * @return result
     */
    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutations(nums, new ArrayList<Integer>(), result);
        return result;
    }

    private static void permutations(int[] nums, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!permutation.contains(nums[i])) {
                permutation.add(nums[i]);
                permutations(nums, permutation, result);
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
