package com.algorithm.base.entity;

import lombok.Data;

/**
 * @author: wangzhen
 * @Date: 2020/9/17
 */
@Data
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}
