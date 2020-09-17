package com.algorithm.base.entity;

import lombok.Data;

/**
 * @author wangzhen
 * @date 2020/9/17
 */
@Data
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
