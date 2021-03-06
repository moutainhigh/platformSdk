package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserDetailReq {

    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID
    private String dept_no;
    private String org_no;


}
