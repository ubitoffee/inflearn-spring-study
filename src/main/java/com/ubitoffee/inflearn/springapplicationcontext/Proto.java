package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

// Thread-Safe 하지 않네
@Component @Scope(value = "prototype")
public class Proto {

    @Autowired
    Single single;
}
