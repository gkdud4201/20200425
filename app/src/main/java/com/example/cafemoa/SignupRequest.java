package com.example.cafemoa;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SignupRequest extends StringRequest {
    //서버 URL 설정(php 파일 연동)
    final static private String URL = "http://cafemoa.dothome.co.kr/Register.php";
    private Map<String, String> map;
    //private Map<String, String>parameters;

    public SignupRequest(String userID, String userPassword, String email, String phoneNumber, boolean userSort, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userName", email);
        map.put("phoneNumber", phoneNumber);
        map.put("userSort", userSort + "");
    }



    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}
