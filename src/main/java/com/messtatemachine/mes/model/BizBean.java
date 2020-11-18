package com.messtatemachine.mes.model;

import lombok.Data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;
import com.messtatemachine.mes.entity.ProcessStateEnum;

@WithStateMachine
@Data
@Slf4j
public class BizBean {

    /**
     * @see ProcessStateEnum
     */

    private String status = ProcessStateEnum.INIT.name();

    @OnTransition(source="INIT",target = "LOAD_PASS")
    public void loadPartPass() {
        log.info("Part is loaded into system successfully. target status:{}", ProcessStateEnum.LOAD_PASS.name());
        setStatus(ProcessStateEnum.LOAD_PASS.name());
    }

    @OnTransition(source="INIT",target = "LOAD_FAIL")
    public void loadPartFail() {
        log.info("Part is loaded failed. target status:{}", ProcessStateEnum.LOAD_FAIL.name());
        setStatus(ProcessStateEnum.LOAD_FAIL.name());
    }

    @OnTransition(source = "LOAD_PASS",target = "CUT_PASS")
    public void cutPartPass(){
        log.info("Part is cut successfully. target status:{}", ProcessStateEnum.CUT_PASS.name());
        setStatus(ProcessStateEnum.CUT_PASS.name());
    }

    @OnTransition(source = "LOAD_PASS",target = "CUT_FAIL")
    public void cutPartFail(){
        log.info("Part is cut failed. target status:{}", ProcessStateEnum.CUT_FAIL.name());
        setStatus(ProcessStateEnum.CUT_FAIL.name());
    }

    @OnTransition(source = "CUT_PASS",target = "COAT_PASS")
    public void coatPass(){
        log.info("Part is coated successfully. target status:{}", ProcessStateEnum.COAT_PASS.name());
        setStatus(ProcessStateEnum.COAT_PASS.name());
    }

    @OnTransition(source = "CUT_PASS",target = "COAT_FAIL")
    public void coatFail(){
        log.info("Part is coated failed. target status:{}", ProcessStateEnum.COAT_FAIL.name());
        setStatus(ProcessStateEnum.COAT_FAIL.name());
    }

    @OnTransition(source = "COAT_PASS",target = "EOL_PASS")
    public void eolPass(){
        log.info("End-of-Line test successfully. target status:{}", ProcessStateEnum.EOL_PASS.name());
        setStatus(ProcessStateEnum.EOL_PASS.name());
    }

    @OnTransition(source = "COAT_PASS",target = "EOL_FAIL")
    public void eolFail(){
        log.info("End-of-Line test failed. target status:{}", ProcessStateEnum.EOL_FAIL.name());
        setStatus(ProcessStateEnum.EOL_FAIL.name());
    }

    @OnTransition(source = "EOL_PASS",target = "PACKAGE_PASS")
    public void packagePass(){
        log.info("Packaging successfully. target status:{}", ProcessStateEnum.PACKAGE_PASS.name());
        setStatus(ProcessStateEnum.EOL_PASS.name());
    }

    @OnTransition(source = "EOL_PASS",target = "PACKAGE_FAIL")
    public void packageFail(){
        log.info("End-of-Line test failed. target status:{}", ProcessStateEnum.PACKAGE_FAIL.name());
        setStatus(ProcessStateEnum.PACKAGE_FAIL.name());
    }

    @OnTransition(source ="COAT_FAIL")
    public void fromCoatFail(){
        log.info("Coating has failed, no further station");
    }

}
