package com.messtatemachine.mes.entity;

/**
 * @author `<a href="mailto:qiang.wang@1020@gmail.com">qiang</a>`
 * @date 2020-11-15
 * @description :
 */
public enum ProcessEventEnum {
    LOAD_PASS("load_pass",1),
    LOAD_FAIL("load_fail",2),
    CUT_PASS("cut_pass",3),
    CUT_FAIL("cut_fail",4),
    COAT_PASS("coat_pass",5),
    COAT_FAIL("coat_fail",6),
    EOL_PASS("eol_pass",7),
    EOL_FAIL("eol_fail",8),
    PACKAGE_PASS("package_pass",9),
    PACKAGE_FAIL("package_fail",10);



    private Integer code;
    private String name;

    ProcessEventEnum(String name, Integer code){
        this.name=name;
        this.code=code;
    }//constructor

}
