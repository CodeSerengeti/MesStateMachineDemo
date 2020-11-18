package com.messtatemachine.mes.command;


import com.messtatemachine.mes.entity.ProcessEventEnum;
import com.messtatemachine.mes.entity.ProcessStateEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.statemachine.StateMachine;

import javax.annotation.Resource;

public class StartupRunner implements CommandLineRunner {

    @Resource
    StateMachine<ProcessStateEnum, ProcessEventEnum> stateMachine;

    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        Thread.sleep(20);
        stateMachine.sendEvent(ProcessEventEnum.LOAD_PASS);
        Thread.sleep(20);
        stateMachine.sendEvent(ProcessEventEnum.CUT_PASS);
        Thread.sleep(20000);
        stateMachine.sendEvent(ProcessEventEnum.COAT_PASS);
        Thread.sleep(20000);
        stateMachine.sendEvent(ProcessEventEnum.EOL_PASS);
        Thread.sleep(20000);
        stateMachine.sendEvent(ProcessEventEnum.PACKAGE_PASS);

    }
}
