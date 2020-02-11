package com.perfree.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Service
public class TokenService {
	public String getToken() {
		String id="test";
		String sign="fastDfs2020";
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";
        
        token = JWT.create().withAudience(id).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(sign));
        return token;
    }
}
