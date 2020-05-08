package com.eleven.shiro.core.config.shiro;


import com.eleven.shiro.common.util.Encrypt;
import com.eleven.shiro.common.util.JwtUtil;
import com.eleven.shiro.core.config.jwt.JwtToken;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * @author Li Lin
 * @version 2017/9/25
 */
public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        JwtToken jwtToken = (JwtToken) token;
        Object accountCredentials = getCredentials(info);
        if (jwtToken.getPassword() != null) {
            Object tokenCredentials = Encrypt.md5(String.valueOf(
                    jwtToken.getPassword()) + jwtToken.getUsername());
            if (!accountCredentials.equals(tokenCredentials)) {
                throw new DisabledAccountException("密码不正确！");
            }
        } else {
            boolean verify = JwtUtil.verify(jwtToken.getToken(), jwtToken.getUsername(), accountCredentials.toString());
            if (!verify) {
                throw new DisabledAccountException("verifyFail");
            }
        }
        return true;
    }

}
