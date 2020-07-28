package com.example.poetry.util;

public enum UnitConsEnum {
    RMB_YUAN("1", "元"),
    RMB_FEN("2", "分"),
    COUNT_TIME("10", "次"),
    TIME_MONTH("11", "月"),
    TIME_3_MONTH("12", "季度"),
    TIME_6_MONTH("13", "半年"),
    TIME_YEAR("14", "年"),
    ALL_LIFE("15", "终生");

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getDesc() {
        return desc;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

    private UnitConsEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public static String queryCode(String desc) {
        for (int i = 0; i < UnitConsEnum.values().length; i++) {
            UnitConsEnum m = UnitConsEnum.values()[i];
            if (m.getDesc().equals(desc)) {
                return m.getCode();
            }
        }
        return null;
    }


    public static String queryDesc(String code) {
        for (int i = 0; i < UnitConsEnum.values().length; i++) {
            UnitConsEnum m = UnitConsEnum.values()[i];
            if (m.getCode().equals(code)) {
                return m.getDesc();
            }
        }
        return null;
    }

}
