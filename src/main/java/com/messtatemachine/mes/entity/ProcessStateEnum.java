package com.messtatemachine.mes.entity;

/**
 * @author `<a href="mailto:qiang.wang@1020@gmail.com">qiang</a>`
 * @date 2020-11-15
 * @description :
 */
public enum ProcessStateEnum {
        INIT("init",0),
        LOAD_PASS("load_pass",1),
        LOAD_FAIL("load_fail",2),
    CUT_PASS("load_pass",3),
    CUT_FAIL("load_fail",4),
    COAT_PASS("load_pass",5),
    COAT_FAIL("load_fail",6),
    EOL_PASS("load_pass",7),
    EOL_FAIL("load_fail",8),
    PACKAGE_PASS("load_pass",9),
    PACKAGE_FAIL("load_fail",10);



    private Integer code;
    private String name;

    ProcessStateEnum(String name, Integer code){
        this.name=name;
        this.code=code;
    }//constructor
}
