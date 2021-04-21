package me.zhyd.justauth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hdw
 * @version 1.0.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private int code;
    private String msg;

    public Response(int code, String msg) {

    }

    public static Response error(String msg) {
        return new Response(500, msg);
    }

    public static Response success(String msg) {
        return new Response(200, msg);
    }
}
