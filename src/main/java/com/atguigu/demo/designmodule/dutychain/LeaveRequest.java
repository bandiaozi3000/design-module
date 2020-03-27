package com.atguigu.demo.designmodule.dutychain;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LeaveRequest {
    /**天数*/
    private int leaveDays;

    /**姓名*/
    private String name;


}
