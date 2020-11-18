package com.messtatemachine.mes.statemachine;

import com.messtatemachine.mes.entity.ProcessEventEnum;
import com.messtatemachine.mes.entity.ProcessStateEnum;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;

import java.util.EnumSet;

/**
 * @author `<a href="mailto:qiang.wang@1020@gmail.com">qiang</a>`
 * @date 2020-11-16
 * @description :
 */
/*public class StateMachineFactory extends EnumStateMachineConfigurerAdapter<ProcessStateEnum, ProcessEventEnum> {
    @Override
    public void configure(StateMachineStateConfigurer<ProcessStateEnum, ProcessEventEnum> states) throws Exception {
//        super.configure(states);
        states.withStates()
                .initial(ProcessStateEnum.INIT)
//                .end(ProcessStateEnum.CUT_PASS)
                .states(EnumSet.allOf(ProcessStateEnum.class));
    }

}*/
