package com.ts.api.service.impl;

import com.ts.api.service.ICodeService;
import com.ts.api.service.IDemoService;

/**
 * 服务测试
 * @author: Owen Jia
 * @time: 2018/11/26 15:09
 */
public class DemoServiceImpl implements IDemoService, ICodeService {

    @Override
    public void justForTest(int code) {
        System.out.println("i am a test code of api. code=" + code);
    }

    @Override
    public boolean sendPhoneCode(String phoneNo) {
        System.out.println("i am a test api<sendPhoneCode>. phoneNo=" + phoneNo);
        return true;
    }
}
