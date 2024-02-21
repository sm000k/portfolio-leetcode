from typing import List

# https://leetcode.com/problems/missing-number/description/
def missingNumber(nums: List[int]) -> int:
    nums.sort()
    for i in range(len(nums) ):
        if i != nums[i] :
            return i
    return len(nums)


def unit_test(input: List[int], expected: int) -> bool:
    return missingNumber(input) == expected


if __name__ == "__main__":
    n = [3, 0, 1]
    print(unit_test(n, 2))

    n = [0, 1]
    print(unit_test(n, 2))
