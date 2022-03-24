package webserver.controller;

import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import webserver.MyHttpRequest;
import webserver.MyHttpResponse;
import webserver.RequestHandler;

import java.util.Map;

public class SignUpController implements MyController{

    private static final Logger log = LoggerFactory.getLogger(RequestHandler.class);

    @Override
    public String process(MyHttpRequest request, MyHttpResponse response) {
        Map<String, String> paramMap = request.getParamMap();
        User user = new User(paramMap.get("userId"), paramMap.get("password"), paramMap.get("name"), paramMap.get("email"));
        log.info("user={}",user);

        return "index";
    }
}
