package com.hmk.crmdoem.service.impl;

import com.hmk.crmdoem.entity.po.SysUser;
import com.hmk.crmdoem.mappers.SysUserMapper;
import com.hmk.crmdoem.service.SysUserService;
import com.hmk.crmdoem.service.TokenService;
import com.hmk.crmdoem.utils.RedisService;
import com.hmk.crmdoem.utils.TokenUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("TokenService")
public class TokenServiceImpl implements TokenService {

    @Resource
    SysUserService sysUserService;

    @Resource
    RedisService redisService;
    @Override
    public String updateToken(String email) {
        SysUser sysUser = sysUserService.selectByUserEmail(email);
        Map<String,Object> map=new HashMap<>();
        if (sysUser!=null){
            if (sysUser.getUserId()!=null){
                map.put("id",sysUser.getUserId());
            }
            if (sysUser.getUserName()!=null){
                map.put("username",sysUser.getUserName());
            }
            if (sysUser.getUserEmail()!=null){
                map.put("email",sysUser.getUserEmail());
            }
            if (sysUser.getUserIco()!=null){
                map.put("ico",sysUser.getUserIco());
            }
            if (sysUser.getUserFlag()!=null){
                map.put("flag",sysUser.getUserFlag());
            }
            if (map.size()>0){
                String token = TokenUtil.sign(map);
                redisService.put(sysUser.getUserEmail(),token,60*24);
                return token;
            }
        }
        return null;
    }
}
