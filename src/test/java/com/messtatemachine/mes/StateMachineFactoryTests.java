package com.messtatemachine.mes;

import com.messtatemachine.mes.entity.ProcessEventEnum;
import com.messtatemachine.mes.entity.ProcessStateEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

/**
 * @author `<a href="mailto:qiang.wang@1020@gmail.com">qiang</a>`
 * @date 2020-11-19
 * @description :
 */
@SpringBootTest
public class StateMachineFactoryTests {

    @Autowired
    StateMachineFactory<ProcessStateEnum, ProcessEventEnum> factory;
    @Test
    public void testFactory(){
        StateMachine<ProcessStateEnum, ProcessEventEnum> barcodeMachine = factory.getStateMachine("barcode");
        System.out.println("barcodeMachine： "+barcodeMachine);
        System.out.println("barcodeMachine.getId():"+barcodeMachine.getId());
        StateMachine<ProcessStateEnum, ProcessEventEnum> barcodeMachine2 = factory.getStateMachine("barcode");
        System.out.println("barcodeMachine2： "+barcodeMachine2);

        System.out.println("barcodeMachine2.getId():"+barcodeMachine2.getId());
//        assert(barcodeMachine.equals(barcodeMachine2));

    }
}
