package top.srcrs.domain;

import java.util.List;

/**
 * 项目的配置类。
 * @author srcrs
 * @Time 2020-10-13
 */
public class Config {
    private static final Config CONFIG = new Config();
    /** 代表所需要投币的数量 */
    static private Integer coin;
    /** 送出即将过期的礼物 true 默认送出*/
    static private boolean gift;
    /** 要将银瓜子转换成硬币 true 默认转换*/
    static private boolean s2c;
    /** 自动使用 B 币卷 */
    static private String autoBiCoin;
    /** 用户设备的标识 */
    static private String platform;
    /** 投币给自定义的 up 主 */
    static private List<String> upList;
    /** 自动进行漫画签到任务 */
    static private boolean manga;

    public boolean isManga() {
        return manga;
    }

    public void setManga(boolean manga) {
        Config.manga = manga;
    }

    public List<String> getUpList() {
        return upList;
    }

    public void setUpList(List<String> upList) {
        Config.upList = upList;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        Config.platform = platform;
    }

    public static Config getInstance(){
        return CONFIG;
    }
    private Config(){}

    public String getAutoBiCoin() {
        return autoBiCoin;
    }

    public void setAutoBiCoin(String autoBiCoin) {
        Config.autoBiCoin = autoBiCoin;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        Config.coin = coin;
    }

    public boolean isGift() {
        return gift;
    }

    public void setGift(boolean gift) {
        Config.gift = gift;
    }

    public boolean isS2c() {
        return s2c;
    }

    public void setS2c(boolean s2c) {
        Config.s2c = s2c;
    }

}
