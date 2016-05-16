package com.example.user.studentdatamanagementsystem;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user-pc on 14/5/2016.
 */
public class DeleteStudentRequest extends StringRequest{

    private static final String DELETE_STUDENT_REQUEST_URL = "http://clover.comli.com/delete.php";
    private Map<String, String> params;

    public DeleteStudentRequest(String sID,  Response.Listener<String> listener){
        super(Method.POST, DELETE_STUDENT_REQUEST_URL, listener, null);
        params  = new HashMap<>();
        params.put("sID", sID);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
