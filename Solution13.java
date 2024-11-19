/*
 * @Description:
 * 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 
 * 示例 2：
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 */
//添加了一行注释：我最喜欢debug辣！
class Solution13 {
    public void sortColors(int[] nums) {
        //思路：先将所有0移动到最前面，再将所有1移动到0的后面，自然形成顺序
        int n = nums.length;
        int ptr = 0;//标记最后一个不是待排序数的位置
        for (int i = 0; i < n; ++i) {//先将0移到最前面
            if (nums[i] == 0) {//如果是0，则交换到ptr标记的第一个不是0的位置
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {//然后将1移动到0的后面
            if (nums[i] == 1) {//如果是1，则交换到0后面第一个不是1的位置
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }
}
