package com.baeldung.aspectj;

import com.baeldung.aspectj.SecuredMethod;
import org.junit.Test;

public class SecuredMethodTest {
    @Test
    public void testMethod() throws Exception {
        SecuredMethod service = new SecuredMethod();
        service.unlockedMethod();
        service.lockedMethod();
    }
}