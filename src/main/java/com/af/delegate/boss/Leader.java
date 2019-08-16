package com.af.delegate.boss;

import java.util.HashMap;
import java.util.Map;

/**
 * leader分派工作
 */
public class Leader implements Employee {

    Map<String,Employee> map = new HashMap<String,Employee>();

    public Leader(){
        map.put("login",new EmployeeA());
        map.put("sql",new EmployeeB());
    }

    public void doing(String command) {
        map.get(command).doing(command);
    }
}
