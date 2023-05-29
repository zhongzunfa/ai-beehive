package cn.beehive.cell.base.hander.strategy;

import java.math.BigDecimal;

/**
 * @author hncboy
 * @date 2023/5/29
 * 数据包装
 */
public class DataWrapper {

    private final Object data;

    public DataWrapper(Object data) {
        this.data = data;
    }

    /**
     * 将 data 转为 String
     *
     * @return String
     */
    public BigDecimal asBigDecimal() {
        if (data instanceof BigDecimal) {
            return (BigDecimal) data;
        }
        if (data instanceof String) {
            return new BigDecimal(String.valueOf(data));
        }
        throw new UnsupportedOperationException("Cannot convert data to BigDecimal.");
    }

    /**
     * 将 data 转为 int
     *
     * @return int
     */
    public int asInt() {
        if (data instanceof Integer) {
            return (int) data;
        }
        if (data instanceof String) {
            return Integer.parseInt((String) data);
        }
        throw new UnsupportedOperationException("Cannot convert data to int.");
    }

    /**
     * 将 data 转为 boolean
     *
     * @return boolean
     */
    public boolean asBoolean() {
        if (data instanceof Boolean) {
            return (boolean) data;
        }
        if (data instanceof String) {
            return Boolean.parseBoolean((String) data);
        }
        throw new UnsupportedOperationException("Cannot convert data to boolean.");
    }

    /**
     * 将 data 转为 String
     *
     * @return String
     */
    public String asString() {
        return String.valueOf(data);
    }
}
